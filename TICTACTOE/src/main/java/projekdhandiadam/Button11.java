
package projekdhandiadam;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Button11 extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    public Button11() {
        initComponents();
    }

    private void gameScore()
    {
        Playerxxx.setText(String.valueOf(xCount));
        Playerooo.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }
        else {
        startGame = "X";
        }
    }
    
    private void WinningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        //X Coding
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic tacto",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
        }
        
        
            if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic Tac to",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
        }
        
               if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic Tac to",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
                       if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic Tac to",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
                       
          if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic Tac to",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
        }
              if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic Tac to",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
              if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic Tac to",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
              
             if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win ","Tic Tac to",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
             //O CODING
          if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
          {
              JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              txtbtn1.setBackground(Color.GREEN);
              txtbtn2.setBackground(Color.GREEN);
              txtbtn3.setBackground(Color.GREEN);
              
          }
          if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
          {
          
               JOptionPane.showMessageDialog(this,"Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
               txtbtn4.setBackground(Color.GREEN);
               txtbtn5.setBackground(Color.GREEN);
               txtbtn6.setBackground(Color.GREEN);
               
          
          }
         if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
         {
               JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
               txtbtn7.setBackground(Color.GREEN);
               txtbtn8.setBackground(Color.GREEN);
               txtbtn9.setBackground(Color.GREEN);
         
         }
         
       if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
           txtbtn1.setBackground(Color.GREEN);
           txtbtn5.setBackground(Color.GREEN);
           txtbtn9.setBackground(Color.GREEN);
       }
      if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
      {
          JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn3.setBackground(Color.GREEN);
          txtbtn5.setBackground(Color.GREEN);
          txtbtn7.setBackground(Color.GREEN);
      }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradient2 = new projekdhandiadam.Gradient();
        gradient3 = new projekdhandiadam.Gradient();
        panelRound11 = new projekdhandiadam.ROUND();
        jLabel1 = new javax.swing.JLabel();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtriset = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtExit = new javax.swing.JButton();
        panelRound12 = new projekdhandiadam.ROUND();
        playero = new javax.swing.JLabel();
        Playerxxx = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        Playerooo = new javax.swing.JLabel();
        txtbtn10 = new javax.swing.JButton();
        txtbtn11 = new javax.swing.JButton();
        txtbtn12 = new javax.swing.JButton();
        txtbtn13 = new javax.swing.JButton();
        txtbtn14 = new javax.swing.JButton();
        txtbtn15 = new javax.swing.JButton();
        txtbtn16 = new javax.swing.JButton();
        txtbtn17 = new javax.swing.JButton();
        txtbtn18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout gradient2Layout = new javax.swing.GroupLayout(gradient2);
        gradient2.setLayout(gradient2Layout);
        gradient2Layout.setHorizontalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        gradient2Layout.setVerticalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gradient3.setToolTipText("");
        gradient3.setColorEnd(new java.awt.Color(0, 255, 255));
        gradient3.setColorStart(new java.awt.Color(0, 204, 153));

        panelRound11.setRoundBottomLeft(50);
        panelRound11.setRoundBottomRight(50);
        panelRound11.setRoundTopLeft(50);
        panelRound11.setRoundTopRight(50);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel1.setText("XOXO");

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound11Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        panelRound11Layout.setVerticalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtbtn3.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtriset.setBackground(new java.awt.Color(0, 51, 255));
        txtriset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtriset.setText("RESET");
        txtriset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrisetActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtExit.setBackground(new java.awt.Color(255, 102, 0));
        txtExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtExit.setText("EXIT");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        panelRound12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 153, 153)));
        panelRound12.setRoundBottomLeft(45);
        panelRound12.setRoundBottomRight(45);
        panelRound12.setRoundTopLeft(45);
        panelRound12.setRoundTopRight(45);

        playero.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        playero.setText("Player O:");

        Playerxxx.setBackground(new java.awt.Color(0, 153, 153));
        Playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Playerxxx.setForeground(new java.awt.Color(0, 153, 153));
        Playerxxx.setText("xxxxxxxxxx");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        playerx.setText("Player X:");

        Playerooo.setBackground(new java.awt.Color(0, 153, 153));
        Playerooo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Playerooo.setForeground(new java.awt.Color(0, 153, 153));
        Playerooo.setText("xxxxxxxxxx");

        javax.swing.GroupLayout panelRound12Layout = new javax.swing.GroupLayout(panelRound12);
        panelRound12.setLayout(panelRound12Layout);
        panelRound12Layout.setHorizontalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Playerxxx)
                    .addComponent(Playerooo))
                .addGap(71, 71, 71))
        );
        panelRound12Layout.setVerticalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        txtbtn10.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn10.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn10ActionPerformed(evt);
            }
        });

        txtbtn11.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn11.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn11ActionPerformed(evt);
            }
        });

        txtbtn12.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn12.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn12ActionPerformed(evt);
            }
        });

        txtbtn13.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn13.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn13ActionPerformed(evt);
            }
        });

        txtbtn14.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn14.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn14ActionPerformed(evt);
            }
        });

        txtbtn15.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn15.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn15ActionPerformed(evt);
            }
        });

        txtbtn16.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn16.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn16ActionPerformed(evt);
            }
        });

        txtbtn17.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn17.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn17ActionPerformed(evt);
            }
        });

        txtbtn18.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn18.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn18ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout gradient3Layout = new javax.swing.GroupLayout(gradient3);
        gradient3.setLayout(gradient3Layout);
        gradient3Layout.setHorizontalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(478, Short.MAX_VALUE))
            .addGroup(gradient3Layout.createSequentialGroup()
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradient3Layout.createSequentialGroup()
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbtn16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(gradient3Layout.createSequentialGroup()
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gradient3Layout.createSequentialGroup()
                                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gradient3Layout.createSequentialGroup()
                                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(gradient3Layout.createSequentialGroup()
                                                .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(gradient3Layout.createSequentialGroup()
                                                .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3)))))
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(txtbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addComponent(txtriset, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        gradient3Layout.setVerticalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExit)
                            .addComponent(txtriset)))
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtbtn13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(txtbtn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        gradient3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Apakah Kamu Yakin Ingin Keluar?",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_txtExitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
       
         txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn1.setForeground(Color.RED);
        }
        else {
        txtbtn1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
         txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn2.setForeground(Color.RED);
        }
        else {
        txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
         txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn3.setForeground(Color.RED);
        }
        else {
        txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
         txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn4.setForeground(Color.RED);
        }
        else {
        txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
          txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn5.setForeground(Color.RED);
        }
        else {
        txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn6.setForeground(Color.RED);
        }
        else {
        txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn7.setForeground(Color.RED);
        }
        else {
        txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
         txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn8.setForeground(Color.RED);
        }
        else {
        txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
       txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn9.setForeground(Color.RED);
        }
        else {
        txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtrisetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrisetActionPerformed
      txtbtn1.setText(null);
      txtbtn2.setText(null);
      txtbtn3.setText(null);
      
      txtbtn4.setText(null);
      txtbtn5.setText(null);
      txtbtn6.setText(null);
      
      txtbtn7.setText(null);
      txtbtn8.setText(null);
      txtbtn9.setText(null);
      
      txtbtn1.setBackground(Color.getHSBColor(240, 100, 39));
      txtbtn2.setBackground(Color.getHSBColor(240, 100, 39));
      txtbtn3.setBackground(Color.getHSBColor(240, 100, 39));
      
      txtbtn4.setBackground(Color.getHSBColor(240, 100, 39));
      txtbtn5.setBackground(Color.getHSBColor(240, 100, 39));
      txtbtn6.setBackground(Color.getHSBColor(240, 100, 39));
      
      txtbtn7.setBackground(Color.getHSBColor(240, 100, 39));
      txtbtn8.setBackground(Color.getHSBColor(240, 100, 39));
      txtbtn9.setBackground(Color.getHSBColor(240, 100, 39));
    }//GEN-LAST:event_txtrisetActionPerformed

    private void txtbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn10ActionPerformed

    private void txtbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn11ActionPerformed

    private void txtbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn12ActionPerformed

    private void txtbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn13ActionPerformed

    private void txtbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn14ActionPerformed

    private void txtbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn15ActionPerformed

    private void txtbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn16ActionPerformed

    private void txtbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn17ActionPerformed

    private void txtbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn18ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Button11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Playerooo;
    private javax.swing.JLabel Playerxxx;
    private projekdhandiadam.Gradient gradient2;
    private projekdhandiadam.Gradient gradient3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private projekdhandiadam.ROUND panelRound11;
    private projekdhandiadam.ROUND panelRound12;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtExit;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn10;
    private javax.swing.JButton txtbtn11;
    private javax.swing.JButton txtbtn12;
    private javax.swing.JButton txtbtn13;
    private javax.swing.JButton txtbtn14;
    private javax.swing.JButton txtbtn15;
    private javax.swing.JButton txtbtn16;
    private javax.swing.JButton txtbtn17;
    private javax.swing.JButton txtbtn18;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtriset;
    // End of variables declaration//GEN-END:variables
}
