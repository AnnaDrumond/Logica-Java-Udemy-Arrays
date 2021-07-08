package matrizes;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
		 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
		 * abaixo de X, quando houver, conforme exemplo. correção:
		 * https://github.com/acenelio/matrix2-java/blob/master/src/application/Program.
		 * java
		 */

		Scanner sc = new Scanner(System.in);

		// Inform os valores de M(linha) e N(colunas)
		System.out.print("Enter the values of M(row) and N(columns): ");
		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] matrix = new int[M][N];

		// Informe os elementos da Matriz
		System.out.println("Enter the matrix data : ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter the value of X: ");
		int X = sc.nextInt();
		sc.close();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == X) {
					System.out.print("\nThe number " + X + " is in the position: " + i + "," + j);
					if (j > 0) {
						System.out.print("\nLeft of X: " + matrix[i][j - 1]);
					} // ou N - 1 = 3. - Se j for menor que 3:
					if (j < matrix[i].length - 1) {
						System.out.print("\nRight of X: " + matrix[i][j + 1]);
					}
					if (i > 0) {
						System.out.print("\nUp of X: " + matrix[i - 1][j]);
					} // Se i for menor do que 2(3-1)que é quantidade de linhas da matriz:
					if (i < matrix.length - 1) {
						System.out.print("\nDown of X: " + matrix[i + 1][j]);
					}
					System.out.println();
				}
			}
		}

	}

}
