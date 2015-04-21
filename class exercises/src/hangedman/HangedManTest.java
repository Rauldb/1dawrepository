package hangedman;

import java.io.IOException;
import java.util.Scanner;

public class HangedManTest {

	public static void main(String[] args) {
		
		HangedMan game=new HangedMan();
		System.out.println("Guess the word");
		Scanner userinput=new Scanner(System.in);
		boolean gameover=false;
		
		while(!gameover){
			System.out.println(game.getMaskWord());
			if((6-game.getMistakes()>0))System.out.println("You have "+(6-game.getMistakes())+" mistakes left");
			System.out.println("Introduce a letter");
			game.checkLetter(userinput.next().charAt(0));
			if(game.youlose()) gameover=true;
			if(game.youwin()) gameover=true;			
			}
		
		if(game.youwin()) System.out.println("You won");
		System.out.println("GAME OVER");
			
		}

	}


