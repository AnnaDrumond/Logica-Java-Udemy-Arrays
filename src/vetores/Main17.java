package vetores;

import java.io.IOException;
import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) throws IOException {
		/*
		 * Faça um programa que leia um valor T e preencha um vetor N[1000] com a
		 * sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo.
		 * Imprima o vetor N. A entrada contém um valor inteiro T (2 ≤ T ≤ 50). Para
		 * cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é
		 * o valor armazenado naquela posição.
		 */

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] N = new int[1000];
		int auxiliar = 0;

		while (auxiliar < 999) {

			for (int j = 0; j < T; j++) {

				if (auxiliar > 999)

					break;

				N[auxiliar] = j;
				auxiliar++;
			}
		}

		for (int i = 0; i < N.length; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		
		sc.close();
	}
	
}
