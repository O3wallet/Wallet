/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.o3.bitcoin.ui.screens.about;
import com.o3.bitcoin.util.ResourcesProvider.Colors;
import com.o3.bitcoin.util.ResourcesProvider.Fonts;
import com.o3.bitcoin.util.ResourcesProvider.License;
import com.o3.bitcoin.ui.dialogs.screens.BasicScreen;
import com.o3.bitcoin.applications.PnlShapshiftIOExchangeDividerScreen;
import com.o3.bitcoin.ui.screens.exchange.PnlExchangeScreen;

/**
 *
 * @author
 */
/**
 * Class that implements About screen of UI 
 */
public class PnlAboutScreen extends javax.swing.JPanel implements BasicScreen {

    /**
     * Creates new form PnlAboutScreen
     */
    public PnlAboutScreen() {
        initComponents();
    }
    
    public void loadData() {
        PnlShapshiftIOExchangeDividerScreen.stopMarketInfoTimer();
        PnlExchangeScreen.stopTimers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLicense = new javax.swing.JLabel();
        pnlTop = new javax.swing.JPanel();
        pnlTopEdge = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        lblTop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 242, 233));
        setMinimumSize(new java.awt.Dimension(421, 540));
        setLayout(new java.awt.BorderLayout());

        lblLicense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about_top_image.png"))); // NOI18N
        lblLicense.setText(License.licenseText);
        lblLicense.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLicense.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(lblLicense, java.awt.BorderLayout.CENTER);

        pnlTop.setBackground(Colors.SCREEN_TOP_PANEL_BG_COLOR);
        pnlTop.setBorder(new javax.swing.border.MatteBorder(null));
        pnlTop.setMinimumSize(new java.awt.Dimension(86, 38));
        pnlTop.setPreferredSize(new java.awt.Dimension(1024, 50));
        pnlTop.setLayout(new java.awt.BorderLayout());

        pnlTopEdge.setBackground(Colors.NAV_MENU_ABOUT_COLOR);
        pnlTopEdge.setPreferredSize(new java.awt.Dimension(1024, 5));
        pnlTop.add(pnlTopEdge, java.awt.BorderLayout.NORTH);

        pnlTitle.setBackground(Colors.SCREEN_TOP_PANEL_BG_COLOR);
        pnlTitle.setPreferredSize(new java.awt.Dimension(84, 26));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblTop.setFont(Fonts.BOLD_SMALL_FONT);
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info_16x16.png"))); // NOI18N
        lblTop.setText("ABOUT");
        lblTop.setIconTextGap(2);
        lblTop.setMaximumSize(new java.awt.Dimension(74, 16));
        lblTop.setMinimumSize(new java.awt.Dimension(74, 16));
        pnlTitle.add(lblTop, new java.awt.GridBagConstraints());
        lblTop.getAccessibleContext().setAccessibleName("lblTitle");

        pnlTop.add(pnlTitle, java.awt.BorderLayout.EAST);
        pnlTitle.getAccessibleContext().setAccessibleName("");

        add(pnlTop, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblTop;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlTopEdge;
    // End of variables declaration//GEN-END:variables
}
