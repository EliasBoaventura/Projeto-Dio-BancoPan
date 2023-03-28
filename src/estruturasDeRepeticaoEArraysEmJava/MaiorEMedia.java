package estruturasDeRepeticaoEArraysEmJava;

import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int QUANTIDADE_DE_LEITURAS = 5;

		int contadorDeLeituras = 0;
		int numero = 0;
		int maiorNumero = 0;
		int numerosDigitados = 0;
		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			contadorDeLeituras++;
			maiorNumero = numero;
			numerosDigitados += numero;

		} while (contadorDeLeituras < QUANTIDADE_DE_LEITURAS);
		
		
		System.out.println("O maior número é " + maiorNumero);
		System.out.println("----------------------------");
		System.out.printf("A média dos números é %.2f%n" ,calcularMedia(numerosDigitados,QUANTIDADE_DE_LEITURAS));
		
		
		sc.close();
	}
	static double calcularMedia(int somaDosValores, int quantidadeDeValores) {
		
		double media = (double)somaDosValores/quantidadeDeValores;
		
		return media;
	}

}
