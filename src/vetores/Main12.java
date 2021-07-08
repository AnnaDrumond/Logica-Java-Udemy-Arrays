package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas
		 * Fazer um programa que calcule e escreva: a maior e a menor altura do grupo -
		 * a média de altura das mulheres - o número de homens
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] alturas = new double[N];
		char[] generos = new char[N];

		// Considere na entrada digitar altura com 2 pontos flutuantes + espaço + genero
		// (M ou F)

		for (int i = 0; i < N; i++) {
			alturas[i] = sc.nextDouble();
			generos[i] = sc.next().charAt(0);
		}

		double maior = alturas[0];
		double menor = alturas[0];

		for (int i = 0; i < N; i++) {
			if (maior < alturas[i]) {
				maior = alturas[i];
			}
			if (alturas[i] < menor) {
				menor = alturas[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);

		double somaAlturaMulheres = 0.0;
		int totalHomens = 0;
		int totalMulheres = 0;

		for (int i = 0; i < N; i++) {

			if (generos[i] == 'F') {
				somaAlturaMulheres += alturas[i];
				totalMulheres++;
			} else {
				totalHomens++;
			}
		}

		if (totalMulheres == 0) {
			System.out.println("Nao ha nenhuma mulher dentre as pessoas");
		} else {
			double mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;
			System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		}

		System.out.println("Numero de homens = " + totalHomens);

		sc.close();

	}

}
