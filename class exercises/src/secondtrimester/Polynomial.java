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

	
	
	public Polynomial sum(Polynomial poly){ // Alternative, arguably improved sum method
		ArrayList<Monomial> polycopy=new ArrayList<Monomial>();
		polycopy.addAll(this.monomials); // Adds monomials of the first Polynomial operand
		polycopy.addAll(poly.monomials); //	Ditto second operand	
		Collections.sort(polycopy);		 // Sort Monomials by grade to allow a simple pointer style comparison with 2 indexes.
		int j=1;						 // Second index of the for loop
		int polysize=polycopy.size();	 // Variable size of the Arraylist , we need this because it only decrements under certain conditions (Using remove method)
		
		for(int i=0;i<polysize-1;i++){	 // We use polysize to avoid unnecesary complexity and chaos when we remove elements
			if(polycopy.get(i).getgrade()==polycopy.get(j).getgrade()){	
				polycopy.get(i).sumThis(polycopy.get(j));	// Calls a method in Monomial class that modifies the object from where it's called, void return.
				polycopy.remove(j); // Remove the second monomial that was already summed to the first
				polysize--; // We control the ArrayList size ourselves
				i--; //		We stop i index because we want to check for more monomials of the same grade 
				j--; //		We stop j index because the arraylist has moved the next object to compare due to how rearrangement works in this data structure (moves all of the objects after the removed element backwards)
			}
			if(j<polysize-1)j++; // We control a "outofbounds" exception, it's the same as i because i starts at 0 and j starts at 1		
		}
		
		return new Polynomial(polycopy); // We instanciate a new object with the created ArrayList and return it.
	}

}



// Unreliable and too long sum method, reference only, don't use

/* public Polynomial shittysum(Polynomial poly) { // Sums 2 polynomials

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

} */
