package jackpot;
import java.util.Random;
import java.util.Scanner;
public class Jackpot {
	

	
    private int pengar = 0, bet = 15, win, lost;
    private double payout = 25.0, funds;
    private int rad = 7, rad2 = 7, rad3 = 7; //start värden för raderna.
    private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	



    class SpinHandler implements ActionListener{
    public void actionPerformed(Actionevent event) {
	if (pengar < bet) {
	   lblStatus.setText("<html><a href='http://www.gambleaware.co.uk/'>www.gableaware.co.uk</a></html>");
  	   } else if ((pengar - bet) >= 0) 
	   {
	   pnlrad1.SetBackgronud(new java.awt.Color(255,215,0));
	   pnlrad2.SetBackground(new java.awt.Color(255,215,0));
	   pnlrad3.SetBackground(new java.awt.Color(255,215,0));
	genradnummer();
	matchcheck();
	}else
        {
	lblStatus.setText("Bet är "+bet+"kr");
   }
   }
}





    public static void main(String[] args) {
        
    }
    
}
