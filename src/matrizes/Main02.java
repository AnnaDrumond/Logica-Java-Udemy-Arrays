package matrizes;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem
		 * N contendo números inteiros. Em seguida, mostrar a diagonal principal e a
		 * quantidade de valores negativos da matriz.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] matrizes = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrizes[i][j] = sc.nextInt();
			}
		}

		System.out.println("DIAGONAL PRINCIPAL:");

		for (int i = 0; i < N; i++) {
			System.out.print(matrizes[i][i] + " ");
		}
		System.out.println();

		int auxiliar = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrizes[i][j] < 0) {
					auxiliar++;
				}
			}
		}

		System.out.println("QUANTIDADE DE NEGATIVOS = " + auxiliar);

		sc.close();
	}

}
