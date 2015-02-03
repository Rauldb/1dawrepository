package secondtrimester;

public class Monomial implements Comparable<Monomial> {

	private int coefficient;
	private int grade;
	private boolean ispositive;

	// CONSTRUCTORS

	public Monomial(int coeff, int grade) {
		this.coefficient = coeff;
		this.grade = grade;
	}

	public Monomial(String mono) {

		int x = 0;
		mono.trim();
		mono.toLowerCase();
		boolean xfound = false;

		if (mono.indexOf("-") != -1) {
			ispositive = false;
		} else {
			ispositive = true;
		}

		if (mono.indexOf("x") != -1) {
			x = mono.indexOf("x");
			xfound = true;
		}

		if (xfound == false) {
			grade = 0;
			coefficient = Integer.parseInt(mono.substring(0, mono.length()));
		} else {
			coefficient = Integer.parseInt(mono.substring(0, x));
			if (mono.length() - 1 > x)
				grade = Integer.parseInt(mono.substring(x + 1, mono.length()));
			else
				grade = 1;

		}

	}

	// METHODS - GETTER SETTERS

	public int getcoefficient() {
		return coefficient;
	}

	public int getgrade() {
		return grade;
	}

	public void setCoefficient(int newco) {
		this.coefficient = newco;
	}

	public void setGrade(int newgra) {
		this.grade = newgra;
	}

	public String getsymbol() {
		if (ispositive)
			return "+";
		else
			return "-";

	}

	// METHODS - FUNCTIONALITY
	
	
	public Monomial sum(Monomial anothermono){ // FIXME Change code to throw an exception if it can't be summed
		return new Monomial(this.coefficient+anothermono.coefficient,this.grade); 
	}
	
	public void sumThis(Monomial anothermono){	// FIXME  Ditto
		this.coefficient+=anothermono.coefficient;		
	}
	
	
	@Override
	public int compareTo(Monomial anothermonomial) { // Custom sorting method
														// for Monomial objects
														// that uses grade
		int comparemono = anothermonomial.getgrade();
		return comparemono - this.grade;
	}

}
