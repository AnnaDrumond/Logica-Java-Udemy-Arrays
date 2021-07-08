package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double [] vetor = new double [N];
		double soma = 0;

		for (int index = 0; index < N; index++) {
			 vetor [index] = sc.nextDouble();			  
			 soma = soma + vetor [index];
		}
		
		double media = soma / N;
		
		for (int index = 0; index < N; index++) {
			
			System.out.print(vetor[index] + " ");
		}
		System.out.println( );
		System.out.printf("%.2f%n",soma);
		System.out.printf("%.2f%n",media);
		
		
		sc.close();

	}

}
