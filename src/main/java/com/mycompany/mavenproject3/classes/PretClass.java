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

    public ResultSet liste(String situation) {
        ResultSet resultSet = null;
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DBConnect.getConnection();
            String sql;
            if (situation == "tout") {
                sql = "SELECT * FROM preter";
            } else {
                sql = "SELECT * FROM preter WHERE num_pret in (SELECT num_pret FROM rendre WHERE situation = '" + situation + "') ORDER BY datepret DESC";
            }
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
}
