package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		// leia N n�meros reais e armazene-os em um vetor
		// mostrar na tela o maior n�mero 		do vetor (supor n�o haver empates). 
		// Mostrar tamb�m a posi��o do maior elemento.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] numeros = new double[N];

		for (int index = 0; index < N; index++) {
			numeros[index] = sc.nextDouble();
		}

		double maior = 0.0;
		int posicao = 0;

		for (int index = 0; index < N; index++) {

			if (numeros[index] > maior) {
				maior = numeros[index];
				posicao = index;
			}
		}
		System.out.printf("%.1f%n",maior);
		System.out.println(posicao);

		sc.close();

	}

}
