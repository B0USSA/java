package com.mycompany.mavenproject3.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientClass {

    public ResultSet liste() {
        ResultSet resultSet = null;
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DBConnect.getConnection();
            String sql = "SELECT * FROM client ORDER BY id DESC";
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
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

    public boolean updateClient(int clientId, String updatedNom, String updatedPrenoms, String updatedTel, String updatedMail) {
        try (Connection conn = DBConnect.getConnection(); PreparedStatement statement = conn.prepareStatement("UPDATE client SET nom=?, prenoms=?, tel=?, mail=? WHERE id=?")) {

            statement.setString(1, updatedNom);
            statement.setString(2, updatedPrenoms);
            statement.setString(3, updatedTel);
            statement.setString(4, updatedMail);
            statement.setInt(5, clientId);

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addClient(String numCompte, String nom, String prenoms, String tel, String mail) {
        try (Connection conn = DBConnect.getConnection(); PreparedStatement statement = conn.prepareStatement("INSERT INTO client (num_compte, nom, prenoms, tel, mail) VALUES (?, ?, ?, ?, ?)")) {
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
}
