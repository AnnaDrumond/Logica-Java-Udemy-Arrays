package vetores;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		
		//leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
		//- todos os números pares
		//- a quantidade de números pares

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numeros = new int[N];

		for (int index = 0; index < N; index++) {
			numeros[index] = sc.nextInt();
		}

		int quantidade = 0;

		for (int index = 0; index < N; index++) {

			if (numeros[index] % 2 == 0) {
				quantidade += 1;
				System.out.print(numeros[index] + " ");
			}
		}
		System.out.println();
		System.out.println(quantidade);

		sc.close();

	}

}
