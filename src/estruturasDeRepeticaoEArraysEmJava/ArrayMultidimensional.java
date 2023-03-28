package estruturasDeRepeticaoEArraysEmJava;

import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();

		int[][] matriz = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
			for (int y = 0; y < matriz[i].length; y++) {
				matriz[i][y]=random.nextInt(100);
			}

		}
		
		
		for(int[] linha : matriz) {
			for(int elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		
		

	}

}
