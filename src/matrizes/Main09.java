package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
		/*
		 * Ler uma matriz quadrada de ordem N, contendo n�meros reais. Em seguida, fazer
		 * as seguintes a��es ( ver no c�digo): A entrada cont�m o n�mero inteiro N,
		 * seguido dos valores da matriz com uma casa decimal cada, seguido do �ndice de
		 * uma linha, seguido do �ndice de uma coluna A sa�da cont�m os valores de sa�da
		 * de cada a��o, com uma casa decimal, na ordem em que foram apresentadas
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[][] matrizes = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrizes[i][j] = sc.nextDouble();
			}
		}
		int indiceLinha = sc.nextInt();
		int indiceColuna = sc.nextInt();

		// a) calcular e imprimir a soma de todos os elementos positivos da matriz.

		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrizes[i][j] > 0) {
					soma += matrizes[i][j];
				}
			}
		}

		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

		// b) fazer a leitura do �ndice de uma linha da matriz e, da�, imprimir todos os
		// elementos desta linha.
		System.out.printf("LINHA ESCOLHIDA:  ");

		// vou percorrer somente as colunas, pois a linha j� � fixa no valor da variavel
		// indiceLinha
		for (int j = 0; j < N; j++) {
			System.out.printf("%.1f ", matrizes[indiceLinha][j]);
		}

		System.out.println();

		// c) fazer a leitura do �ndice de uma coluna da matriz e, da�, imprimir todos
		// os elementos desta coluna.
		System.out.printf("COLUNA ESCOLHIDA:  ");

		// vou percorrer somente as linhas, pois a coluna j� � fixa no valor da variavel
		// indiceColuna
		for (int i = 0; i < N; i++) {
			System.out.print(matrizes[i][indiceColuna] + " ");
		}
		System.out.println();

		// d) imprimir os elementos da diagonal principal da matriz.
		System.out.printf("DIAGONAL PRINCIPAL:  ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// ou no lugar de por um IF eu poderia simplesmente imprimir matrizes[i][i]
				if (i == j) {
					System.out.printf("%.1f ", matrizes[i][j]);
				}
			}
		}
		System.out.println();
		// e) alterar a matriz elevando ao quadrado todos os n�meros negativos da mesma.
		// Em seguida imprimir a matriz alterada.

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrizes[i][j] < 0) {
					matrizes[i][j] = Math.pow(matrizes[i][j], 2);
				}
			}
		}

		System.out.println("MATRIZ ALTERADA:  ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%.1f ", matrizes[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
