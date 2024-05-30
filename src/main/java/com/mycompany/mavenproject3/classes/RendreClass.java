/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manda
 */
public class RendreClass {

    public boolean rembourser(String numCompte, int solde, int montant, String numPret, boolean allPaid, String numRendu, int reste) {
        try (Connection conn = DBConnect.getConnection()) {
            try (PreparedStatement updateSoldeStmt = conn.prepareStatement("UPDATE client SET solde=? WHERE num_compte=?")) {
                updateSoldeStmt.setInt(1, solde);
                updateSoldeStmt.setString(2, numCompte);

                int rowsAffected = updateSoldeStmt.executeUpdate();

                if (rowsAffected > 0) {
                    String situation = allPaid ? "Tout payé" : "En partie payé";

                    try (PreparedStatement insererPreterStmt = conn.prepareStatement("UPDATE rendre SET situation = ?, rest_paye = ? WHERE num_rendu = ?")) {
                        insererPreterStmt.setString(1, situation);
                        insererPreterStmt.setInt(2, reste);
                        insererPreterStmt.setString(3, numRendu);

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
    
    public int reste(String numPret) {
        ResultSet resultSet = null;
        Connection conn = null;
        PreparedStatement statement = null;
        int value = 0;

        try {
            conn = DBConnect.getConnection();
            String sql = "SELECT * FROM preterWHERE num_pret = '" + numPret + "'";
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();
            resultSet.next();
            value = resultSet.getInt("rest_paye");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return value;
    }
}
