package matrizes;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		/*
		 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior
		 * elemento de cada linha. Suponha n�o haver empates. A entrada cont�m o n�mero
		 * N, depois os dados da matriz. A sa�da cont�m os n�meros representando o maior
		 * elemento de cada linha da matriz
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
			int maior = 0;
			for (int j = 0; j < N; j++) {
				if (matrizes[i][j] > maior) {
					maior = matrizes[i][j];
				}
			}
			System.out.println(maior);
		}

		sc.close();
	}

}
