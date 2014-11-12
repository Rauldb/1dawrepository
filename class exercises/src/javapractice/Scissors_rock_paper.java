package javapractice;

import javax.swing.JOptionPane;

public class Scissors_rock_paper {

	public static void main (String[] args){
		
		String userinput=JOptionPane.showInputDialog("Enter Rock (1) , Paper (2) , or Scissors (3)");
		int userrps =Integer.parseInt(userinput);
		int cpurps = (int) (Math.random() * 2) +1 ;
		String userplay="a";
		String cpuplay="a";
		
		switch (userrps){
		case 1: userplay="Rock";
		break;
		case 2: userplay="Paper";
		break;
		case 3: userplay="Scissors";
		break;
		}
		
		switch (cpurps){
		case 1: cpuplay="Rock";
		break;
		case 2: cpuplay="Paper";
		break;
		case 3: cpuplay="Scissors";
		break;
		}
		
		System.out.println("User : " +userplay + "      CPU: " +cpuplay);
		
	
		
		
		if (userrps==cpurps) System.out.println("Draw game");
		else {
			switch(userrps){
				case 1:
					switch(cpurps){
					case 2 : System.out.println("Paper wraps rock, you lose");
					break;
					case 3 : System.out.println("Scissors cut the paper, you win");
					break;
				}
					break;
				case 2:
					switch(cpurps){
					case 1 : System.out.println("Paper wraps rock, you win");
					break;
					case 3 : System.out.println("Scissors cut the paper, you lose");
					break;
					}
					break;
				case 3:
					switch(cpurps){
					case 1 : System.out.println("Rock crushes the scissors, you lose");
					break;
					case 2 : System.out.println("Scissors cut the paper, you win");
					break;
					}
					break;
			
				
			
			}
						}
		
		
		
	}
}
