package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		// Fazer um programa para ler um vetor de N números reais.
		// Em seguida, mostrar na tela a média aritmética de todos
		// elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da
		// média

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] numeros = new double[N];
		double soma = 0.0;

		for (int i = 0; i < N; i++) {
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}

		double media = soma / N;

		System.out.printf("%.3f%n", media);

		for (int i = 0; i < N; i++) {

			if (numeros[i] < media) {
				System.out.printf("%.1f%n", numeros[i]);
			}
		}

		sc.close();

	}

}
