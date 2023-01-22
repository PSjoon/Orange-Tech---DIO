import java.util.Scanner;

public class Mesada {
	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			int entrada = leitor.nextInt();
			int mesada = 50;

			System.out.println(calcular(entrada, mesada));
		}
	}

	public static int calcular(int entrada, int mesada) {
		int total = 0;
		total = entrada * mesada;
		return total;

	}
}
