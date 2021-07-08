package vetores;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		 /* Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10].
		 *  Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o 
		 *  valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor 
		 *  em seguida. A entrada contém um valor inteiro (V<=50).Para cada posição do vetor, escreva 
		 *  "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. 
		 *  O primeiro número do vetor N (N[0]) irá receber o valor de V. */

		Scanner sc = new Scanner(System.in);
		
		int [] vetores = new int [10];
		
		// coloquei logo a posicao 0 recebendo o que o usuario escrever de inicio.
		vetores [0] = sc.nextInt();
		
		// neste for o int começa com 1, pois a posicao 0 esta preenchida com o dado acima.
		for (int i = 1 ; i < 10 ; i++){
			vetores [i] = vetores [i-1]*2;							
		}
		
		// este for começa em 0 para poder imprimir desde esta posição.	
		for (int i = 0 ; i < 10 ; i++){
			System.out.printf("N[%d] = %d%n", i , vetores[i]);
		}
		sc.close();
	}

}
