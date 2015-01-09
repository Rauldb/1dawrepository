package mymath;

public class QuadraticEquation {
	private int a;
	private int b;
	private int c;
	
	public QuadraticEquation(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public int geta(){
		return a;
	}
	
	public int getb(){
		return b;
	}

	public int getc(){
		return c;
}
	
	public int getDiscriminant(){
		return (b*b-(4*a*c));
	}
	
	public double getRoot1(){
		return (-b+Math.sqrt(getDiscriminant())/2*a);
	}
	
	public double getRoot2(){
		return (-b-Math.sqrt(getDiscriminant())/2*a);
	}
	
	public boolean isSolvable (){
		if (getDiscriminant()<0) return false;
		else return true;
	}

}
