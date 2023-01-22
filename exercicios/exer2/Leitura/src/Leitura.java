import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			int entrada = leitor.nextInt();
			int paginasLidas = 3;

			System.out.println(calcular(entrada, paginasLidas) + " dias");
		}
	}

	public static int calcular(int entrada, int paginasLidas) {
		int total = 0;
		total = entrada / paginasLidas;
		return total;

	}
}
