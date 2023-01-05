public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volme = 25;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = true;
	}

	public void aumentarVolume() {
		volme++;
	}

	public void diminuirVolume() {
		volme--;
	}

	public void aumentarCanal() {
		canal++;
	}

	public void diminuirCanal() {
		canal--;
	}

	public void selecionarCanal(int novoCanal) {
		canal = novoCanal;
	}

}
