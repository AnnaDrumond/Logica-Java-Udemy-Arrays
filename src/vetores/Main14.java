package vetores;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {

		// Fibonacci em Vetor - URI 1176
		/*
		 * Faça um programa que leia um valor e apresente o número de Fibonacci
		 * correspondente a este valor lido. Lembre que os 2 primeiros elementos da
		 * série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a
		 * ele. Todos os valores de Fibonacci calculados neste problema devem caber em
		 * um inteiro e 64 bits sem sinal.Cada caso de teste contém um único inteiro N
		 * (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.
		 */

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		long[] fibonacci = new long[61];
		int auxiliar = 0;
		
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i <= 60; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
		}

		for (int j = 0; j < T; j++) {
			auxiliar = sc.nextInt();
			System.out.printf("Fib(%d) = %d\n", auxiliar, fibonacci[auxiliar]);
		}		
		sc.close();
	}
}
