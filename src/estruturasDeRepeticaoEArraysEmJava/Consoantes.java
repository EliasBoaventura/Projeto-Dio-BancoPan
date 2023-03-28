package estruturasDeRepeticaoEArraysEmJava;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] letrasDigitadas = new String[6];

		String letra;
		int contador = 0;
		int contadorConsoantes = 0;
		do {
			System.out.println("Digite a letra: ");
			letra = sc.next();

			if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {
				contadorConsoantes++;
				letrasDigitadas[contador] = letra;

			}
			contador++;
		} while (contador < letrasDigitadas.length);

		System.out.println("Quantidade de consoantes: " + contadorConsoantes);

		for (int i = 0; i < letrasDigitadas.length; i++) {

			if (letrasDigitadas[i] != null) {
				System.out.println("Consoante: "+letrasDigitadas[i]);
			}
		}

		sc.close();
	}

}
