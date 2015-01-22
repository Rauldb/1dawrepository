package secondtrimester;

public class Stringutils {
	
	Stringutils(){
		
	}
	
	String reversed="";
	
	
	boolean checkpalindrome(String original){
		
		
				
		for (int i=original.length()-1;i>=0;i--){
			reversed+=original.charAt(i);
		}
		if (original.equals(reversed)) return true;
		else return false;
				
	}

}
