package secondtrimester;

public class ComplexNumber {
	private int a;
	private int b;

	ComplexNumber() {
	}

	ComplexNumber(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		String output = "";
		output = "(" + a + (b < 0 ? " - " + b * -1 : " + " + b) + "i)";
		return output;
	}

	public ComplexNumber add(ComplexNumber addend) {
		ComplexNumber result = new ComplexNumber(this.a, this.b);
		result.a += addend.a;
		result.b += addend.b;
		return result;
		// Another way of doing this:
		// return new ComplexNumber(this.a + addend.a, this.b + addend.b);
	}

	public ComplexNumber substract(ComplexNumber substrahend) {
		ComplexNumber result = new ComplexNumber(this.a, this.b);
		result.a -= substrahend.a;
		result.b -= substrahend.b;
		return result;
		// Another way of doing this:
		// return new ComplexNumber(
		// this.a - substrahend.a, this.b - substrahend.b);
	}
	// public ComplexNumber multiply(ComplexNumber multiplier)
	// {
	//
	// }
}