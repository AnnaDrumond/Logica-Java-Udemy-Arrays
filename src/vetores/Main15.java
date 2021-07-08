package vetores;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		// URI 1172
		/*
		 * Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os
		 * valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X. A
		 * entrada contém 10 valores inteiros, positivos ou negativos. Para cada posição
		 * do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor
		 * armazenado naquela posição
		 */

		Scanner sc = new Scanner(System.in);

		int[] vetores = new int[10];

		for (int i = 0; i < 10; i++) {
			vetores[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			
			if ( vetores [i] <= 0) {
				vetores [i] = 1;
			}
			System.out.printf("X[%d] = %d%n", i , vetores[i]);
		}
		sc.close();
	}
}
