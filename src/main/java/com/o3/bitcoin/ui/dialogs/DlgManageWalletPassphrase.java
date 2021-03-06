/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.o3.bitcoin.ui.dialogs;

import com.o3.bitcoin.service.WalletService;
import com.o3.bitcoin.ui.ApplicationUI;
import com.o3.bitcoin.ui.component.XButtonFactory;
import com.o3.bitcoin.ui.dialogs.screens.PnlManageWalletPassphraseScreen;
import com.o3.bitcoin.util.ResourcesProvider;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author
 */
public class DlgManageWalletPassphrase extends BasicDialog {

    private static final Logger logger = LoggerFactory.getLogger(DlgManageWalletPassphrase.class);
    private final WalletService service;
    private PnlManageWalletPassphraseScreen pnlManageWalletPassphrase;
    private List<JButton> controls = new ArrayList<>();
    private boolean encrypted = false;

    /**
     * Creates new form DlgNewPayment
     *
     * @param service
     */
    public DlgManageWalletPassphrase(WalletService service) {
        super(false);
        this.service = service;
        encrypted = service.getWallet().isEncrypted();
        setupUI();
    }

    @Override
    protected JPanel getMainContentPanel() {
        if (pnlManageWalletPassphrase == null) {
            pnlManageWalletPassphrase = new PnlManageWalletPassphraseScreen(service);
        }
        return pnlManageWalletPassphrase;
    }

    @Override
    protected List<JButton> getControls() {
        controls = super.getControls();
        controls.add(0, getPaymentButton());
        return controls;
    }

    protected JButton getPaymentButton() {
        JButton passPhraseButton = new JButton(encrypted ? "Change Passphrase" : "Set Passphrase");
        XButtonFactory.themedButton(passPhraseButton)
                .background(ResourcesProvider.Colors.NAV_MENU_WALLET_COLOR)
                .color(Color.WHITE)
                .font(ResourcesProvider.Fonts.BOLD_MEDIUM_FONT);

        passPhraseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                handleChangePassphraseButtonClickEvent(e);
            }
        });
        return passPhraseButton;
    }

    protected void handleChangePassphraseButtonClickEvent(ActionEvent e) {
        try {
            boolean result = pnlManageWalletPassphrase.changePassphrase();
            if (result) {
                ApplicationUI.get().showSuccess("Wallet Passsphrase setup completed.");
                handleCloseDialogControlEvent(e);
            }
        } catch (IllegalArgumentException ex) {
            logger.error("Passphrase setup failed: {}", ex.toString(), ex);
            ApplicationUI.get().showError(ex);
        } catch (Exception ex) {
            logger.error("Passphrase setup failed: {}", ex.getMessage(), ex);
            ApplicationUI.get().showError(ex);
        }
    }

    @Override
    protected String getHeadingText() {
        return "Setup Wallet Passphrase";
    }

    @Override
    protected void handleDefaultCloseEvent(ActionEvent e) {
        handleCloseDialogControlEvent(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
