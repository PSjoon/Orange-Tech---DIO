import java.util.Scanner;

public class Multa {
	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			int entrada = leitor.nextInt();

			String resultado;
			if (entrada <= 60) {
				resultado = "Nao foi multado";

			} else {
				resultado = "Foi multado";
			}
			System.out.println(resultado);
		}
	}
}
