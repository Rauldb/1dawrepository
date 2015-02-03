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
		System.out.println("This is a polynomial created from a Monomial ArrayList \n"+poly.showMonomials());
		Polynomial stringpoly=new Polynomial("5+2x+8x4+7x28+4x5");
		System.out.println("This is a polynomial created from a String \n"+stringpoly.showMonomials());
		System.out.println("This is a sum of the 2 previous polynomials \n"+poly.sum(stringpoly).showMonomials());		
		System.out.println("This is the grade of the polynomial above \n"+poly.sum(stringpoly).getGrade());
		
		

	}

}
