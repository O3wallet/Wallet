/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.o3.bitcoin.ui.dialogs.screens;

import com.o3.bitcoin.model.manager.ConfigManager;
import com.o3.bitcoin.util.seed.SeedGeneratorUtils;
import com.o3.bitcoin.model.manager.WalletManager;
import com.o3.bitcoin.ui.component.XButtonFactory;
import com.o3.bitcoin.ui.dialogs.DlgRestoreWallet;
import com.o3.bitcoin.util.ResourcesProvider;
import com.o3.bitcoin.util.ResourcesProvider.Colors;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.swing.JFileChooser;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.Wallet;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.TestNet3Params;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author
 */
public class PnlRestoreWalletScreen extends javax.swing.JPanel {

    private static final Logger logger = LoggerFactory.getLogger(PnlRestoreWalletScreen.class);
    private DlgRestoreWallet dlgRestoreWallet;

    /**
     * Creates new form PnlCreateWalletScreen
     *
     * @param dlgRestoreWallet
     */
    public PnlRestoreWalletScreen(DlgRestoreWallet dlgRestoreWallet) {
        initComponents();
        this.dlgRestoreWallet = dlgRestoreWallet;
        setup();
    }

    private void setup() {
        XButtonFactory.themedButton(btnBrowseLocation)
                .color(Color.WHITE)
                .background(Colors.NAV_MENU_DASHBOARD_COLOR);
        XButtonFactory.themedButton(btnBrowseWalletFile)
                .color(Color.WHITE)
                .background(Colors.NAV_MENU_DASHBOARD_COLOR);

        txtLocation.setText(WalletManager.DEFAULT_WALLET_ROOT);
        rdoMainNet.setEnabled(WalletManager.get().isEmpty());
        rdoTestNet.setEnabled(WalletManager.get().isEmpty());
        rdoMainNet.setSelected(ConfigManager.config().getDefaultNetwork().toLowerCase().contains("main"));
        rdoTestNet.setSelected(!ConfigManager.config().getDefaultNetwork().toLowerCase().contains("main"));
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

        btnGroupBitcoinNetwork = new javax.swing.ButtonGroup();
        lblWalletName = new javax.swing.JLabel();
        txtWalletName = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnBrowseLocation = new javax.swing.JButton();
        lblPassphrases = new javax.swing.JLabel();
        txtPassphrase = new javax.swing.JPasswordField();
        lblConfirmPassphrase = new javax.swing.JLabel();
        txtConfirmPassphrase = new javax.swing.JPasswordField();
        lblSeed = new javax.swing.JLabel();
        lblPassphraseNote = new javax.swing.JLabel();
        lblBitcoinNetwork = new javax.swing.JLabel();
        pnlBitcoinNetwork = new javax.swing.JPanel();
        rdoMainNet = new javax.swing.JRadioButton();
        rdoTestNet = new javax.swing.JRadioButton();
        pnlImportOptions = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        pnlWalletSeed = new javax.swing.JPanel();
        scrollpane = new javax.swing.JScrollPane();
        txtSeed = new javax.swing.JTextArea();
        pnlCreationDate = new javax.swing.JPanel();
        lblCreationDate = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        pnlWalletFile = new javax.swing.JPanel();
        txtWalletFile = new javax.swing.JTextField();
        btnBrowseWalletFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        lblWalletName.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        lblWalletName.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblWalletName.setText("Wallet Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblWalletName, gridBagConstraints);

        txtWalletName.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        txtWalletName.setForeground(Color.BLACK);
        txtWalletName.setPreferredSize(new java.awt.Dimension(275, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtWalletName, gridBagConstraints);

        lblLocation.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        lblLocation.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblLocation.setText("Location:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblLocation, gridBagConstraints);

        txtLocation.setEditable(false);
        txtLocation.setFont(ResourcesProvider.Fonts.BOLD_SMALL_FONT);
        txtLocation.setForeground(Color.BLACK);
        txtLocation.setText("<Location>");
        txtLocation.setPreferredSize(new java.awt.Dimension(275, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtLocation, gridBagConstraints);

        btnBrowseLocation.setText("...");
        btnBrowseLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseLocationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        add(btnBrowseLocation, gridBagConstraints);

        lblPassphrases.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        lblPassphrases.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblPassphrases.setText("Passphrase:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblPassphrases, gridBagConstraints);

        txtPassphrase.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        txtPassphrase.setForeground(Color.BLACK);
        txtPassphrase.setPreferredSize(new java.awt.Dimension(275, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtPassphrase, gridBagConstraints);

        lblConfirmPassphrase.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        lblConfirmPassphrase.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblConfirmPassphrase.setText("Confirm Passphrase:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblConfirmPassphrase, gridBagConstraints);

        txtConfirmPassphrase.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        txtConfirmPassphrase.setForeground(Color.BLACK);
        txtConfirmPassphrase.setPreferredSize(new java.awt.Dimension(275, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtConfirmPassphrase, gridBagConstraints);

        lblSeed.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        lblSeed.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblSeed.setText("Restore Wallet using:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblSeed, gridBagConstraints);

        lblPassphraseNote.setFont(ResourcesProvider.Fonts.BOLD_SMALL_FONT);
        lblPassphraseNote.setForeground(ResourcesProvider.Colors.NAV_MENU_DASHBOARD_COLOR);
        lblPassphraseNote.setText("(Passphrase is optional and can be left empty.)");
        lblPassphraseNote.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 15, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(1, 5, 1, 5);
        add(lblPassphraseNote, gridBagConstraints);

        lblBitcoinNetwork.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        lblBitcoinNetwork.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblBitcoinNetwork.setText("Bitcoin Network:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblBitcoinNetwork, gridBagConstraints);

        pnlBitcoinNetwork.setOpaque(false);
        pnlBitcoinNetwork.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnGroupBitcoinNetwork.add(rdoMainNet);
        rdoMainNet.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        rdoMainNet.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        rdoMainNet.setText("Main Net");
        rdoMainNet.setOpaque(false);
        pnlBitcoinNetwork.add(rdoMainNet);

        btnGroupBitcoinNetwork.add(rdoTestNet);
        rdoTestNet.setFont(ResourcesProvider.Fonts.DEFAULT_HEADING_FONT);
        rdoTestNet.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        rdoTestNet.setText("Test Net");
        rdoTestNet.setOpaque(false);
        pnlBitcoinNetwork.add(rdoTestNet);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pnlBitcoinNetwork, gridBagConstraints);

        pnlImportOptions.setOpaque(false);
        pnlImportOptions.setLayout(new java.awt.BorderLayout());

        pnlWalletSeed.setLayout(new java.awt.BorderLayout());

        txtSeed.setColumns(10);
        txtSeed.setFont(ResourcesProvider.Fonts.BOLD_LARGE_FONT);
        txtSeed.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        txtSeed.setLineWrap(true);
        txtSeed.setRows(5);
        txtSeed.setWrapStyleWord(true);
        scrollpane.setViewportView(txtSeed);

        pnlWalletSeed.add(scrollpane, java.awt.BorderLayout.CENTER);

        pnlCreationDate.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        lblCreationDate.setFont(ResourcesProvider.Fonts.BOLD_SMALL_FONT);
        lblCreationDate.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        lblCreationDate.setText("Creation Date:");
        pnlCreationDate.add(lblCreationDate);

        datePicker.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        datePicker.setDate(new Date());
        datePicker.setFont(ResourcesProvider.Fonts.BOLD_SMALL_FONT);
        pnlCreationDate.add(datePicker);

        pnlWalletSeed.add(pnlCreationDate, java.awt.BorderLayout.SOUTH);

        jLabel2.setFont(ResourcesProvider.Fonts.BOLD_SMALL_FONT);
        jLabel2.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        jLabel2.setText("Enter Mnemonic Codes:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 5, 1));
        pnlWalletSeed.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        tabbedPane.addTab("Using Seed", pnlWalletSeed);

        pnlWalletFile.setOpaque(false);
        pnlWalletFile.setLayout(new java.awt.GridBagLayout());

        txtWalletFile.setEditable(false);
        txtWalletFile.setFont(ResourcesProvider.Fonts.BOLD_SMALL_FONT);
        txtWalletFile.setForeground(Color.BLACK);
        txtWalletFile.setPreferredSize(new java.awt.Dimension(275, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(1, 5, 0, 0);
        pnlWalletFile.add(txtWalletFile, gridBagConstraints);

        btnBrowseWalletFile.setText("...");
        btnBrowseWalletFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseWalletFileActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(1, 5, 0, 5);
        pnlWalletFile.add(btnBrowseWalletFile, gridBagConstraints);

        jLabel1.setFont(ResourcesProvider.Fonts.BOLD_SMALL_FONT);
        jLabel1.setForeground(ResourcesProvider.Colors.DEFAULT_HEADING_COLOR);
        jLabel1.setText("Select Wallet File:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlWalletFile.add(jLabel1, gridBagConstraints);

        tabbedPane.addTab("Using File", pnlWalletFile);

        pnlImportOptions.add(tabbedPane, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pnlImportOptions, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseLocationActionPerformed
        JFileChooser jc = new JFileChooser(new File(txtLocation.getText()));
        jc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jc.setMultiSelectionEnabled(false);
        int retval = jc.showOpenDialog(dlgRestoreWallet);
        if (retval == JFileChooser.APPROVE_OPTION) {
            txtLocation.setText(jc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnBrowseLocationActionPerformed

    private void btnBrowseWalletFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseWalletFileActionPerformed
        JFileChooser jc = new JFileChooser(new File(txtWalletFile.getText()));
        jc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jc.setMultiSelectionEnabled(false);
        int retval = jc.showOpenDialog(dlgRestoreWallet);
        if (retval == JFileChooser.APPROVE_OPTION) {
            txtWalletFile.setText(jc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnBrowseWalletFileActionPerformed

    public String getPassphrase() {
        return new String(txtPassphrase.getPassword());
    }

    public String getLocationPath() {
        return txtLocation.getText();
    }

    public String getWalletName() {
        return txtWalletName.getText();
    }

    public List<String> getMnemonicCodes() {
        List<String> codes = new ArrayList<>();
        codes.addAll(Arrays.asList(txtSeed.getText().split(" ")));
        return codes;
    }

    public Date getCreationDate() {
        return datePicker.getDate();
    }

    public String getWalletFile() {
        return txtWalletFile.getText().trim();
    }

    public boolean validateData() {
        if (txtWalletName.getText() == null || txtWalletName.getText().isEmpty()) {
            txtWalletName.requestFocusInWindow();
            throw new IllegalArgumentException("Wallet Name is required.");
        } else {
            if (!WalletManager.get().isUniqueWalletId(txtWalletName.getText().trim())) {
                txtWalletName.requestFocusInWindow();
                throw new IllegalArgumentException("A wallet with same name already exists.");
            }
        }
        String location = txtLocation.getText();
        if (location == null || location.isEmpty()) {
            btnBrowseLocation.requestFocusInWindow();
            throw new IllegalArgumentException("Wallet location is required.");
        }
        if (!location.endsWith(File.separator)) {
            location += File.separator;
        }
        if (WalletManager.get().isWalletLocationMarkedForDeletion(location + txtWalletName.getText().trim())) {
            btnBrowseLocation.requestFocusInWindow();
            throw new IllegalArgumentException("<html>Selected wallet location is marked for deletion. An application restart is required to make this location available for a new wallet.</html>");
        } else if (!WalletManager.get().isWalletLocationAvailable(location + txtWalletName.getText().trim())) {
            btnBrowseLocation.requestFocusInWindow();
            throw new IllegalArgumentException("Wallet location is already in use by another wallet.");
        } else {
            location = location.trim();
            File path = new File(location);
            if (!path.exists()) {
                path.mkdirs();
                if (!path.exists()) {
                    btnBrowseLocation.requestFocusInWindow();
                    throw new IllegalArgumentException("Not a valid wallet location.");
                }
            }
        }
        String passphrase = new String(txtPassphrase.getPassword());
        if (!passphrase.isEmpty()) {
            if (passphrase.length() < 5) {
                txtPassphrase.requestFocusInWindow();
                throw new IllegalArgumentException("Passphrase must be 5 characters long.");
            }
            String confirm = new String(txtConfirmPassphrase.getPassword());
            if (!Objects.equals(passphrase, confirm)) {
                txtConfirmPassphrase.requestFocusInWindow();
                throw new IllegalArgumentException("Passphrase do not match.");
            }
        }
        if (tabbedPane.getSelectedIndex() == 0) {
            String seed = txtSeed.getText().trim();
            if (seed == null || seed.isEmpty()) {
                txtSeed.requestFocusInWindow();
                throw new IllegalArgumentException("Not a valid wallet seed.");
            } else {
                List<String> codes = Arrays.asList(seed.split(" "));
                if (!new SeedGeneratorUtils().isValid(codes)) {
                    txtSeed.requestFocusInWindow();
                    throw new IllegalArgumentException("Not a valid wallet seed.");
                }
            }
            if (datePicker.getDate().after(new Date())) {
                throw new IllegalArgumentException("Not a valid wallet creation date.");
            }
        } else {
            String walletFile = txtWalletFile.getText().trim();
            if (walletFile == null || walletFile.isEmpty()) {
                btnBrowseWalletFile.requestFocusInWindow();
                throw new IllegalArgumentException("Choose a wallet file on your system to proceed.");
            } else {
                try {
                    File file = new File(walletFile);
                    Wallet wallet = Wallet.loadFromFile(file);
                    if (!wallet.getNetworkParameters().equals(ConfigManager.getActiveNetworkParams())) {
                        String error = "Wallet file is not supported with current Bitcoin Network settings [" + ConfigManager.config().getDefaultNetwork() + "].";
                        throw new IllegalArgumentException(error);
                    }
                    wallet = null;
                    file = null;
                    System.gc();
                } catch (IllegalArgumentException e) {
                    btnBrowseWalletFile.requestFocusInWindow();
                    throw e;
                } catch (Exception e) {
                    btnBrowseWalletFile.requestFocusInWindow();
                    throw new IllegalArgumentException("Not a valid wallet file.");
                }
            }
        }
        return true;
    }

    public NetworkParameters getSelectedNetwork() {
        return rdoMainNet.isSelected() ? MainNetParams.get() : TestNet3Params.get();
    }

    public boolean isRestoreFromSeed() {
        return tabbedPane.getSelectedIndex() == 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseLocation;
    private javax.swing.JButton btnBrowseWalletFile;
    private javax.swing.ButtonGroup btnGroupBitcoinNetwork;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBitcoinNetwork;
    private javax.swing.JLabel lblConfirmPassphrase;
    private javax.swing.JLabel lblCreationDate;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPassphraseNote;
    private javax.swing.JLabel lblPassphrases;
    private javax.swing.JLabel lblSeed;
    private javax.swing.JLabel lblWalletName;
    private javax.swing.JPanel pnlBitcoinNetwork;
    private javax.swing.JPanel pnlCreationDate;
    private javax.swing.JPanel pnlImportOptions;
    private javax.swing.JPanel pnlWalletFile;
    private javax.swing.JPanel pnlWalletSeed;
    private javax.swing.JRadioButton rdoMainNet;
    private javax.swing.JRadioButton rdoTestNet;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPasswordField txtConfirmPassphrase;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JPasswordField txtPassphrase;
    private javax.swing.JTextArea txtSeed;
    private javax.swing.JTextField txtWalletFile;
    private javax.swing.JTextField txtWalletName;
    // End of variables declaration//GEN-END:variables
}
