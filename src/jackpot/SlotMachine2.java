package jackpot;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class SlotMachine2 extends javax.swing.JFrame {
    //gör en array av alla symboler som ska användas.
   private int pengar=100, tripplar= 0, bet=0, dubblar= 0, win, lost, lastwin = 0, spelningar;
   private int rad1 = 0, rad2 =0, rad3 = 0; 
   
   private JButton spela;
   private JButton exit;
   private JButton betta;
   
   private JRadioButton femton;
   private JRadioButton trettio;
   private JRadioButton hundra;
   
   private JLabel vunna;
   private JLabel instruktion;
   private JLabel nummer1;
   private JLabel nummer2;
   private JLabel nummer3;
   private JLabel antaldubblar;
   private JLabel antaltripplar;
   private JLabel antalspelningar;
   private JLabel antalpengar;
   private JLabel loss;
   
   public SlotMachine2() {
       super();
       this.setSize(500, 300);
       this.setBackground (Color.gray);
      instruktion = new JLabel ("Tryck START för att börja");
      antalpengar = new JLabel ("Du har "+ pengar + " pengar att spela med.");
      spela = new JButton("START");
      spela.addActionListener (new SlotMachine2.ButtonListener());
      betta = new JButton("BET");
      betta.addActionListener (new SlotMachine2.ButtonListener());
      exit = new JButton("EXIT");
      exit.addActionListener(new SlotMachine2.ButtonListener());
      femton = new JRadioButton("15kr");
      femton.addActionListener(new SlotMachine2.ButtonListener());
      trettio = new JRadioButton("30kr");
      trettio.addActionListener(new SlotMachine2.ButtonListener());
      hundra= new JRadioButton("100kr");
      hundra.addActionListener(new SlotMachine2.ButtonListener());
      
      //3 olika nummer 
      
        nummer1 = new JLabel(""+rad1);
        nummer1.setFont (new Font("Jonte", Font.BOLD, 40));
        nummer2 = new JLabel(""+rad2);
        nummer2.setFont (new Font("Jonte", Font.BOLD, 40));
        nummer3 = new JLabel(""+rad3);
        nummer3.setFont (new Font("Jonte", Font.BOLD, 40));
        
        antaldubblar = new JLabel("Antal dubblar:" + dubblar);
        antaltripplar = new JLabel("Antal tripplar:" + tripplar);
        antalspelningar = new JLabel("Du har kört " + spelningar+" gånger.");
        vunna = new JLabel("Vunna: "+win);
        loss = new JLabel("Förlorade: "+lost);
        
       
        JPanel panel = new JPanel();
        FlowLayout layout = new FlowLayout(3); // gör en ny panel 
        this.setLayout (layout);
        this.add (instruktion);
        this.add (femton);
        this.add (trettio); 
        this.add (hundra);
        this.add (betta);
        this.add (spela);
        this.add(exit);
        this.add (antalpengar);
        add (nummer1);
        add (nummer2);
        add (nummer3);
        this.add(antaldubblar);
        this.add (antaltripplar);
        this.add (antalspelningar);
        this.add(vunna);
        this.add(loss);
        
   }
      private class ButtonListener implements ActionListener {
          @Override
          public void actionPerformed(ActionEvent event){
             String command = event.getActionCommand();
              if (command.equals("START")) {
                  if (pengar<=0) {
                    nummer3.setText("Du har för lite pengar.");
                      
                  }else{
                     pengar-=5;
                     antalpengar.setText("Antal pengar:"+pengar);
                     Gennummer();
                  }
              }
              if (command.equals("EXIT")) 
              {
              System.exit(0);
              }
              if (command.equals("BET")){
                  bet();
              }
              if (command.equals("15kr")) {
                femton.setSelected(true);
                bet= 15;
                instruktion.setText("Du har valt att satsa 15kr");
                  
              }   
              if (command.equals("30kr")) {//ss
                trettio.setSelected(true);
                bet= 30;
                instruktion.setText("Du har valt att satsa 30kr");
                  
              }
              if (command.equals("100kr")) {
                hundra.setSelected(true);
                bet= 100;
                instruktion.setText("Du har valt att satsa 100kr");
                  
              }
        
           
        }
       public void bet(){
             if (pengar<bet){
               instruktion.setText("Spelberoende?"); 
           }else if((pengar-bet)>=0){
               //Here I want it to check if you pressed 100kr, 30kr, or 15kr
               // if you pressed for example 15kr , it will take away 15 money.
               
               
               
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
               antaldubblar.setText("Antal dubblar:"+ dubblar);
               pengar+=20;
               antalpengar.setText("Antal pengar:"+pengar);
               spelningar++;
               antalspelningar.setText("Du har kört " + spelningar+" gånger.");
               win++;
               vunna.setText("Vunna:"+win);
           }
           else if (rad1 ==rad2 && rad1 ==rad3){
               tripplar++;
               antaltripplar.setText("Antal tripplar:"+tripplar);
               pengar+=75;
               antalpengar.setText("Antal pengar:"+pengar);
               spelningar++;
               antalspelningar.setText("Du har kört "+spelningar+" gånger.");
               win++;
               vunna.setText("Vunna:"+win);
           }
           else{
               spelningar++;
               antalspelningar.setText("Du har kört "+spelningar+" gånger.");
               lost++;
               loss.setText("Förlorade:"+lost);
           }  
       }
       public void resultat(){
           while(true){
            try{
               antaldubblar.setText("Antal dubblar:" + dubblar);
               
                Thread.sleep(50);
            }catch(Exception e){
                
            }
           }
       }
       
    }
      public static void main(String[] args) {
        SlotMachine2 s = new SlotMachine2();
        s.setTitle("Jontes Slotmachine");
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        s.pack();
//        s.getContentPane();
    }
   
   
}
