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
public class VirementClass {

    public boolean faireVirement(String beneficiaire, String envoyeur, int montant) {
        Date dateAujourdhui = new java.sql.Date(System.currentTimeMillis());
        ClientClass clientClass = new ClientClass(); 
        try (Connection conn = DBConnect.getConnection(); PreparedStatement statement = conn.prepareStatement("INSERT INTO virement(envoyeur, beneficiaire, nom_env, nom_ben, montant, date_transfert) VALUES (?,?,?,?,?,?)")) {
            statement.setString(1, envoyeur);
            statement.setString(2, beneficiaire);
            statement.setString(3, clientClass.nomPrenoms(envoyeur));
            statement.setString(4, clientClass.nomPrenoms(beneficiaire));
            statement.setInt(5, montant);
            statement.setDate(6, dateAujourdhui);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                PreparedStatement updateEnvSolde = conn.prepareStatement("UPDATE client SET solde=solde - ? WHERE num_compte = ?");
                updateEnvSolde.setInt(1, montant);
                updateEnvSolde.setString(2, envoyeur);

                rowsAffected = updateEnvSolde.executeUpdate();
                if (rowsAffected > 0) {
                    PreparedStatement updateBenefSolde = conn.prepareStatement("UPDATE client SET solde=solde + ? WHERE num_compte = ?");
                    updateBenefSolde.setInt(1, montant);
                    updateBenefSolde.setString(2, beneficiaire);

                    rowsAffected = updateBenefSolde.executeUpdate();

                    return rowsAffected > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public ResultSet liste() {
        ResultSet resultSet = null;
        Connection conn;
        PreparedStatement statement;

        try {
            conn = DBConnect.getConnection();
            String sql = "SELECT * FROM virement ORDER BY id DESC";
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
}
