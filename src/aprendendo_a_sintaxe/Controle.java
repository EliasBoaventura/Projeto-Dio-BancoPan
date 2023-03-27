package aprendendo_a_sintaxe;

public class Controle {

	boolean ligada = true;
	int volume = 30;
	int canal = 4;

	public String statusTv() {
		String statusTv = ligada ? "ligada" : "desligada";
		return statusTv;
	}

	public void ligarTv() {
		ligada = true;
	}

	public void desligarTv() {
		ligada = false;
	}

	public void aumentarVolume() {
		volume++;
	}

	public void diminuirVolume() {
		volume--;
	}

	public void aumentarCanal() {
		canal++;
	}

	public void diminuirCanal() {
		canal--;
	}

	public void escolherCanal(int canalEscolhido) {
		canal = canalEscolhido;
	}

	@Override
	public String toString() {
		return "A tv está: " + statusTv() + ", com volume: " + volume + ", e no canal: " + canal +".";
	}

}
