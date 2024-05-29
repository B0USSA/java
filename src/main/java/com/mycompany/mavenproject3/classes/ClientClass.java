package com.mycompany.mavenproject3.classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class ClientClass {

    public ResultSet liste(String searchTxt) {
        ResultSet resultSet = null;
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DBConnect.getConnection();
            String sql = "SELECT * FROM client WHERE nom like '%" + searchTxt + "%' or prenoms like '%" + searchTxt + "%' or num_compte like '%" + searchTxt + "%' ORDER BY id DESC";
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public String nomPrenoms(String numCompte) {
        ResultSet resultSet = null;
        Connection conn = null;
        PreparedStatement statement = null;
        String client = "";

        try {
            conn = DBConnect.getConnection();
            String sql = "SELECT * FROM client WHERE num_compte = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, numCompte);
            resultSet = statement.executeQuery();
            resultSet.next();
            client = resultSet.getString("nom") + " " + resultSet.getString("prenoms");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return client;
    }

    public boolean deleteById(int id) {
        try (Connection conn = DBConnect.getConnection(); PreparedStatement statement = conn.prepareStatement("DELETE FROM client WHERE id = ?")) {

            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateClient(int clientId, String updatedNom, String updatedPrenoms, String updatedTel, String updatedMail, int solde) {
        try (Connection conn = DBConnect.getConnection(); PreparedStatement statement = conn.prepareStatement("UPDATE client SET nom=?, prenoms=?, tel=?, mail=? , solde=? WHERE id=?")) {

            statement.setString(1, updatedNom);
            statement.setString(2, updatedPrenoms);
            statement.setString(3, updatedTel);
            statement.setString(4, updatedMail);
            statement.setInt(5, solde);
            statement.setInt(6, clientId);

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addClient(String numCompte, String nom, String prenoms, String tel, String mail) {
        try (Connection conn = DBConnect.getConnection(); PreparedStatement statement = conn.prepareStatement("INSERT INTO client (num_compte, nom, prenoms, tel, mail, solde) VALUES (?, ?, ?, ?, ?, 0)")) {
            statement.setString(1, numCompte);
            statement.setString(2, nom);
            statement.setString(3, prenoms);
            statement.setString(4, tel);
            statement.setString(5, mail);

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean faireUnPret(String numCompte, int solde, int montant, String numPret) {
        try (Connection conn = DBConnect.getConnection()) {
            try (PreparedStatement updateSoldeStmt = conn.prepareStatement("UPDATE client SET solde=? WHERE num_compte=?")) {
                updateSoldeStmt.setInt(1, solde);
                updateSoldeStmt.setString(2, numCompte);

                int rowsAffected = updateSoldeStmt.executeUpdate();

                if (rowsAffected > 0) {
                    Date dateAujourdhui = new java.sql.Date(System.currentTimeMillis());

                    try (PreparedStatement insererPreterStmt = conn.prepareStatement("INSERT INTO preter(num_pret, num_compte, montant_prete, datepret) VALUES (?,?,?,?)")) {
                        insererPreterStmt.setString(1, numPret);
                        insererPreterStmt.setString(2, numCompte);
                        insererPreterStmt.setInt(3, montant);
                        insererPreterStmt.setDate(4, dateAujourdhui);

                        rowsAffected = insererPreterStmt.executeUpdate();
                        return rowsAffected > 0;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean pretEnCours(String numCompte) {
        try (Connection conn = DBConnect.getConnection(); PreparedStatement checkPretStmt = conn.prepareStatement("SELECT COUNT(*) AS count FROM preter WHERE num_compte = ?")) {

            checkPretStmt.setString(1, numCompte);

            try (ResultSet result = checkPretStmt.executeQuery()) {
                if (result.next()) {
                    int nbPret = result.getInt("count");
                    return nbPret > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
