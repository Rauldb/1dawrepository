package secondtrimester;

import java.util.ArrayList;

public class Polynomial {

	ArrayList<Monomial> monomials = new ArrayList<Monomial>();
	ArrayList<String> smonomials = new ArrayList<String>();
	int symbolindex = 0;

	Polynomial(String poly) {
		String substring = "";

		for (int i = 0; i < poly.length(); i++) { // For loop that parses the String into substring that contain monomials
			if (i == poly.length() - 1) {
				substring = poly.substring(symbolindex, poly.length());
				smonomials.add(substring);
			}
			if (poly.charAt(i) == '+' || poly.charAt(i) == '-') {
				if (i != 0) {
					substring = poly.substring(symbolindex, i);
					symbolindex = i;
					smonomials.add(substring);
				}

			}
		}
		
		for(int i=0;i<smonomials.size();i++){ // for loop that instantiates monomial objects from a String type input (smonomials stringlist)
			monomials.add(new Monomial(smonomials.get(i)));
		}
		
		

	}

	Polynomial(ArrayList<Monomial> monomials) {
		this.monomials = monomials;
	}

	ArrayList<String> getmonomialstring() {
		return smonomials;
	}

	String showmonomials() {
		String output = "";
		for (int i = 0; i < monomials.size(); i++) {
			if (monomials.get(i).getcoefficient() > 0)		{
				output += "+";
			}
			if(monomials.get(i).getgrade()==0){
				output+=(monomials.get(i).getcoefficient());
			}else{
				output += (monomials.get(i).getcoefficient() + "x"+ monomials.get(i).getgrade() + " ");
			}
			
		}
		return output;
	}

}
