package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
		// Fazer um programa para ler um vetor de N números inteiros
		// mostrar na tela a média aritmética somente dos números pares lidos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numeros = new int[N];

		for (int i = 0; i < N; i++) {
			numeros[i] = sc.nextInt();
		}

		int soma = 0;
		// a var abaixo é para guardar a informacao da qtde de numeros pares
		int quantidade = 0;

		for (int i = 0; i < N; i++) {

			if (numeros[i] % 2 == 0) {
				soma += numeros[i];
				quantidade++;
			}
		}

		if (quantidade == 0) {
			System.out.println("Nao havia nenhum numero par");
		} else {
			double media = (double) soma / quantidade;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
