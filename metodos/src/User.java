public class User {
	public static void main(String[] args) throws Exception {
		SmartTv smartTV = new SmartTv();

		System.out.println("Tv Ligada:  " + smartTV.ligada);

		smartTV.ligar();
		System.out.println("Tv ligada: " + smartTV.ligada);

		System.out.println("Volume:  " + smartTV.volme);

		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		System.out.println("Volume:  " + smartTV.volme);

		System.out.println("Canal:  " + smartTV.canal);

		smartTV.selecionarCanal(13);
		System.out.println("Canal:  " + smartTV.canal);

	}
}
