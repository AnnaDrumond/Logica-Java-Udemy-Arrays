package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma
		 * matriz de M linhas e N colunas contendo números double. Gerar um vetor de
		 * modo que cada elemento do vetor seja a soma dos elementos da linha M
		 * correspondente da matriz. Mostrar o vetor gerado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		double[][] numeros = new double[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				numeros[i][j] = sc.nextDouble();
			}
		}

		// Agora vamos criar um vetor com M posições, pois a questão diz "elementos da linha"

		double[] vetores = new double[M];

		for (int i = 0; i < M; i++) {
		// declaro aqui a variavel para quando o loop recomeçar, ela estar novamente como zero
			double soma = 0.0;
			for (int j = 0; j < N; j++) {
				soma = soma + numeros[i][j];
			}
		// vai imprimir primeiro a soma dos elementos da linha 0, depois da linha e ...	
			vetores[i] = soma;
		}
		
		// aqui o for irá rodar até i ser menor que "m", porque M é o tamanho do meu vetor
		for (int i = 0; i < M; i++) {
			System.out.printf("%.1f%n", vetores[i]);
		}

		sc.close();

	}

}
