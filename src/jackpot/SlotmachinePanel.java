package jackpot;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class SlotmachinePanel extends javax.swing.JFrame {
    //gör en array av alla symboler som ska användas.
   private int pengar = 100, insattapengar = 100, bet = 15, tripplar= 0, dubblar= 0, win= 0, lost= 0, lastwin = 0, spelningar;
   private int rad1 = 0, rad2 =0, rad3 = 0; 
   
   private JButton spela;
   
   private JLabel instruktion;
   private JLabel nummer1;
   private JLabel nummer2;
   private JLabel nummer3;
   private JLabel antaldubblar;
   private JLabel antaltripplar;
   private JLabel antalspelningar;
   private JLabel antalpengar;
   
   private JTextArea textArea = new JTextArea(5,20);
   
   public SlotmachinePanel(int pengar, int insattapengar,int bet, int rad1, int rad2, int rad3, int dubblar, int tripplar) {
      instruktion = new JLabel ("Tryck START för att börja");
      antalpengar = new JLabel ("Du har "+ antalpengar + " pengar att spela med.");
      spela = new JButton("START");
      spela.addActionListener (new ButtonListener());
      
      //3 olika nummer 
      
        nummer1 = new JLabel(""+rad1);
        nummer1.setFont (new Font("Jonte", Font.BOLD, 40));
        nummer2 = new JLabel(""+rad2);
        nummer2.setFont (new Font("Jonte", Font.BOLD, 40));
        nummer3 = new JLabel(""+rad3);
        nummer3.setFont (new Font("Jonte", Font.BOLD, 40));
        
        antaldubblar = new JLabel("Antal dubblar:" + dubblar);
        antaltripplar = new JLabel("Antal tripplar:" + tripplar);
        antalspelningar = new JLabel("Du har dragit i spaken " + spelningar+" ganger.");
        
        add (instruktion);
        add (antalpengar);
        add (spela);
        add (nummer1);
        add (nummer2);
        add (nummer3);
        add (antaldubblar);
        add (antaltripplar);
        add (antalspelningar);
        
        setPreferredSize (new Dimension(300,150));
        setBackground (Color.gray);
        
        
    }
   
   
   
   
   
   
  
   
   

    SlotmachinePanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gameover(){
        textArea.setText("GAME OVER");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        Spin = new java.awt.Button();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 500, 450));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 450));

        Exit.setActionCommand("Exit");
        Exit.setBackground(new java.awt.Color(200, 200, 200));
        Exit.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Exit.setLabel("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Bet");

        Spin.setBackground(new java.awt.Color(200, 200, 200));
        Spin.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Spin.setLabel("SPIN");
        Spin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpinActionPerformed(evt);
            }
        });

        jRadioButton1.setText("2k");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("40k");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("800k");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Spin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addGap(253, 253, 253))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
      System.exit(0);
       
    }//GEN-LAST:event_ExitActionPerformed

    private void SpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpinActionPerformed
       
    }//GEN-LAST:event_SpinActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("2k");
        bet = 2000;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public static void main(String args[]) 
    {
 
              try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SlotmachinePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotmachinePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotmachinePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotmachinePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            

            @Override
            public void run() {
                new SlotmachinePanel().setVisible(true);
            }
   
        });
    }
  private class ButtonListener implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent event){
           if (pengar<bet){
               instruktion.setText("Spelberoende?");
           }else if((pengar-bet)>=0){
               
               
           }

  
           
           
           
           
        }
       
       public void Gennummer(){
           Random rand = new Random();
                         
           rad1 = rand.nextInt(9)+1;
           rad2 = rand.nextInt(9)+1;
           rad3 = rand.nextInt(9)+1;
           
           nummer1.setText(""+rad1);
           nummer2.setText(""+rad2);
           nummer3.setText(""+rad3);
           
           
           
       }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Exit;
    private java.awt.Button Spin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables

}
