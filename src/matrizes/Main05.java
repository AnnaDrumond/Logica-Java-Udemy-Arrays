package matrizes;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * Ler um número N e depois uma matriz quadrada NxN com números inteiros.
		 * Depois, mostrar na tela a soma dos elementos de cada linha da matriz
		 * A entrada contém o número N, depois os dados da matriz.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] matrizes = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrizes[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			int soma = 0;
			for (int j = 0; j < N; j++) {
				soma += matrizes[i][j];
			}
			System.out.println(soma);
		}

		sc.close();

	}

}
