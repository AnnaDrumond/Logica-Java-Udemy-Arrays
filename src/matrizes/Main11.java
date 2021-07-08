package matrizes;

import java.util.Scanner;

public class Main11 {

	/*
	 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N
	 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a
	 * quantidade de valores negativos da matriz
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor de N na sua matriz de ordem N: ");
		int N = sc.nextInt();

		System.out.println("\nInforme os elementos da matriz: ");
		// declarar e instanciar a matriz:~
		int[][] matriz = new int[N][N];

		for (int i = 0; i <matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// mostrar a diagonal principal ( main diagonal):
		System.out.print("\nMatriz principal: ");
		for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][i] + " ");
		}

		// Mostrar a quantidade de valores negativos da matriz ( negative numbers):
		int menor = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					menor = menor + 1;
				}
			}
		}

		System.out.print("\nA quantidade de elementos negativos da matriz é: " + menor);

	}

}
