package javapractice;

import javax.swing.JOptionPane;

public class Chinese_year {

	
	public static void main (String[] args){
		
		String year=JOptionPane.showInputDialog(" Input the year you want to check ");
		int yearnumber= Integer.parseInt(year);
		int chineseyear=yearnumber%12;
		System.out.println(yearnumber);
		System.out.println(chineseyear);
		
		switch (chineseyear){
		case 0 : System.out.println("Monkey");
		break;
		case 1 : System.out.println("Rooster");
		break;
		case 2 : System.out.println("dog");
		break;
		case 3 : System.out.println("pig");
		break;
		case 4 : System.out.println("rat");
		break;
		case 5 : System.out.println("ox");
		break;
		case 6 : System.out.println("tiger");
		break;
		case 7 : System.out.println("rabbit");
		break;
		case 8 : System.out.println("dragon");
		break;
		case 9 : System.out.println("snake");
		break;
		case 10 : System.out.println("horse");
		break;
		case 11 : System.out.println("sheep");
		break;
		
		}
		
		
		
	}
}
