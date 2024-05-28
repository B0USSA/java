/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject3.JFrames;

import java.sql.ResultSet;
import com.mycompany.mavenproject3.classes.ClientClass;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.*;

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
        addBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        deleteBtn.setBackground(new java.awt.Color(242, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("Delete");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setMinimumSize(new java.awt.Dimension(1300, 590));
        setSize(new java.awt.Dimension(1300, 590));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(51, 51, 51));
        titleLabel.setText("Liste des clients");

        clientListeContainer.setBorder(null);

        clientListe.setLayout(new java.awt.GridLayout(0, 7, 2, 2));

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

        addBtn.setText("Ajouter");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        clientListe.add(addBtn);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 883, Short.MAX_VALUE)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(clientListeContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE)
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
                .addContainerGap(466, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(clientListeContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane3.addTab("Clients", jPanel1);

        getContentPane().add(jTabbedPane3, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Gestion de virement");
        getContentPane().add(jLabel7, java.awt.BorderLayout.PAGE_START);

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

        String numCompte = generateRandomAccountNumber(12);

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

                            clientListe.revalidate();
                            clientListe.repaint();
                        } else {
                            JOptionPane.showMessageDialog(null, "Suppresion du client échoué");
                        }
                    }
                });

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
                    panel.add(new JLabel("Solde:"));
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
                });

                clientListe.add(lblNumCompte);
                clientListe.add(lblNom);
                clientListe.add(lblPrenoms);
                clientListe.add(lblTel);
                clientListe.add(lblMail);
                clientListe.add(btnDelete);
                clientListe.add(btnUpdate);

                nbClient++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while (nbClient < 23) {
            for (int i = 0; i < 7; i++) {
                clientListe.add(new JLabel());
            }
            nbClient++;
        }
    }

    private String generateRandomAccountNumber(int length) {
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            accountNumber.append(characters.charAt(random.nextInt(characters.length())));
        }
        return accountNumber.toString();
    }

    private void refresh() {
        int notRemove = 14;
        int componentCount = clientListe.getComponentCount();

        for (int i = componentCount - 1; i >= notRemove; i--) {
            clientListe.remove(i);
        }

        clientListe.revalidate();
        clientListe.repaint();

        ListerClients();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel clientListe;
    private javax.swing.JScrollPane clientListeContainer;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
