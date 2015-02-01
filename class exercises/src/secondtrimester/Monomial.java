package secondtrimester;

public class Monomial {
	
	private int coefficient;
	private int grade;
	private boolean ispositive;
	
	
	Monomial(String mono){
		
		int x=0;
		mono.trim();
		mono.toLowerCase();
		boolean xfound=false;
		
		if(mono.indexOf("-")!=-1){
			ispositive=false;
		}
		else{
			ispositive=true;
		}
			
		
		if(mono.indexOf("x")!=-1){
				x=mono.indexOf("x");
				xfound=true;
			}
			
			if(xfound==false){
				grade=0;
				coefficient=Integer.parseInt(mono.substring(0,mono.length()));				
			}
			else{
				coefficient=Integer.parseInt(mono.substring(0,x));
				if(mono.length()-1>x)
				grade=Integer.parseInt(mono.substring(x+1,mono.length()));
				else grade=1;
				
			}
			
			
			
		}
					
	
	
	int getcoefficient(){
		return coefficient;
	}
	
	int getgrade(){
		return grade;
	}
	
	String getsymbol(){
		if (ispositive) return "+";
		else return "-";
		
	}
	
		
	}


