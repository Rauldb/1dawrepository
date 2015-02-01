package secondtrimester;

import java.util.ArrayList;

public class Testpolynomials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userinput="-25x3";
		ArrayList<Monomial> list = new ArrayList<Monomial>();
		list.add(new Monomial(userinput));
		userinput="5x2";
		list.add(new Monomial(userinput));
		Polynomial poly=new Polynomial(list);
		System.out.println(poly.showmonomials());
		Polynomial stringpoly=new Polynomial("-2x2+3x+5");
		System.out.println(stringpoly.showmonomials());
		// System.out.println(poly.sum(stringpoly)); FIXME
		
		

	}

}
