
package projekdhandiadam;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class DhandiGame extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    public DhandiGame() {
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
          JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
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
          
          txtbtn3.setBackground(Color.GREEN);
          txtbtn5.setBackground(Color.GREEN);
          txtbtn7.setBackground(Color.GREEN);
      }
         if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
      {
          JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          txtbtn1.setBackground(Color.GREEN);
          txtbtn4.setBackground(Color.GREEN);
          txtbtn7.setBackground(Color.GREEN);
      }
       if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
      {
          JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn2.setBackground(Color.GREEN);
          txtbtn5.setBackground(Color.GREEN);
          txtbtn8.setBackground(Color.GREEN);
      }
          if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
      {
          JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac To", JOptionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn3.setBackground(Color.GREEN);
          txtbtn6.setBackground(Color.GREEN);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        gradient3.setColorStart(new java.awt.Color(0, 204, 204));

        panelRound11.setRoundBottomLeft(50);
        panelRound11.setRoundBottomRight(50);
        panelRound11.setRoundTopLeft(50);
        panelRound11.setRoundTopRight(50);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel1.setText("Game TicTacTo");

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound11Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Playerxxx)
                    .addComponent(Playerooo))
                .addGap(71, 71, 71))
        );
        panelRound12Layout.setVerticalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound12Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout gradient3Layout = new javax.swing.GroupLayout(gradient3);
        gradient3.setLayout(gradient3Layout);
        gradient3Layout.setHorizontalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(gradient3Layout.createSequentialGroup()
                                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(gradient3Layout.createSequentialGroup()
                                .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gradient3Layout.createSequentialGroup()
                                .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gradient3Layout.createSequentialGroup()
                                        .addComponent(txtriset, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        gradient3Layout.setVerticalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradient3Layout.createSequentialGroup()
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradient3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient3Layout.createSequentialGroup()
                                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtriset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))))
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gradient3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Apakah Kamu Yakin Ingin Keluar?",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }                                       

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
         txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn1.setForeground(Color.RED);
        }
        else {
        txtbtn1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn2.setForeground(Color.RED);
        }
        else {
        txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn3.setForeground(Color.RED);
        }
        else {
        txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn4.setForeground(Color.RED);
        }
        else {
        txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
          txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn5.setForeground(Color.RED);
        }
        else {
        txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn6.setForeground(Color.RED);
        }
        else {
        txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn7.setForeground(Color.RED);
        }
        else {
        txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn8.setForeground(Color.RED);
        }
        else {
        txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn9.setForeground(Color.RED);
        }
        else {
        txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtrisetActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
    }                                        

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacTUETUE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Playerooo;
    private javax.swing.JLabel Playerxxx;
    private projekdhandiadam.Gradient gradient2;
    private projekdhandiadam.Gradient gradient3;
    private javax.swing.JLabel jLabel1;
    private projekdhandiadam.ROUND panelRound11;
    private projekdhandiadam.ROUND panelRound12;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtExit;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtriset;
    // End of variables declaration                   
}
