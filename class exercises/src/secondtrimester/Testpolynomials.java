package secondtrimester;

import java.util.ArrayList;

public class Testpolynomials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userinput="2x2";
		ArrayList<Monomial> list = new ArrayList<Monomial>();
		list.add(new Monomial(userinput));
		userinput="5x4";
		list.add(new Monomial(userinput));
		Polynomial poly=new Polynomial(list);
		System.out.println(poly.showmonomials());
		Polynomial stringpoly=new Polynomial("5+2x+8x4+7x28+4x");
		System.out.println(stringpoly.showmonomials());
		System.out.println(poly.sum(stringpoly).showmonomials()); 
		
		
		

	}

}
