package secondtrimester;
import java.util.ArrayList;

public class Polynomial {
	
	ArrayList<Monomial> monomials=new ArrayList<Monomial>();
	ArrayList<String> smonomials=new ArrayList<String>();
	
	Polynomial (String poly){
		
		
		
	}
	
	Polynomial (ArrayList<Monomial> monomials){
		this.monomials=monomials;
	}
	
	String showmonomials(){
		String output="";
		for(int i=0;i<monomials.size();i++){
			if(monomials.get(i).getcoefficient()>0)output+="+";
			output+=(monomials.get(i).getcoefficient()+"x"+monomials.get(i).getgrade()+" ");
		}
		return output;
	}

}
