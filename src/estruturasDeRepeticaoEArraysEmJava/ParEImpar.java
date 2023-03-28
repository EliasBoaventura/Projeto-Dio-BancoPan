package estruturasDeRepeticaoEArraysEmJava;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeDeNumeros, numero;
		int quantidadeImpares = 0;
		int quantidadePares = 0;

		System.out.println("Digite a quantidade de números: ");
		quantidadeDeNumeros = sc.nextInt();

		int contador = 0;

		do {
			System.out.println("Digite o número: ");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				quantidadePares++;
			} else {
				quantidadeImpares++;
			}
			contador++;
		} while (contador < quantidadeDeNumeros);

		System.out.println("quantidade de números pares: " + quantidadePares);
		System.out.println("quantidade de números impares: " + quantidadeImpares);
		
		
		
		sc.close();
	}

}
