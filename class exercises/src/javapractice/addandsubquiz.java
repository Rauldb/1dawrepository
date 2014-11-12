package javapractice;

import javax.swing.JOptionPane;

// Write a program subtraction quiz that tells the user the score, and the time used
// swap the numbers so the solution is always a positive number
// To calculate the time use the method System.currentTimeMillis()
// Output the user input (operations and his input) and a "right" or "wrong" statement
// Make the program change between subtractions and additions


public class addandsubquiz {
	
	public static void main (String[] args){
		
		long start=System.currentTimeMillis();
		long end;
		int timespentmin;
		int timespentsec;
		int cont=1;
		int score=0;
		String op1="a";
		String op2="a";
		String op3="a";
		String op4="a";
		String op5="a";
		String op6="a";
		String op7="a";
		String op8="a";
		String op9="a";
		String op10="a";
		
			while(cont<11){
				
				int addorsub=cont%2;
				int a=(int) (Math.random()*10);
				int b=(int) (Math.random()*10);
				int buffer=0;
				int userinput=0;
				String rightorwrong="a";
		
						switch(addorsub){
					
						case 0:
								if (a<b) {
									buffer=a;
									a=b;
									b=buffer;
									}
							userinput=Integer.parseInt(JOptionPane.showInputDialog("What's the solution for " +a +" - " +b));
							if(userinput==(a-b)) {
								score++;
								rightorwrong="Correct";
								} else rightorwrong="Incorrect";
							break;
						case 1:
							userinput=Integer.parseInt(JOptionPane.showInputDialog("What's the solution for " +a +" + " +b));
								if(userinput==(a+b)) {
								score++;
								rightorwrong="Correct";
								} else rightorwrong="Incorrect";
							break;	
									}
				
						switch(cont){
						
						case 1: if (addorsub==0) op1=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op1=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 2: if (addorsub==0) op2=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op2=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 3: if (addorsub==0) op3=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op3=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 4: if (addorsub==0) op4=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op4=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;

						case 5: if (addorsub==0) op5=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op5=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 6: if (addorsub==0) op6=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op6=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 7: if (addorsub==0) op7=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op7=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 8: if (addorsub==0) op8=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op8=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 9: if (addorsub==0) op9=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op9=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						case 10: if (addorsub==0) op10=(a + " - " + b + " = " +userinput +"        " + rightorwrong );
						else op10=(a + " + " + b + " = " +userinput +"        " + rightorwrong );
						break;
						
						}
					cont++;
					
						
						}
				end=System.currentTimeMillis();
				timespentmin=(int) ( (end-start) / 60000) ;
				timespentsec=(int) ( ((end-start) / 1000) - (timespentmin*60) ) ;
				System.out.println(op1);
				System.out.println(op2);
				System.out.println(op3);
				System.out.println(op4);
				System.out.println(op5);
				System.out.println(op6);
				System.out.println(op7);
				System.out.println(op8);
				System.out.println(op9);
				System.out.println(op10);
				System.out.println("You scored " +score +" out of 10");
				if (score>=7) System.out.println("You pass");
				else System.out.println("You failed the test, try again");
				System.out.println("Time spent on the test: " +timespentmin + " minutes and " + timespentsec + " seconds"  );
				
						
					
					      }
		
		
									}
							
