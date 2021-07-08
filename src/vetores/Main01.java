package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vetor = new double[N];

		// primeiro "for" para armazenar/ler os dados dentro do vetor
		// aproveito o valor de "index" para aceder a posição do vetor

		for (int index = 0; index < N; index++) {
			vetor[index] = sc.nextDouble();
		}

		// agora, um segundo for para imprimir a posição do vetor

		for (int index = 0; index < N; index++) {	
			System.out.printf("%.2f%n", vetor[index]);
		}

		sc.close();
	}
}
