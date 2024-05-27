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
        jLabel1 = new javax.swing.JLabel();
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

        deleteBtn.setBackground(new java.awt.Color(242, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("Delete");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setMinimumSize(new java.awt.Dimension(1300, 590));
        setSize(new java.awt.Dimension(1300, 590));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Customers list");

        clientListeContainer.setBorder(null);

        clientListe.setLayout(new java.awt.GridLayout(0, 7, 2, 2));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Account number");
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
        jLabel2.setText("Name");
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
        jLabel4.setText("Firstname");
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
        jLabel5.setText("Phone");
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

        addBtn.setText("Add");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientListeContainer)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 1166, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientListeContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        JFrame addFrame = new JFrame("Add a Client");

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

        String numCompte = generateRandomAccountNumber(8);

        panel.add(new JLabel("Account: " + numCompte));
        panel.add(new JLabel("Name:"));
        panel.add(txtNom);
        panel.add(new JLabel("Firstname:"));
        panel.add(txtPrenoms);
        panel.add(new JLabel("Phone:"));
        panel.add(txtTel);
        panel.add(new JLabel("Email:"));
        panel.add(txtMail);

        JButton confirmAddBtn = new JButton("Add");
        confirmAddBtn.addActionListener(saveEvt -> {
            String updatedNom = txtNom.getText();
            String updatedPrenoms = txtPrenoms.getText();
            String updatedTel = txtTel.getText();
            String updatedMail = txtMail.getText();

            boolean addSuccess = clientClass.addClient(numCompte, updatedNom, updatedPrenoms, updatedTel, updatedMail);
            if (addSuccess) {
                JOptionPane.showMessageDialog(addFrame, "Client added successfully!");

                addFrame.dispose();

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        Client clientJFrame = new Client();
                        clientJFrame.setVisible(true);
                        clientJFrame.ListerClients();
                    }
                });
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(addFrame, "Failed to add client.");
            }
        });

        panel.add(new JLabel());
        panel.add(confirmAddBtn);

        addFrame.add(panel);
        addFrame.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    public void ListerClients() {
        try {
            ClientClass clientClass = new ClientClass();
            ResultSet rs = clientClass.liste();

            while (rs.next()) {
                String numCompte = rs.getString("num_compte");
                String nom = rs.getString("nom");
                String prenoms = rs.getString("prenoms");
                String tel = rs.getString("tel");
                String mail = rs.getString("mail");
                int clientId = rs.getInt("id");

                JLabel lblNumCompte = new JLabel(numCompte);
                JLabel lblNom = new JLabel(nom);
                JLabel lblPrenoms = new JLabel(prenoms);
                JLabel lblTel = new JLabel(tel);
                JLabel lblMail = new JLabel(mail);

                JButton btnDelete = new JButton("Delete");
                JButton btnUpdate = new JButton("Modify");

                btnDelete.addActionListener(evt -> {
                    int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete this customer?", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
                            JOptionPane.showMessageDialog(null, "Couldn't delete customer");
                        }
                    }
                });

                btnUpdate.addActionListener(evt -> {
                    JFrame updateFrame = new JFrame("Update Client");
                    updateFrame.setSize(400, 300);
                    updateFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JPanel panel = new JPanel();
                    panel.setLayout(new GridLayout(0, 1));
                    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                    JTextField txtNom = new JTextField(nom);
                    JTextField txtPrenoms = new JTextField(prenoms);
                    JTextField txtTel = new JTextField(tel);
                    JTextField txtMail = new JTextField(mail);

                    panel.add(new JLabel("Accunt:" + numCompte));
                    panel.add(new JLabel("Name:"));
                    panel.add(txtNom);
                    panel.add(new JLabel("Firstname:"));
                    panel.add(txtPrenoms);
                    panel.add(new JLabel("Phone:"));
                    panel.add(txtTel);
                    panel.add(new JLabel("Email:"));
                    panel.add(txtMail);

                    JButton btnSave = new JButton("Save");
                    btnSave.addActionListener(saveEvt -> {
                        String updatedNom = txtNom.getText();
                        String updatedPrenoms = txtPrenoms.getText();
                        String updatedTel = txtTel.getText();
                        String updatedMail = txtMail.getText();

                        boolean updateSuccess = clientClass.updateClient(clientId, updatedNom, updatedPrenoms, updatedTel, updatedMail);
                        if (updateSuccess) {
                            JOptionPane.showMessageDialog(updateFrame, "Client details updated successfully!");

                            lblNom.setText(updatedNom);
                            lblPrenoms.setText(updatedPrenoms);
                            lblTel.setText(updatedTel);
                            lblMail.setText(updatedMail);

                            clientListe.revalidate();
                            clientListe.repaint();

                            updateFrame.dispose();
                        } else {
                            JOptionPane.showMessageDialog(updateFrame, "Failed to update client details.");
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String generateRandomAccountNumber(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            accountNumber.append(characters.charAt(random.nextInt(characters.length())));
        }
        return accountNumber.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel clientListe;
    private javax.swing.JScrollPane clientListeContainer;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
