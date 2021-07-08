package vetores;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] vetor = new int[N];

		for (int index = 0; index < N; index++) {
			vetor[index] = sc.nextInt();
		}

		for (int index = 0; index < N; index++) {
			if (vetor[index] < 0) {				
				System.out.println(vetor[index]);
			}
		}
		
		sc.close();
	}
}
