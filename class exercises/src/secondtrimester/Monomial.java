package secondtrimester;

public class Monomial {
	
	private int coefficient;
	private int grade;
	
	
	Monomial(String mono){
		
		int x=0;
		mono.trim();
		mono.toLowerCase();
		boolean xfound=false;
			if(mono.indexOf("x")!=-1){
				x=mono.indexOf("x");
				xfound=true;
			}
			
			if(xfound==false){
				grade=1;
				coefficient=Integer.parseInt(mono.substring(0,1));
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
	
		
	}


