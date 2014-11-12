package javapractice;

import javax.swing.JOptionPane;


public class Addition_loops {
	
	
	public static void main (String[] args){
		
		int a= ((int) (Math.random() *10 ) );
		int b= ((int) (Math.random() *10 ) );
		int solution=a+b;
		String userinput;
		int answer;
		
		userinput=JOptionPane.showInputDialog("What's the solution for the operation " +a +"+ " +b + "?");			
		answer=Integer.parseInt(userinput);
		
		while (answer!=solution)
			{
			System.out.println("Wrong answer, try harder");
			userinput=JOptionPane.showInputDialog("What's the solution for the operation " +a +"+ " +b + "?");			
			answer=Integer.parseInt(userinput);						
			}
		System.out.println("The answer is correct");
		
		
		
		
		
	}
	

}
