/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekdhandiadam;

import java.awt.Color;

/**
 *
 * @author ACER
 */
public class AScrollPage extends javax.swing.JFrame {

    Color defaultColor,ClickedColor; 
    public AScrollPage() {
        initComponents();
        defaultColor = new Color(13,36,51);
        ClickedColor = new Color(235,0,0);
           
        Border1.setBackground(defaultColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(defaultColor);
        Border4.setBackground(defaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradient1 = new projekdhandiadam.Gradient();
        Border1 = new projekdhandiadam.ROUND();
        Border2 = new projekdhandiadam.ROUND();
        Border3 = new projekdhandiadam.ROUND();
        Border4 = new projekdhandiadam.ROUND();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPanel = new projekdhandiadam.Gradient();
        rOUND1 = new projekdhandiadam.ROUND();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));

        gradient1.setColorEnd(new java.awt.Color(0, 255, 102));
        gradient1.setColorStart(new java.awt.Color(0, 204, 102));

        Border1.setBackground(new java.awt.Color(255, 255, 255));
        Border1.setRoundBottomLeft(35);
        Border1.setRoundTopLeft(35);
        Border1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Border1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Border1Layout = new javax.swing.GroupLayout(Border1);
        Border1.setLayout(Border1Layout);
        Border1Layout.setHorizontalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Border1Layout.setVerticalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        Border2.setRoundBottomLeft(35);
        Border2.setRoundTopLeft(35);
        Border2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Border2Layout = new javax.swing.GroupLayout(Border2);
        Border2.setLayout(Border2Layout);
        Border2Layout.setHorizontalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Border2Layout.setVerticalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        Border3.setRoundBottomLeft(35);
        Border3.setRoundTopLeft(35);
        Border3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Border3Layout = new javax.swing.GroupLayout(Border3);
        Border3.setLayout(Border3Layout);
        Border3Layout.setHorizontalGroup(
            Border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        Border3Layout.setVerticalGroup(
            Border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        Border4.setRoundBottomLeft(35);
        Border4.setRoundTopLeft(35);
        Border4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Border4Layout = new javax.swing.GroupLayout(Border4);
        Border4.setLayout(Border4Layout);
        Border4Layout.setHorizontalGroup(
            Border4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Border4Layout.setVerticalGroup(
            Border4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Border3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(Border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(Border3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(Border4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jDesktopPanel.setColorEnd(new java.awt.Color(51, 255, 204));
        jDesktopPanel.setColorStart(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout rOUND1Layout = new javax.swing.GroupLayout(rOUND1);
        rOUND1.setLayout(rOUND1Layout);
        rOUND1Layout.setHorizontalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        rOUND1Layout.setVerticalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(rOUND1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 499, Short.MAX_VALUE))
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rOUND1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jDesktopPanel);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Border1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border1MouseClicked
        XOXO xoxo = new XOXO();
        xoxo.setVisible(true);
        xoxo.pack();
        xoxo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Border1MouseClicked

    private void Border1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border1MousePressed
        Border1.setBackground(ClickedColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(defaultColor);
        Border4.setBackground(defaultColor);
    }//GEN-LAST:event_Border1MousePressed

    private void Border2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border2MousePressed
        Border1.setBackground(defaultColor);
        Border2.setBackground(ClickedColor);
        Border3.setBackground(defaultColor);
        Border4.setBackground(defaultColor);
    }//GEN-LAST:event_Border2MousePressed

    private void Border3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border3MousePressed
        Border1.setBackground(defaultColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(ClickedColor);
        Border4.setBackground(defaultColor);
    }//GEN-LAST:event_Border3MousePressed

    private void Border4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border4MousePressed
        Border1.setBackground(defaultColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(defaultColor);
        Border4.setBackground(ClickedColor);
    }//GEN-LAST:event_Border4MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AScrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AScrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AScrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AScrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AScrollPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private projekdhandiadam.ROUND Border1;
    private projekdhandiadam.ROUND Border2;
    private projekdhandiadam.ROUND Border3;
    private projekdhandiadam.ROUND Border4;
    private projekdhandiadam.Gradient gradient1;
    private projekdhandiadam.Gradient jDesktopPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private projekdhandiadam.ROUND rOUND1;
    // End of variables declaration//GEN-END:variables
}