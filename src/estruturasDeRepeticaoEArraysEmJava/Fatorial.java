package estruturasDeRepeticaoEArraysEmJava;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int valorFatorial = 1;
		System.out.println("Digite o numero para o fatorial: ");

		numero = sc.nextInt();

		for (int i = numero; i >= 1; i--) {

			valorFatorial *= i;
		}

		System.out.println(numero + "! = " + valorFatorial);

		sc.close();
	}

}
