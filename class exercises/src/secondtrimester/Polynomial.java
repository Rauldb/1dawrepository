package secondtrimester;

import java.util.ArrayList;
import java.util.Collections;

public class Polynomial {

	private ArrayList<Monomial> monomials = new ArrayList<Monomial>();
	private ArrayList<String> smonomials = new ArrayList<String>();
	private int grade = 0;
	private int symbolindex = 0;

	// CONSTRUCTORS

	public Polynomial(String poly) {
		String substring = "";

		for (int i = 0; i < poly.length(); i++) { // For loop that parses the
													// String into substring
													// that contain monomials
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

		for (int i = 0; i < smonomials.size(); i++) { // for loop that
														// instantiates monomial
														// objects from a String
														// type input
														// (smonomials
														// stringlist)
			monomials.add(new Monomial(smonomials.get(i)));
		}
		Collections.sort(monomials);
		grade = monomials.get(0).getgrade();
	}

	// METHODS - GETTER SETTERS

	public Polynomial(ArrayList<Monomial> monomials) {
		this.monomials = monomials;
		Collections.sort(monomials);
		grade = monomials.get(0).getgrade();
	}

	public int getGrade() {
		return grade;
	}

	public ArrayList<String> getMonomialString() {
		return smonomials;
	}

	// METHODS - FUNCTIONALITY

	public String showMonomials() { // Creates and return a String with similar
									// to real world polynomial format
		String output = "";
		for (int i = 0; i < monomials.size(); i++) {
			if (i != 0 && monomials.get(i).getcoefficient() > 0)
				output += "+";
			if (monomials.get(i).getgrade() == 0) {
				output += (monomials.get(i).getcoefficient() + " ");
			} else {
				if (monomials.get(i).getgrade() == 1) {
					output += (monomials.get(i).getcoefficient() + "x" + " ");
				} else {
					output += (monomials.get(i).getcoefficient() + "x"
							+ monomials.get(i).getgrade() + " ");
				}
			}

		}
		return output;
	}

	public Polynomial sum(Polynomial poly) { // Sums 2 polynomials

		ArrayList<Monomial> polycopy = new ArrayList<Monomial>();
		boolean duplicate = false;

		for (int i = 0; i < this.monomials.size(); i++) { // Sums monomials of
															// the same grade
			for (int j = 0; j < poly.monomials.size(); j++) {
				if (this.monomials.get(i).getgrade() == poly.monomials.get(j)
						.getgrade()) {
					polycopy.add(new Monomial(this.monomials.get(i)
							.getcoefficient()
							+ poly.monomials.get(j).getcoefficient(),
							this.monomials.get(i).getgrade()));
				}
			}
		}

		for (int i = 0; i < this.monomials.size(); i++) { // Adds monomials in
															// the original
															// Polynomial that
															// can't be summed
															// to the resulting
															// Polynomial
			for (int j = 0; j < polycopy.size(); j++) {
				if (this.monomials.get(i).getgrade() == polycopy.get(j)
						.getgrade())
					duplicate = true;
			}
			if (!duplicate)
				polycopy.add(this.monomials.get(i));
			duplicate = false;
		}

		for (int i = 0; i < poly.monomials.size(); i++) { // Same as above, but
															// this one adds
															// monomials from
															// the polynomial
															// that
															// is summed
			for (int j = 0; j < polycopy.size(); j++) {
				if (poly.monomials.get(i).getgrade() == polycopy.get(j)
						.getgrade())
					duplicate = true;
			}
			if (!duplicate)
				polycopy.add(poly.monomials.get(i));
			duplicate = false;
		}

		return new Polynomial(polycopy);

	}

}
