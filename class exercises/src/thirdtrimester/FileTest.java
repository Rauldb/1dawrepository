package thirdtrimester;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File words=new File("src/thirdtrimester/words.txt");
		Scanner wordscanner=new Scanner(words);
		wordscanner.useDelimiter(",");
		
		while(wordscanner.hasNext()){		
		System.out.println(wordscanner.next());		
		}
		
		wordscanner.close();
		
		
		
		

	}

}
