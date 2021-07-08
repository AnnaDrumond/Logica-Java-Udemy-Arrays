package vetores;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		
		//a ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor
		// C onde cada elemento de C é a soma dos elementos
		// correspondentes de A e B. Imprima o vetor C gerado.

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];

		for (int index = 0; index < N; index++) {
			A[index] = sc.nextInt();
		}

		for (int index = 0; index < N; index++) {
			B[index] = sc.nextInt();
		}

		int[] C = new int[N];

		for (int index = 0; index < N; index++) {
			C[index] = A[index] + B[index];
			System.out.print(C[index] + " ");
		}

		sc.close();

	}

}
