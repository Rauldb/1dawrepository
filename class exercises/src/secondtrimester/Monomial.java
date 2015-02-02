package secondtrimester;

public class Monomial {
	
	private int coefficient;
	private int grade;
	private boolean ispositive;
	
	
  	public Monomial (int coeff, int grade){
		this.coefficient=coeff;
		this.grade=grade;
	}
	
	public Monomial(String mono){
		
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
	
	
	/*public Monomial sum(Monomial other){
		if(this.grade==other.grade){
			return new Monomial(this.coefficient+other.coefficient,this.grade);
		}
	}FIXME*/
	
	
	public int getcoefficient(){
		return coefficient;
	}
	
	public int getgrade(){
		return grade;
	}
	
	public void setCoefficient(int newco){
		this.coefficient=newco;
	}
	
	public void setGrade(int newgra){
		this.grade=newgra;
	}
	
	public String getsymbol(){
		if (ispositive) return "+";
		else return "-";
		
	}
	
		
	}


