package matrizes;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		/*
		 * O sargento Silva organiza seu pelot�o em M filas numeradas a partir de 1,
		 * sendo cada fila com a mesma quantidade de soldados. No caso, a organiza��o do
		 * pelot�o � em 3 filas (1,2,3) com 8 soldados em cada uma.Um dos exerc�cios que o
		 * sargento Silva realiza com o pelot�o � o exerc�cio "girar fila", que consiste
		 * em dizer o n�mero de uma fila, de modo que os soldados desta fila devem se
		 * mover para a direita, e o �ltimo soldado da direita vai para a posi��o mais �
		 * esquerda. Voc� deve fazer um programa para ler a forma��o do pelot�o e
		 * executar o exerc�cio "girar fila".A entrada consiste em um inteiro M
		 * representando o n�mero de filas, um inteiro N representado a quantidade de
		 * soldados por fila, as M filas de soldados (cada soldado � representado por um
		 * n�mero inteiro), e o n�mero inteiro para o exerc�cio "girar fila". A sa�da
		 * cont�m a forma��o do pelot�o ap�s a execu��o do exerc�cio "girar fila"
		 */

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] matrizes = new int[M][N];

		// leitura dos dados de entrada, armazenando dos numeros dentro da matriz
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrizes[i][j] = sc.nextInt();
			}
		}

		// como o usuario digita a fila somente ap�s digitar os elementos da matriz,
		// isso s� entra aqui
		int fila = sc.nextInt();

		// como uma matriz comeca na linha 0, vamos decrementar o valor da fila
		fila = fila - 1;

		// passo 1: vamos salvar o ultimo da fila escolhida, sempre considerando a
		// ultima fila como N-1, pois a matriz come�a em 0
		int ultimoDaFila = matrizes[fila][N - 1];

		// passo 2: vamos mover todos da fila (menos o ultimo) para a direita,
		// mas teremos que fazer isso da direita para a esquerda (contagem decrescente)
		for (int j = N - 1; j > 0; j--) {
			matrizes[fila][j] = matrizes[fila][j - 1];
		}

		// passo 3: agora vamos armazenar o ultimo na primeira posicao da fila
		matrizes[fila][0] = ultimoDaFila;

		// pronto! Agora vamos imprimir a matriz alterada:
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrizes[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
