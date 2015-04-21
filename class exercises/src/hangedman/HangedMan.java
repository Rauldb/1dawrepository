package hangedman;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangedMan { // Internal logic class 

	private String word;
	private char[] gamestatearray;
	private String gamestate;
	private String introduced;
	private int mistakes;

	public HangedMan() { // Default constructor taking a random word from a dictionary file
		this.word = initword();
		mistakes=0;
		gamestatearray=new char[word.length()];
		for (int i = 0; i < this.word.length(); i++) {
			gamestatearray[i]='_';
		}
		gamestate=String.valueOf(gamestatearray);
	}

	public HangedMan(String word) { // Constructor that uses a user defined word
		this.word = word;
		mistakes=0;
		gamestatearray=new char[word.length()];
		for (int i = 0; i < this.word.length(); i++) {
			gamestatearray[i]='_';
		}
		gamestate=String.valueOf(gamestatearray);
	}

// GETTER SETTERS

	public String getWord() {
		return this.word;
	}

	public String getMaskWord() {
		String mask="";
		for(int i=0;i<gamestate.length();i++){
			mask+=gamestate.charAt(i);
			mask+=" ";
		}
		return mask;
	}

	public String getIntroduced() {
		return introduced;
	}
	
	public int getMistakes(){
		return mistakes;
	}
	
	// FUNCTIONALITY AND BEHAVIOUR
	
	public String initword() { // Reads a random word from words.txt
		ArrayList<String> listofwords = new ArrayList<String>();
		try{ // We handle the IOException 
		File words=new File("src/hangedman/words.txt");
		Scanner wordscanner=new Scanner(words);
		wordscanner.useDelimiter(","); // We use a comma to separate words
		Random rand=new Random();
				
		while(wordscanner.hasNext()){		
		listofwords.add(wordscanner.next());		
		}
		int selector=rand.nextInt((listofwords.size()-1) +1) +0;
		wordscanner.close();
		return(listofwords.get(selector));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public boolean checkLetter(char letter){ // Look for letter occurrences on the stored word, updates game state 
		boolean found=false;
		for(int i=0;i<this.word.length();i++){
				if(letter==this.word.charAt(i)){
					found=true;
					introduced+=letter;
					gamestatearray[i]=letter;
					gamestate=String.valueOf(gamestatearray);
				}
			
		}
		if(found==false)mistakes++;
		return found;
	}

	public boolean youwin() {
		
		if(gamestate.equals(word))return true;
		else return false;
		
	}
	
	public boolean youlose(){
		if(mistakes==6) return true;
		else return false;
	}
	


}
