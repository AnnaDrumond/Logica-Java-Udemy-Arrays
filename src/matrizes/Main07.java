package matrizes;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		/*
		 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos
		 * elementos acima da diagonal principal entrada contém o valor N, depois os
		 * dados da matriz.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] matrizes = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrizes[i][j] = sc.nextInt();
			}
		}

		int soma = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// Soma dos elementos acima da diagonal principal;
				if (j > i) {
					soma += matrizes[i][j];
				}
			}
		}
		System.out.println(soma);

		sc.close();
	}
}
