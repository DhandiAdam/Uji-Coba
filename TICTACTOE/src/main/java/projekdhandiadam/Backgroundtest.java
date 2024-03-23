/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekdhandiadam;

import java.awt.Color;


public class Backgroundtest extends javax.swing.JFrame {

    Color defaultColor,ClickedColor; 
    public Backgroundtest() {
        initComponents();
         defaultColor = new Color(242,242,242);
        ClickedColor = new Color(235,0,0);
        
        Border1.setBackground(defaultColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(defaultColor);
        Border4.setBackground(defaultColor);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rOUND1 = new projekdhandiadam.ROUND();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradient2 = new projekdhandiadam.Gradient();
        gradient1 = new projekdhandiadam.Gradient();
        jLabel1 = new javax.swing.JLabel();
        Border1 = new projekdhandiadam.ROUND();
        jLabel2 = new javax.swing.JLabel();
        Border2 = new projekdhandiadam.ROUND();
        Border3 = new projekdhandiadam.ROUND();
        Border4 = new projekdhandiadam.ROUND();
        jDesktopPanel = new projekdhandiadam.ROUND();

        javax.swing.GroupLayout rOUND1Layout = new javax.swing.GroupLayout(rOUND1);
        rOUND1.setLayout(rOUND1Layout);
        rOUND1Layout.setHorizontalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rOUND1Layout.setVerticalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        gradient2.setColorEnd(new java.awt.Color(0, 204, 204));
        gradient2.setColorStart(new java.awt.Color(0, 153, 153));

        gradient1.setColorEnd(new java.awt.Color(0, 255, 255));
        gradient1.setColorStart(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Documents\\projek kayla\\TICTACTOE\\src\\main\\java\\com\\mycompany\\tictactoe\\Dashop.png")); // NOI18N

        Border1.setBackground(new java.awt.Color(255, 255, 255));
        Border1.setRoundBottomLeft(50);
        Border1.setRoundTopLeft(50);
        Border1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Border1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("HOME");

        javax.swing.GroupLayout Border1Layout = new javax.swing.GroupLayout(Border1);
        Border1.setLayout(Border1Layout);
        Border1Layout.setHorizontalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        Border1Layout.setVerticalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Border2.setRoundBottomLeft(50);
        Border2.setRoundTopLeft(50);
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
            .addGap(0, 43, Short.MAX_VALUE)
        );

        Border3.setRoundBottomLeft(50);
        Border3.setRoundTopLeft(50);
        Border3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Border3Layout = new javax.swing.GroupLayout(Border3);
        Border3.setLayout(Border3Layout);
        Border3Layout.setHorizontalGroup(
            Border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Border3Layout.setVerticalGroup(
            Border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        Border4.setRoundBottomLeft(50);
        Border4.setRoundTopLeft(50);
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
            .addGap(0, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Border4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(Border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Border3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(Border4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gradient2Layout = new javax.swing.GroupLayout(gradient2);
        gradient2.setLayout(gradient2Layout);
        gradient2Layout.setHorizontalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addComponent(gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradient2Layout.setVerticalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(gradient2);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void Border1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border1MouseClicked
        HOME test = new HOME();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(test).setVisible(true);
    }//GEN-LAST:event_Border1MouseClicked

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
            java.util.logging.Logger.getLogger(Backgroundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backgroundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backgroundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backgroundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backgroundtest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private projekdhandiadam.ROUND Border1;
    private projekdhandiadam.ROUND Border2;
    private projekdhandiadam.ROUND Border3;
    private projekdhandiadam.ROUND Border4;
    private projekdhandiadam.Gradient gradient1;
    private projekdhandiadam.Gradient gradient2;
    private projekdhandiadam.ROUND jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private projekdhandiadam.ROUND rOUND1;
    // End of variables declaration//GEN-END:variables
}
