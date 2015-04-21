package thirdtrimester;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangedMan {

	private String word;
	private char[] gamestatearray;
	private String gamestate;
	private String introduced;
	private int mistakes;

	public HangedMan() {
		this.word = initword();
		mistakes=0;
		gamestatearray=new char[word.length()];
		for (int i = 0; i < this.word.length(); i++) {
			gamestatearray[i]='_';
		}
		gamestate=String.valueOf(gamestatearray);
	}

	public HangedMan(String word) {
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
		return gamestate;
	}

	public String getIntroduced() {
		return introduced;
	}
	
	public int getMistakes(){
		return mistakes;
	}
	
	// FUNCTIONALITY AND BEHAVIOUR
	
	public String initword() {
		ArrayList<String> listofwords = new ArrayList<String>();
		try{
		File words=new File("src/thirdtrimester/words.txt");
		Scanner wordscanner=new Scanner(words);
		wordscanner.useDelimiter(",");
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
	
	public boolean checkLetter(char letter){
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
		if(mistakes>6) return true;
		else return false;
	}
	


}
