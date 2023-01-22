import java.util.Scanner;

public class Doces {
	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			int entrada = leitor.nextInt();
			int doces = 2;

			System.out.println("O cliente obteve " + calcular(entrada, doces) + " doces");
		}
	}

	public static int calcular(int entrada, int doces) {
		int total = 0;
		total = entrada * doces;
		return total;

	}
}
