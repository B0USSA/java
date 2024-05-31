/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject3.JFrames;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import com.mycompany.mavenproject3.classes.ClientClass;
import com.mycompany.mavenproject3.classes.PretClass;
import com.mycompany.mavenproject3.classes.RendreClass;
import com.mycompany.mavenproject3.classes.VirementClass;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Manda
 */
public class Client extends JFrame {

    /**
     * Creates new form ClientClass
     */
    public Client() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteBtn = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        clientListeContainer = new javax.swing.JScrollPane();
        clientListe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        titleLabel1 = new javax.swing.JLabel();
        clientListeContainer1 = new javax.swing.JScrollPane();
        pretListe = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        filter = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        beneficeLbl = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        titleLabel3 = new javax.swing.JLabel();
        clientListeContainer3 = new javax.swing.JScrollPane();
        virementListe = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        deleteBtn.setBackground(new java.awt.Color(242, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("Delete");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setMinimumSize(new java.awt.Dimension(1300, 590));
        setSize(new java.awt.Dimension(1300, 590));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Gestion de virements et de prêts bancaires");
        getContentPane().add(jLabel30, java.awt.BorderLayout.PAGE_START);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(51, 51, 51));
        titleLabel.setText("Liste des clients");

        clientListeContainer.setBorder(null);

        clientListe.setLayout(new java.awt.GridLayout(0, 8, 2, 2));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Compte");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setInheritsPopupMenu(false);
        jLabel3.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(0, 0));
        clientListe.add(jLabel3);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nom");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setInheritsPopupMenu(false);
        jLabel2.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(0, 0));
        clientListe.add(jLabel2);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Prénoms");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setInheritsPopupMenu(false);
        jLabel4.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));
        clientListe.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telephone");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setInheritsPopupMenu(false);
        jLabel5.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(0, 0));
        clientListe.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Email");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setInheritsPopupMenu(false);
        jLabel6.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(0, 0));
        clientListe.add(jLabel6);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setInheritsPopupMenu(false);
        jLabel8.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 0));
        clientListe.add(jLabel8);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setToolTipText("");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setInheritsPopupMenu(false);
        jLabel15.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel15.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel15.setPreferredSize(new java.awt.Dimension(0, 0));
        clientListe.add(jLabel15);

        addBtn.setText("Ajouter");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        clientListe.add(addBtn);

        jSeparator15.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator15);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator1);

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator2);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator3);

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator4);

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator5);

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator6);

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        clientListe.add(jSeparator7);

        clientListeContainer.setViewportView(clientListe);

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchBtn.setText("Rechercher");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(clientListeContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBtn)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(clientListeContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane3.addTab("Clients", jPanel1);

        titleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(51, 51, 51));
        titleLabel1.setText("Liste des prêts");

        clientListeContainer1.setBorder(null);

        pretListe.setLayout(new java.awt.GridLayout(0, 8, 2, 2));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("N° prêt");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setInheritsPopupMenu(false);
        jLabel9.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel9.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel9.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel9);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Compte");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setInheritsPopupMenu(false);
        jLabel10.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel10.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel10.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel10);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Client");
        jLabel16.setToolTipText("");
        jLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setInheritsPopupMenu(false);
        jLabel16.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel16.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel16.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel16);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Montant");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setInheritsPopupMenu(false);
        jLabel11.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel11.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel11.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel11);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Date");
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setInheritsPopupMenu(false);
        jLabel12.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel12.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel12.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel12);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Jours restants");
        jLabel14.setToolTipText("");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setInheritsPopupMenu(false);
        jLabel14.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel14.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel14.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel14);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Situation");
        jLabel29.setToolTipText("");
        jLabel29.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setInheritsPopupMenu(false);
        jLabel29.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel29.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel29.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel29);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setToolTipText("");
        jLabel28.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel28.setInheritsPopupMenu(false);
        jLabel28.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel28.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel28.setPreferredSize(new java.awt.Dimension(0, 0));
        pretListe.add(jLabel28);

        jSeparator30.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator30);

        jSeparator29.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator29);

        jSeparator16.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator16);

        jSeparator10.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator10);

        jSeparator11.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator11);

        jSeparator12.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator12);

        jSeparator13.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator13);

        jSeparator14.setForeground(new java.awt.Color(102, 102, 102));
        pretListe.add(jSeparator14);

        clientListeContainer1.setViewportView(pretListe);

        filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout", "Non payé", "En partie payé", "Tout payé" }));
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        jButton1.setText("Rechercher");

        beneficeLbl.setText("Bénéfice:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                .addComponent(beneficeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(clientListeContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel1)
                    .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(beneficeLbl))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(clientListeContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane3.addTab("Prêts", jPanel4);

        titleLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(51, 51, 51));
        titleLabel3.setText("Liste des virements");

        clientListeContainer3.setBorder(null);

        virementListe.setLayout(new java.awt.GridLayout(0, 4, 2, 2));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Envoyeur");
        jLabel22.setToolTipText("");
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setInheritsPopupMenu(false);
        jLabel22.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel22.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel22.setPreferredSize(new java.awt.Dimension(0, 0));
        virementListe.add(jLabel22);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Bénéficiaire");
        jLabel23.setToolTipText("");
        jLabel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel23.setInheritsPopupMenu(false);
        jLabel23.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel23.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel23.setPreferredSize(new java.awt.Dimension(0, 0));
        virementListe.add(jLabel23);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Montant");
        jLabel24.setToolTipText("");
        jLabel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel24.setInheritsPopupMenu(false);
        jLabel24.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel24.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel24.setPreferredSize(new java.awt.Dimension(0, 0));
        virementListe.add(jLabel24);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Date de transfert");
        jLabel25.setToolTipText("");
        jLabel25.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel25.setInheritsPopupMenu(false);
        jLabel25.setMaximumSize(new java.awt.Dimension(999999, 40));
        jLabel25.setMinimumSize(new java.awt.Dimension(0, 40));
        jLabel25.setPreferredSize(new java.awt.Dimension(0, 0));
        virementListe.add(jLabel25);

        jSeparator23.setForeground(new java.awt.Color(102, 102, 102));
        virementListe.add(jSeparator23);

        jSeparator24.setForeground(new java.awt.Color(102, 102, 102));
        virementListe.add(jSeparator24);

        jSeparator25.setForeground(new java.awt.Color(102, 102, 102));
        virementListe.add(jSeparator25);

        jSeparator26.setForeground(new java.awt.Color(102, 102, 102));
        virementListe.add(jSeparator26);

        clientListeContainer3.setViewportView(virementListe);

        jButton2.setText("Nouveau virement");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 674, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(clientListeContainer3, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel3)
                    .addComponent(jButton2))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(clientListeContainer3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane3.addTab("Virement", jPanel6);

        getContentPane().add(jTabbedPane3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        JDialog addFrame = new JDialog(this, "Ajouter un client", true);

        addFrame.setSize(400, 300);
        addFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ClientClass clientClass = new ClientClass();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField txtNom = new JTextField();
        JTextField txtPrenoms = new JTextField();
        JTextField txtTel = new JTextField();
        JTextField txtMail = new JTextField();

        String numCompte = generateRandomNumber(12);

        panel.add(new JLabel("Compte: " + numCompte));
        panel.add(new JLabel("Nom:"));
        panel.add(txtNom);
        panel.add(new JLabel("Prénoms:"));
        panel.add(txtPrenoms);
        panel.add(new JLabel("Téléphone:"));
        panel.add(txtTel);
        panel.add(new JLabel("Email:"));
        panel.add(txtMail);

        JButton confirmAddBtn = new JButton("Ajouter");
        confirmAddBtn.addActionListener(saveEvt -> {
            String updatedNom = txtNom.getText();
            String updatedPrenoms = txtPrenoms.getText();
            String updatedTel = txtTel.getText();
            String updatedMail = txtMail.getText();

            boolean addSuccess = clientClass.addClient(numCompte, updatedNom, updatedPrenoms, updatedTel, updatedMail);
            if (addSuccess) {
                JOptionPane.showMessageDialog(addFrame, "Client ajouté avec succès");

                addFrame.dispose();

                refresh();
            } else {
                JOptionPane.showMessageDialog(addFrame, "Ajout du client échoué");
            }
        });

        panel.add(new JLabel());
        panel.add(confirmAddBtn);

        addFrame.add(panel);
        addFrame.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        refresh();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        refresh();
    }//GEN-LAST:event_filterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JDialog addFrame = new JDialog(this, "Nouveau virement", true);

        addFrame.setSize(400, 300);
        addFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ClientClass clientClass = new ClientClass();
        VirementClass virementClass = new VirementClass();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField txtEnvoyeur = new JTextField();
        JTextField txtBeneficiaire = new JTextField();
        JTextField txtMontant = new JTextField();

        panel.add(new JLabel("Veuillez remplir les champs"));
        panel.add(new JLabel("Compte de l'envoyeur:"));
        panel.add(txtEnvoyeur);
        panel.add(new JLabel("Compte du bénéficiaire:"));
        panel.add(txtBeneficiaire);
        panel.add(new JLabel("Montant (Ar):"));
        panel.add(txtMontant);

        JButton confirmAddBtn = new JButton("Faire le virement");
        confirmAddBtn.addActionListener(saveEvt -> {
            String envoyeur = txtEnvoyeur.getText();
            String beneficiaire = txtBeneficiaire.getText();
            int montant = 0;

            if (!clientClass.accountExist(envoyeur) || !clientClass.accountExist(beneficiaire)) {
                JOptionPane.showMessageDialog(addFrame, "Veullez vérifier les numéros de compte");
                return;
            }

            if (envoyeur == null ? beneficiaire == null : envoyeur.equals(beneficiaire)) {
                JOptionPane.showMessageDialog(addFrame, "Veullez entrer 2 comptes differents");
                return;
            }

            try {
                montant = Integer.parseInt(txtMontant.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(addFrame, "Veullez entrer un montant valide");
                return;
            }

            if (montant <= 0) {
                JOptionPane.showMessageDialog(addFrame, "Veullez entrer un montant valide");
                return;
            }

            int soldeEnv = clientClass.solde(envoyeur);
            if (soldeEnv < montant) {
                JOptionPane.showMessageDialog(addFrame, "Le solde de l'envoyeur est insuffisant pour ce transfert");
                return;
            }

            //afficher un dialog "Voulez-vous vraiment transfer montant Ar de envoyeur(nomEnvoyeur) à bénéficiaire?
            int response = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment transfer " + montant + " Ar "
                    + "de " + envoyeur + "(" + clientClass.nomPrenoms(envoyeur) + ") "
                    + "à " + beneficiaire + "(" + clientClass.nomPrenoms(beneficiaire) + ")?", "Suppression", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                boolean addSuccess = virementClass.faireVirement(beneficiaire, envoyeur, montant);
                if (addSuccess) {
                    JOptionPane.showMessageDialog(addFrame, "Le virement a été fait avec succès");

                    addFrame.dispose();

                    refresh();
                } else {
                    JOptionPane.showMessageDialog(addFrame, "Le virement a échoué");
                }
            }
        });

        panel.add(new JLabel());
        panel.add(confirmAddBtn);

        addFrame.add(panel);
        addFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void ListerClients() {
        int nbClient = 0;
        try {
            ClientClass clientClass = new ClientClass();
            ResultSet rs = clientClass.liste(searchInput.getText());

            while (rs.next()) {
                String numCompte = rs.getString("num_compte");
                String nom = rs.getString("nom");
                String prenoms = rs.getString("prenoms");
                String tel = rs.getString("tel");
                String mail = rs.getString("mail");
                int clientId = rs.getInt("id");
                int solde = rs.getInt("solde");

                JLabel lblNumCompte = new JLabel(numCompte);
                JLabel lblNom = new JLabel(nom);
                JLabel lblPrenoms = new JLabel(prenoms);
                JLabel lblTel = new JLabel(tel);
                JLabel lblMail = new JLabel(mail);

                JButton btnDelete = new JButton("Supprimer");
                JButton btnUpdate = new JButton("Modifier");
                JButton btnLoan = new JButton("Prêt");

                // <editor-fold defaultstate="collapsed" desc="btnDelete action">                          
                btnDelete.addActionListener(evt -> {
                    int response = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer ce client?", "Suppression", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response == JOptionPane.YES_OPTION) {
                        boolean success = clientClass.deleteById(clientId);
                        if (success) {
                            clientListe.remove(lblNumCompte);
                            clientListe.remove(lblNom);
                            clientListe.remove(lblPrenoms);
                            clientListe.remove(lblTel);
                            clientListe.remove(lblMail);
                            clientListe.remove(btnDelete);
                            clientListe.remove(btnUpdate);
                            clientListe.remove(btnLoan);

                            clientListe.revalidate();
                            clientListe.repaint();
                        } else {
                            JOptionPane.showMessageDialog(null, "Suppresion du client échoué");
                        }
                    }
                });// </editor-fold> 

                // <editor-fold defaultstate="collapsed" desc="btnUpdate action">                          
                btnUpdate.addActionListener(evt -> {
                    JDialog updateFrame = new JDialog(this, "Modification", true);

                    updateFrame.setSize(400, 300);
                    updateFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JPanel panel = new JPanel();
                    panel.setLayout(new GridLayout(0, 1));
                    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                    JTextField txtNom = new JTextField(nom);
                    JTextField txtPrenoms = new JTextField(prenoms);
                    JTextField txtTel = new JTextField(tel);
                    JTextField txtMail = new JTextField(mail);
                    JTextField txtSolde = new JTextField(solde + "");

                    panel.add(new JLabel("Compte: " + numCompte));
                    panel.add(new JLabel("Nom:"));
                    panel.add(txtNom);
                    panel.add(new JLabel("Prénoms:"));
                    panel.add(txtPrenoms);
                    panel.add(new JLabel("Téléphone:"));
                    panel.add(txtTel);
                    panel.add(new JLabel("Email:"));
                    panel.add(txtMail);
                    panel.add(new JLabel("Solde (Ar):"));
                    panel.add(txtSolde);

                    JButton btnSave = new JButton("Enregister");
                    btnSave.addActionListener(saveEvt -> {
                        String updatedNom = txtNom.getText();
                        String updatedPrenoms = txtPrenoms.getText();
                        String updatedTel = txtTel.getText();
                        String updatedMail = txtMail.getText();
                        int updatedSolde;

                        try {
                            updatedSolde = Integer.parseInt(txtSolde.getText());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un solde valide");
                            return;
                        }

                        boolean updateSuccess = clientClass.updateClient(clientId, updatedNom, updatedPrenoms, updatedTel, updatedMail, updatedSolde);
                        if (updateSuccess) {
                            JOptionPane.showMessageDialog(updateFrame, "Client modifié avec succès");

                            updateFrame.dispose();

                            refresh();
                        } else {
                            JOptionPane.showMessageDialog(updateFrame, "Modification échoué");
                        }
                    });

                    panel.add(new JLabel());
                    panel.add(btnSave);

                    updateFrame.add(panel);
                    updateFrame.setVisible(true);
                });// </editor-fold> 

                // <editor-fold defaultstate="collapsed" desc="btnLoan action">                          
                btnLoan.addActionListener(evt -> {
                    boolean hasLoan = clientClass.pretEnCours(numCompte);
                    if (hasLoan) {
                        JOptionPane.showMessageDialog(this, "Ce client a dejà un prêt en cours", "Prêt", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JDialog loanFrame = new JDialog(this, "Prêt", true);

                        loanFrame.setSize(400, 300);
                        loanFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));
                        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                        JTextField txtSolde = new JTextField(solde + "");
                        JTextField txtMontant = new JTextField("0");
                        JTextField txtARendre = new JTextField("0");

                        txtSolde.setEditable(false);
                        txtARendre.setEditable(false);

                        txtMontant.getDocument().addDocumentListener(new DocumentListener() {
                            public void changedUpdate(DocumentEvent e) {
                                updateValues();
                            }

                            public void removeUpdate(DocumentEvent e) {
                                updateValues();
                            }

                            public void insertUpdate(DocumentEvent e) {
                                updateValues();
                            }

                            private void updateValues() {
                                try {
                                    int montant = Integer.parseInt(txtMontant.getText());
                                    int nouveauSolde = solde + montant;
                                    int montantARendre = montant + (int) (montant * 0.10);

                                    txtSolde.setText(String.valueOf(nouveauSolde));
                                    txtARendre.setText(String.valueOf(montantARendre));
                                } catch (NumberFormatException e) {
                                    txtSolde.setText(String.valueOf(solde));
                                    txtARendre.setText("0");
                                }
                            }
                        });

                        String numPret = generateRandomNumber(12);

                        panel.add(new JLabel("Compte: " + numCompte));
                        panel.add(new JLabel("Nom du client: " + nom + " " + prenoms));
                        panel.add(new JLabel("Prêt N° " + numPret));
                        panel.add(new JLabel("Solde après prêt (Ar):"));
                        panel.add(txtSolde);
                        panel.add(new JLabel("Montant à prêter (Ar):"));
                        panel.add(txtMontant);
                        panel.add(new JLabel("Montant à rendre (Ar):"));
                        panel.add(txtARendre);

                        JButton btnSave = new JButton("Effectuer le prêt");
                        btnSave.addActionListener(saveEvt -> {
                            int nouveauSolde;
                            int montant;
                            int reste;

                            try {
                                nouveauSolde = Integer.parseInt(txtSolde.getText());
                                montant = Integer.parseInt(txtMontant.getText());
                                reste = Integer.parseInt(txtARendre.getText());
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Veuillez entrer un montant valide");
                                return;
                            }

                            if (montant < 10000) {
                                JOptionPane.showMessageDialog(null, "Veuillez entrer un montant supérieur à 10000 Ar");
                                return;
                            }

                            boolean updateSuccess = clientClass.faireUnPret(numCompte, nouveauSolde, montant, numPret, generateRandomNumber(12), reste);
                            if (updateSuccess) {
                                JOptionPane.showMessageDialog(loanFrame, "Prêt effectué avec succès");

                                loanFrame.dispose();

                                refresh();
                            } else {
                                JOptionPane.showMessageDialog(loanFrame, "Prêt échoué");
                            }
                        });

                        panel.add(new JLabel());
                        panel.add(btnSave);

                        loanFrame.add(panel);
                        loanFrame.setVisible(true);
                    }
                });// </editor-fold> 

                clientListe.add(lblNumCompte);
                clientListe.add(lblNom);
                clientListe.add(lblPrenoms);
                clientListe.add(lblTel);
                clientListe.add(lblMail);
                clientListe.add(btnDelete);
                clientListe.add(btnUpdate);
                clientListe.add(btnLoan);

                nbClient++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        while (nbClient < 22) {
            for (int i = 0; i < 8; i++) {
                clientListe.add(new JLabel());
            }
            nbClient++;
        }
    }

    public void ListerPrets() {
        int nbPret = 0;
        try {
            PretClass pretClass = new PretClass();
            ClientClass clientClass = new ClientClass();
            RendreClass rendreClass = new RendreClass();

            beneficeLbl.setText("Bénéfice: " + pretClass.Benefice() + " Ar");

            ResultSet rs;

            String situation;
            situation = switch (filter.getSelectedIndex()) {
                case 0 ->
                    "Tout";
                case 1 ->
                    "Non payé";
                case 2 ->
                    "En partie payé";
                default ->
                    "Tout payé";
            };

            rs = pretClass.liste(situation, jTextField1.getText());

            Date dateAujourdui = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            while (rs.next()) {
                String numPret = rs.getString("num_pret");
                String numCompte = rs.getString("num_compte");
                String client = clientClass.nomPrenoms(numCompte);
                int montant = rs.getInt("montant_prete");
                String datePretStr = rs.getString("datepret");
                String situationStr = rs.getString("situation");
                String numRendu = rs.getString("num_rendu");
                int aRendre = rs.getInt("rest_paye");

                Date datePret = dateFormat.parse(datePretStr);
                long diffInMillies = Math.abs(dateAujourdui.getTime() - datePret.getTime());
                long daysDiff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                long joursRestants = 180 - daysDiff;

                JLabel lblNumPret = new JLabel(numPret);
                JLabel lblNumCompte = new JLabel(numCompte);
                JLabel lblClient = new JLabel(client);
                JLabel lblMontant = new JLabel(montant + " Ar");
                JLabel lblDatePret = new JLabel(datePretStr);
                JLabel lblJoursRestants = new JLabel(joursRestants + " jours");
                JLabel lblSituation = new JLabel(situationStr);
                JLabel lblDatePaye = new JLabel();
                JButton rendreBtn = new JButton("Rembourser");

                // <editor-fold defaultstate="collapsed" desc="rendreBtn action">                          
                rendreBtn.addActionListener(evt -> {
                    JDialog rendreFrame = new JDialog(this, "Remboursement", true);

                    rendreFrame.setSize(400, 300);
                    rendreFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JPanel panel = new JPanel();
                    panel.setLayout(new GridLayout(0, 1));
                    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                    int solde = clientClass.solde(numCompte);

                    JTextField txtSolde = new JTextField(solde + "");
                    JTextField txtMontant = new JTextField("0");
                    JTextField txtARendre = new JTextField(aRendre + "");

                    txtSolde.setEditable(false);
                    txtARendre.setEditable(false);

                    txtMontant.getDocument().addDocumentListener(new DocumentListener() {
                        public void changedUpdate(DocumentEvent e) {
                            updateValues();
                        }

                        public void removeUpdate(DocumentEvent e) {
                            updateValues();
                        }

                        public void insertUpdate(DocumentEvent e) {
                            updateValues();
                        }

                        private void updateValues() {
                            try {
                                int montant = Integer.parseInt(txtMontant.getText());
                                int montantARendre = aRendre - montant;
                                int nouveauSolde = solde - montant;

                                txtSolde.setText(String.valueOf(nouveauSolde));
                                txtARendre.setText(String.valueOf(montantARendre));
                            } catch (NumberFormatException e) {
                                txtSolde.setText(String.valueOf(solde));
                                txtARendre.setText(aRendre + "");
                            }
                        }
                    });

                    panel.add(new JLabel("Compte: " + numCompte));
                    panel.add(new JLabel("Nom du client: " + client));
                    panel.add(new JLabel("Prêt N° " + numPret));
                    panel.add(new JLabel("Solde après remboursement (Ar):"));
                    panel.add(txtSolde);
                    panel.add(new JLabel("Montant à rembourser (Ar):"));
                    panel.add(txtMontant);
                    panel.add(new JLabel("Reste à rembourser (Ar):"));
                    panel.add(txtARendre);

                    JButton btnSave = new JButton("Effectuer le remboursement");
                    btnSave.addActionListener(saveEvt -> {
                        int nouveauSolde;
                        int montantRendu;
                        int resteAPayer;

                        try {
                            nouveauSolde = Integer.parseInt(txtSolde.getText());
                            montantRendu = Integer.parseInt(txtMontant.getText());
                            resteAPayer = Integer.parseInt(txtARendre.getText());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un montant valide");
                            return;
                        }

                        if (montantRendu == 0) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un montant supérieur à 0 Ar");
                            return;
                        }

                        if (montantRendu > solde) {
                            JOptionPane.showMessageDialog(null, "Votre solde est insuffisant pour rembourser ce montant");
                            return;
                        }

                        boolean updateSuccess = rendreClass.rembourser(numCompte, nouveauSolde, montantRendu, numPret, montantRendu >= aRendre, numRendu, resteAPayer);
                        if (updateSuccess) {
                            JOptionPane.showMessageDialog(rendreFrame, "Remboursement effectué avec succès");

                            rendreFrame.dispose();

                            refresh();
                        } else {
                            JOptionPane.showMessageDialog(rendreFrame, "Remboursement échoué");
                        }
                    });

                    panel.add(new JLabel());
                    panel.add(btnSave);

                    rendreFrame.add(panel);
                    rendreFrame.setVisible(true);
                });// </editor-fold> 

                pretListe.add(lblNumPret);
                pretListe.add(lblNumCompte);
                pretListe.add(lblClient);
                pretListe.add(lblMontant);
                pretListe.add(lblDatePret);
                pretListe.add(lblJoursRestants);
                pretListe.add(lblSituation);

                if (aRendre <= 0) {
                    pretListe.add(lblDatePaye);
                    lblJoursRestants.setText("-");
                    lblDatePaye.setText("Payé le " + rs.getString("date_rendu"));
                } else {
                    pretListe.add(rendreBtn);
                }

                nbPret++;
            }

        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }

        while (nbPret < 22) {
            for (int i = 0; i < 8; i++) {
                pretListe.add(new JLabel());
            }
            nbPret++;
        }

        pretListe.revalidate();
        pretListe.repaint();
    }

    public void ListerVirements() {
        int nbVirement = 0;
        try {
            VirementClass virementClass = new VirementClass();

            ResultSet rs;

            rs = virementClass.liste();

            while (rs.next()) {
                String envoyeur = rs.getString("envoyeur");
                String beneficiaire = rs.getString("beneficiaire");
                String montant = rs.getInt("montant") + " Ar";
                String dateTransfert = rs.getDate("date_transfert").toString();

                JLabel lblEnv = new JLabel(envoyeur);
                JLabel lblBenef = new JLabel(beneficiaire);
                JLabel lblMontant = new JLabel(montant);
                JLabel lblDate = new JLabel(dateTransfert);

                virementListe.add(lblEnv);
                virementListe.add(lblBenef);
                virementListe.add(lblMontant);
                virementListe.add(lblDate);

                nbVirement++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        while (nbVirement < 22) {
            for (int i = 0; i < 4; i++) {
                virementListe.add(new JLabel());
            }
            nbVirement++;
        }

        virementListe.revalidate();
        virementListe.repaint();
    }

    private String generateRandomNumber(int length) {
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            accountNumber.append(characters.charAt(random.nextInt(characters.length())));
        }
        return accountNumber.toString();
    }

    public void refresh() {
        int notRemove = 16;
        int componentCount = clientListe.getComponentCount();

        for (int i = componentCount - 1; i >= notRemove; i--) {
            clientListe.remove(i);
        }

        clientListe.revalidate();
        clientListe.repaint();

        ListerClients();
        
        notRemove = 16;
        componentCount = pretListe.getComponentCount();

        for (int i = componentCount - 1; i >= notRemove; i--) {
            pretListe.remove(i);
        }

        pretListe.revalidate();
        pretListe.repaint();

        ListerPrets();
        
        notRemove = 8;
        componentCount = virementListe.getComponentCount();

        for (int i = componentCount - 1; i >= notRemove; i--) {
            virementListe.remove(i);
        }

        virementListe.revalidate();
        virementListe.repaint();

        ListerVirements();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel beneficeLbl;
    private javax.swing.JPanel clientListe;
    private javax.swing.JScrollPane clientListeContainer;
    private javax.swing.JScrollPane clientListeContainer1;
    private javax.swing.JScrollPane clientListeContainer3;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> filter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pretListe;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel3;
    private javax.swing.JPanel virementListe;
    // End of variables declaration//GEN-END:variables
}
