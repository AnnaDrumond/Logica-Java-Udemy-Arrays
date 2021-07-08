package matrizes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros positivos M e N, depois ler
		 * uma matriz de M linhas e N colunas contendo números inteiros. Em seguida,
		 * mostrar na tela a matriz lida
		 */

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		// vou criar e instanciar uma matriz com M linhas e N colunas
		int[][] matrizes = new int[M][N];

		// vou criar um primeiro FOR para percorrer as LINHAS (M) da matriz
		// e depois um segundo FOR para percorrer as COLUNAS (N) da matriz

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrizes[i][j] = sc.nextInt();
			}
		}
		
		// Agora vou por o comando para imprimir as linhas e colunas 
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrizes [i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
