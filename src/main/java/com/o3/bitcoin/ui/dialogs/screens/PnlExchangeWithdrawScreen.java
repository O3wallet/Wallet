/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.o3.bitcoin.ui.dialogs.screens;

import com.o3.bitcoin.util.ResourcesProvider;

/**
 *
 * @author
 */
public class PnlExchangeWithdrawScreen extends javax.swing.JPanel {

    /**
     * Creates new form PnlExchangeWithdrawScreen
     */
    public PnlExchangeWithdrawScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblMinimumWithdrawal = new javax.swing.JLabel();
        lblMinimumWithdrawalValue = new javax.swing.JLabel();
        lblAvailableBtc = new javax.swing.JLabel();
        lblAvailableBtcValue = new javax.swing.JLabel();
        lblBitcoinAddress = new javax.swing.JLabel();
        txtWithdrawalAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setLayout(new java.awt.GridBagLayout());

        lblMinimumWithdrawal.setText("Minimum Withdrawal : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblMinimumWithdrawal, gridBagConstraints);

        lblMinimumWithdrawalValue.setText("0.001 BTC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblMinimumWithdrawalValue, gridBagConstraints);

        lblAvailableBtc.setText("Available BTC : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblAvailableBtc, gridBagConstraints);

        lblAvailableBtcValue.setText("0.01");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblAvailableBtcValue, gridBagConstraints);

        lblBitcoinAddress.setFont(ResourcesProvider.Fonts.BOLD_MEDIUM_FONT);
        lblBitcoinAddress.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblBitcoinAddress.setText("Bitcoin Address : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblBitcoinAddress, gridBagConstraints);

        txtWithdrawalAddress.setFont(ResourcesProvider.Fonts.BOLD_MEDIUM_FONT);
        txtWithdrawalAddress.setPreferredSize(new java.awt.Dimension(275, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtWithdrawalAddress, gridBagConstraints);

        lblPassword.setFont(ResourcesProvider.Fonts.BOLD_MEDIUM_FONT);
        lblPassword.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblPassword.setText("Password : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblPassword, gridBagConstraints);

        lblAmount.setFont(ResourcesProvider.Fonts.BOLD_MEDIUM_FONT);
        lblAmount.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblAmount.setText("Amount BTC : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblAmount, gridBagConstraints);

        txtAmount.setFont(ResourcesProvider.Fonts.BOLD_MEDIUM_FONT);
        txtAmount.setPreferredSize(new java.awt.Dimension(175, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtAmount, gridBagConstraints);

        txtPassword.setPreferredSize(new java.awt.Dimension(175, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtPassword, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAvailableBtc;
    private javax.swing.JLabel lblAvailableBtcValue;
    private javax.swing.JLabel lblBitcoinAddress;
    private javax.swing.JLabel lblMinimumWithdrawal;
    private javax.swing.JLabel lblMinimumWithdrawalValue;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtWithdrawalAddress;
    // End of variables declaration//GEN-END:variables
}
