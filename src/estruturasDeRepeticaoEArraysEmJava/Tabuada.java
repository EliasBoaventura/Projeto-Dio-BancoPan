package estruturasDeRepeticaoEArraysEmJava;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroTabuada;

		System.out.println("Digite o número da tabuada que voce deseja: ");

		numeroTabuada = sc.nextInt();

		while (!(numeroTabuada >= 1 && numeroTabuada <= 10)) {
			System.out.println("Digite um número válido: ");
			numeroTabuada = sc.nextInt();
		}

		for (int i = 1; i <= 10; i++) {
			int resultatoTabuadaDoNumeroEscolhido = numeroTabuada * i;

			System.out.println(i + " x " + numeroTabuada + " = " + resultatoTabuadaDoNumeroEscolhido);

		}

		sc.close();
	}

}
