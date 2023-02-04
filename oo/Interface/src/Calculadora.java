public class Calculadora implements Operacao {

	@Override
	public void som(double operando1, double operando2) {
		System.out.println("Soma: " + operando1 + operando2);

	}

	@Override
	public void sub(double operando1, double operando2) {
		System.out.println("Subtracao" + operando1 + operando2);

	}

	@Override
	public void mult(double operando1, double operando2) {
		System.out.println("multiplicacao" + operando1 + operando2);

	}

	@Override
	public void div(double operando1, double operando2) {
		System.out.println("divisao" + operando1 + operando2);

	}

}
