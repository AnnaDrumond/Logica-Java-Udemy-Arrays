package matrizes;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		/* Ler dois números M e N, e depois ler uma matriz MxN de números inteiros,
		   Em seguida, mostrar na tela somente os números negativos da matriz 
		   A entrada contém os números M e N na mesma linha, depois os dados da matriz.*/

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] matrizes = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrizes [i][j]= sc.nextInt();
			}
		}
		System.out.println("VALORES NEGATIVOS: ");
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if ( matrizes [i][j] < 0) {
					System.out.println(matrizes [i][j]);
				}
			}
		}
		

		sc.close();

	}

}
