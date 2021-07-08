package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];

		for (int index = 0; index < N; index++) {
			nomes[index] = sc.next();
			idades[index] = sc.nextInt();
			alturas[index] = sc.nextDouble();
		}

		double soma = 0.0;

		for (int index = 0; index < N; index++) {
			soma = soma + alturas[index];
		}

		double mediaAltura = soma / N;
		System.out.printf("Altura média: %.2f%n", mediaAltura);

		// auxiliar++ é o mesmo que auxiliar = auxiliar + 1
		int auxiliar = 0;
		for (int index = 0; index < N; index++) {
			if (idades[index] < 16) {
				auxiliar++;
			}
		}
		double percentual = auxiliar * 100.0 / N;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentual);

		sc.close();

	}

}
