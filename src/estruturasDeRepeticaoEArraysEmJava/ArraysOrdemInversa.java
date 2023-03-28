package estruturasDeRepeticaoEArraysEmJava;

public class ArraysOrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = { 0, 515, 222, 35, 16, 17 };

		int contador = vetor.length;

		while (contador > 0) {

			System.out.println(vetor[contador - 1]);

			contador--;
		}

	}

}
