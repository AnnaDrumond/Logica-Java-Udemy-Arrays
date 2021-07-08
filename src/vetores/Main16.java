package vetores;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		 /* Leia um valor e fa�a um programa que coloque o valor lido na primeira posi��o de um vetor N[10].
		 *  Em cada posi��o subsequente, coloque o dobro do valor da posi��o anterior. Por exemplo, se o 
		 *  valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor 
		 *  em seguida. A entrada cont�m um valor inteiro (V<=50).Para cada posi��o do vetor, escreva 
		 *  "N[i] = X", onde i � a posi��o do vetor e X � o valor armazenado na posi��o i. 
		 *  O primeiro n�mero do vetor N (N[0]) ir� receber o valor de V. */

		Scanner sc = new Scanner(System.in);
		
		int [] vetores = new int [10];
		
		// coloquei logo a posicao 0 recebendo o que o usuario escrever de inicio.
		vetores [0] = sc.nextInt();
		
		// neste for o int come�a com 1, pois a posicao 0 esta preenchida com o dado acima.
		for (int i = 1 ; i < 10 ; i++){
			vetores [i] = vetores [i-1]*2;							
		}
		
		// este for come�a em 0 para poder imprimir desde esta posi��o.	
		for (int i = 0 ; i < 10 ; i++){
			System.out.printf("N[%d] = %d%n", i , vetores[i]);
		}
		sc.close();
	}

}
