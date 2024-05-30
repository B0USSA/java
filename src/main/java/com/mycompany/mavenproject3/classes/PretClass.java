/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manda
 */
public class PretClass {

    public ResultSet liste(String situation, String search) {
        ResultSet resultSet = null;
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DBConnect.getConnection();
            String sql;

            if ("Tout".equals(situation)) {
                sql = "SELECT p.*, r.* FROM preter p, rendre r WHERE p.num_compte IN "
                        + "(SELECT num_compte FROM client WHERE nom LIKE ? OR "
                        + "prenoms LIKE ?) AND p.num_pret = r.num_pret ORDER BY p.id DESC";
            } else {
                sql = "SELECT p.*, r.* FROM preter p, rendre r WHERE p.num_compte IN "
                        + "(SELECT num_compte FROM client WHERE nom LIKE ? OR "
                        + "prenoms LIKE ?) AND p.num_pret = r.num_pret AND r.situation = ? ORDER BY p.id DESC";
            }

            statement = conn.prepareStatement(sql);

            String searchPattern = "%" + search + "%";
            statement.setString(1, searchPattern);
            statement.setString(2, searchPattern);

            if (!"Tout".equals(situation)) {
                statement.setString(3, situation);
            }

            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public int Benefice() {
        ResultSet resultSet;
        Connection conn;
        PreparedStatement statement;
        int gain = 0;

        try {
            conn = DBConnect.getConnection();
            String sql = "SELECT SUM(montant_prete) AS somme FROM preter";
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();
            resultSet.next();
            gain = resultSet.getInt("somme") / 10;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return gain;
    }
}
