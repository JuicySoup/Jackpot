package jackpot;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class SlotMachine1 extends javax.swing.JFrame {
    //gör en array av alla symboler som ska användas.
   private int pengar = 100, insattapengar = 100, tripplar= 0, bet=0, dubblar= 0, win= 0, lost= 0, lastwin = 0, spelningar;
   private int rad1 = 0, rad2 =0, rad3 = 0; 
   
   private JButton spela;
   private JButton betta;
   
   private JLabel instruktion;
   private JLabel nummer1;
   private JLabel nummer2;
   private JLabel nummer3;
   private JLabel antaldubblar;
   private JLabel antaltripplar;
   private JLabel antalspelningar;
   private JLabel antalpengar;
   
   private JTextArea textArea = new JTextArea(5,20);
   
   public SlotMachine1(int pengar, int insattapengar, int rad1, int rad2, int rad3, int dubblar, int tripplar) {
      instruktion = new JLabel ("Tryck START för att börja");
      antalpengar = new JLabel ("Du har "+ antalpengar + " pengar att spela med.");
      spela = new JButton("START");
      spela.addActionListener (new SlotMachine1.ButtonListener());
      betta = new JButton("BET");
      betta.addActionListener (new SlotMachine1.ButtonListener());
      
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
        add (betta);
        add (nummer1);
        add (nummer2);
        add (nummer3);
        add (antaldubblar);
        add (antaltripplar);
        add (antalspelningar);
        
        setPreferredSize (new Dimension(300,150));
        setBackground (Color.gray);
        
    }

    SlotMachine1() {
        throw new UnsupportedOperationException("Not supported yet."); 
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
           
           if (rad1 == rad2 || rad2 == rad3||rad3==rad1){
               dubblar++;
               
               
           }
           
           
           
       }
    }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            java.util.logging.Logger.getLogger(SlotMachine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotMachine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotMachine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotMachine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            

            @Override
            public void run() {
                new SlotmachinePanel().setVisible(true);
            }
   
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
