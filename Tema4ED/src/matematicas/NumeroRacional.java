package matematicas;

public class NumeroRacional {

	int numerador;
	int denominador;

	public NumeroRacional() {

	}

	public NumeroRacional(int n, int d) {
		this.numerador = n;
		this.denominador = d;
		simplificar();
	}

	public NumeroRacional(int n) {
		this.numerador = n;
		this.denominador = 1;
	}

	public NumeroRacional sumar(NumeroRacional n) {
		int num = (numerador * n.getDenominador())
				+ (n.getNumerador() * denominador);
		int den = denominador * n.getDenominador();
		return new NumeroRacional(num, den);
	}

	public NumeroRacional restar(NumeroRacional n) {
		int num = (numerador * n.getDenominador())
				- (n.getNumerador() * denominador);
		int den = denominador * n.getDenominador();
		return new NumeroRacional(num, den);
	}

	public NumeroRacional multiplicar(NumeroRacional n) {
		int num = numerador * n.getNumerador();
		int den = denominador * n.getDenominador();
		return new NumeroRacional(num, den);
	}

	public NumeroRacional dividir(NumeroRacional n) {
		int num = numerador * n.getDenominador();
		int den = denominador * n.getNumerador();
		return new NumeroRacional(num, den);
	}

	private void simplificar() {
		int mcd = maximoComunDivisor();
		numerador /= mcd;
		denominador /= mcd;
	}

	private int maximoComunDivisor() {
		int n = (denominador < numerador) ? denominador : numerador;
		for (int i = n; i > 0; i--) {
			if (numerador % i == 0 && denominador % i == 0)
				return i;
		}
		return 1;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public String imprimeNumeroRacional() {
		String fraccion = "";
		if (this.numerador == this.denominador) {
			fraccion = "1";
		} else {
			if (this.denominador == 1) {
				fraccion += this.numerador;
			} else {
				fraccion = this.numerador + " / " + this.denominador;
			}
		}
		return fraccion;
	}

	public double getNumeroDecimal() {
		double nDecimal = (this.numerador * 1.00) / this.denominador;
		return nDecimal;
	}
}
