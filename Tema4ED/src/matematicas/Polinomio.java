package matematicas;

public class Polinomio {

	int grado;
	int[] polinomio;
	
	public Polinomio(String str){
		this.grado = getGradoPolinomio(str);
		this.polinomio = new int[this.grado+1];
		
		String[]monomio = getMonomio(str);
		int cociente;
		int grado;
		
		for(int i = 0; i < monomio.length; i++){
			cociente = getCoeficienteMonomio(monomio[i]);// mod
			grado = getGradoMonomio(monomio[i]);//mod
			this.polinomio[grado] += cociente;
		}
		//System.out.println(this.polinomio.length);
	}
	
	public int getGradoMonomio(String str){
		String grado = "";
		if(str.indexOf('x') == -1)
			return 0;
		for(int i = str.indexOf('x')+1; i < str.length(); i++){
			grado += str.charAt(i);
		}
		if(grado == "")
			return 1;
		else
			return Integer.parseInt(grado);
	}
	
	public int getCoeficienteMonomio(String str){
		String coeficiente = "";
		if(str.isEmpty())//prueba
			return 0;
		if(str.indexOf('x') == -1)
			return Integer.parseInt(str);
		else{
			if(str.startsWith("x"))
				return 1;
			else{
				for(int i = 0; i < str.indexOf('x'); i++){
					coeficiente += str.charAt(i);
				}
			}
		}
		if(coeficiente.equals("-"))
			coeficiente = "-1";
		return Integer.parseInt(coeficiente);
	}
	
	public int getGradoPolinomio(String str){
		int grado = 0;
		str = str.replace('+', '%');
		//
		str = str.replaceAll("-", "%-");
		String[]array = str.split("%");
		for(int i = 0; i < array.length; i++){
			if(getGradoMonomio(array[i]) > grado)
				grado = getGradoMonomio(array[i]);
		}
		return grado;
	}
		
	public String[] getMonomio(String str){
		str = str.replace('+', '%');
		str = str.replaceAll("-", "%-");
		String[]array = str.split("%");
		return array;
	}
	
	public String getPolinomio(){
		String poli = "" + this.polinomio[this.grado] + "x" + this.grado;
		for(int i = this.polinomio.length-2; i > 0; i--){
			if(this.polinomio[i] > 0)
				poli += "+" + this.polinomio[i] + "x" + i;
			else
				if(this.polinomio[i] < 0)
					poli += this.polinomio[i] + "x" + i;
			else
				poli += "";
		}
		if(this.polinomio[0] > 0)
			poli += "+" + this.polinomio[0];
		else
			poli += this.polinomio[0];
		return poli;
	}
	
	public void imprimeArrayPolinomio(){
		for(int i = 0; i < this.polinomio.length; i++){
			System.out.print(this.polinomio[i]+"\t");
		}
	}
}
