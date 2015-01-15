package javapractice;
import java.util.Scanner;

//revisar codigo, cambiar math por random, revisar sobretodo la logica del cambio
// con el buffer

public class Shuffleanddealcards {
	
	public static void main(String[] args){
	
		int option=5;
		int[] cards=new int[40];
		String[] draw=new String[4];
		int i=0;
		int usedcards=0;
		Scanner userinput=new Scanner(System.in);	
		
		for(i=0;i<cards.length;i++) cards[i]=i+1;
		for(i=0;i<cards.length;i++) System.out.println(cards[i]);
		while(option!=0){
		System.out.println("1 - Shuffle the cards");
		System.out.println("2 - Draw 4 cards");
		System.out.println("0 - Exit");
		while(!userinput.hasNextInt() ) {
			System.out.println("Please enter an integer");
			userinput.next();
			}
		option=userinput.nextInt();
			switch(option){	
				case 1: {
					shuffle(cards,usedcards);					
					for(i=0;i<cards.length;i++){
					System.out.println(cards[i]+" ");	
					}
					
					break;
				}
				case 2:{
					draw(cards,usedcards,draw);
					usedcards+=4;
					for(i=0;i<draw.length;i++){
						System.out.println(draw[i]+" ");
					}
					
					break;
				}
				case 0:{
					break;
				}
				
			}
					
			} 
					
	
	userinput.close();
	}
	

	
	public static void shuffle(int[] cartas , int usedcards){
		
		int buffer=0;
		int rand=0;
		
		
		for(int i=usedcards;i<cartas.length;i++){
			
		buffer=cartas[i];
		rand=(int) (Math.random() *40);
			if(rand>i){
				cartas[i]=cartas[rand];
				cartas[rand]=buffer;
			}
		}
		
		
		
			
	}
		
		
		
	public static void draw(int cards[], int usedcards,String[] draw){
				
		int numpalo=0;
		String palo="";
		int i=usedcards;
			
				for(int j=0;j<draw.length;j++){
						if(cards[i]==10) { numpalo=4; palo="10 de oro";}
						else numpalo=cards[i]/10;
													
						switch(numpalo){
							case 0 : palo=cards[i]%10+" de oro"; break;
							case 1 : palo=cards[i]%10+" de copa"; break;
							case 2 : palo=cards[i]%10+" de espadas"; break;
							case 3 : palo=cards[i]%10+" de bastos"; break;
							}
				draw[j]=palo;
				i++;
				
			
			}
					
						
						
									
	}
					
				
								
				
}
			
				
			
			
	
		
		


	
		
		
		

	
	


