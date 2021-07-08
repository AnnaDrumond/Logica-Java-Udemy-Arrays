package matrizes;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		/*
		 * O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1,
		 * sendo cada fila com a mesma quantidade de soldados. No caso, a organização do
		 * pelotão é em 3 filas (1,2,3) com 8 soldados em cada uma.Um dos exercícios que o
		 * sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste
		 * em dizer o número de uma fila, de modo que os soldados desta fila devem se
		 * mover para a direita, e o último soldado da direita vai para a posição mais à
		 * esquerda. Você deve fazer um programa para ler a formação do pelotão e
		 * executar o exercício "girar fila".A entrada consiste em um inteiro M
		 * representando o número de filas, um inteiro N representado a quantidade de
		 * soldados por fila, as M filas de soldados (cada soldado é representado por um
		 * número inteiro), e o número inteiro para o exercício "girar fila". A saída
		 * contém a formação do pelotão após a execução do exercício "girar fila"
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

		// como o usuario digita a fila somente após digitar os elementos da matriz,
		// isso só entra aqui
		int fila = sc.nextInt();

		// como uma matriz comeca na linha 0, vamos decrementar o valor da fila
		fila = fila - 1;

		// passo 1: vamos salvar o ultimo da fila escolhida, sempre considerando a
		// ultima fila como N-1, pois a matriz começa em 0
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
