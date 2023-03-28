package estruturasDeRepeticaoEArraysEmJava;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a nota: ");
		int nota = sc.nextInt();
		boolean notasNaoAceitas = nota >= 0 && nota <= 10;

		while (!notasNaoAceitas) {
			System.out.println("Nota inválida, digite outra nota: ");
			nota = sc.nextInt();

			notasNaoAceitas = nota >= 0 && nota <= 10;

		}
		System.out.println("Fim");

		sc.close();
	}

}
