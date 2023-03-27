package aprendendo_a_sintaxe;

public class Metodos {

	public static void main(String[] args) {
		Controle controle = new Controle();

		controle.ligarTv();
		System.out.println(controle.toString());

		controle.desligarTv();
		System.out.println(controle.toString());

		controle.aumentarVolume();
		System.out.println(controle.toString());

		controle.diminuirVolume();
		System.out.println(controle.toString());

		controle.aumentarCanal();
		System.out.println(controle.toString());

		controle.diminuirCanal();
		System.out.println(controle.toString());

		controle.escolherCanal(30);
		System.out.println(controle.toString());

	}

}
