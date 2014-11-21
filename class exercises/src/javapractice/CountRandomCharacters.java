package javapractice;
import java.util.Random;

public class CountRandomCharacters {
	
	
	public static void main(String[] args){
		
		final int firstalphabetvalue=97;
		int [] ascii=new int[26];
		char[] characters=new char[26];
		char[] randomcharacters=new char[26];
		int[] counters=new int[26];
		int jcounter=firstalphabetvalue;
		int lcounter=firstalphabetvalue;
		int random=0;
		Random rand=new Random();
		
		for(int i=0;i<ascii.length;i++){
			characters[i]=(char) lcounter;
			lcounter++;
		}
		
		for(int i=0;i<ascii.length;i++){
			ascii[i]=jcounter;
			jcounter++;
		}
		
		for(int i=0;i<characters.length;i++) {
			random=rand.nextInt(122-97)+97;
			System.out.println(random);
			randomcharacters[i]=(char)random;			
		}
		
		for(int i=0;i<characters.length;i++){			
			for(int k=0;k<ascii.length;k++){				
				if((int)randomcharacters[k]==characters[i])counters[i]++;				
			}		
		}
		
				
		for(int i=0;i<characters.length;i++) System.out.println("ALPHABET " +Character.toUpperCase(characters[i])+"---------- "+counters[i]+" times");		
				
	}
	
	
	

}
