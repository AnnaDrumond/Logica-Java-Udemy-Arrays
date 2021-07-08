package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		/*
		 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa Para isto, 
		 * mandou digitar um conjunto de N mercadorias, cada uma contendo: nome, preço de compra e preço de venda 
		 * das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
		 * proporcionaram:--- lucro< 10% --- 10% ≤ lucro ≤ 20% --- lucro> 20% --- Determine e escreva também 
		 * o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];
		double[] precosCompra = new double[N];
		double[] precosVenda = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			precosCompra[i] = sc.nextDouble();
			precosVenda[i] = sc.nextDouble();
		}

		int totalLucroMinimo = 0;
		int totalLucroMedio = 0;
		int totalLucroMaximo = 0;

		for (int i = 0; i < N; i++) {
			
			double lucro = precosVenda[i] - precosCompra[i];			
			if (lucro < (precosCompra[i] * 0.1)) {
				totalLucroMinimo++;
			} else if (lucro >= (precosCompra[i] * 0.1) && lucro <= (precosCompra[i] * 0.2)) {
				totalLucroMedio++;
			} else {
				totalLucroMaximo++;
			}
		}
				
		System.out.println("Lucro abaixo de 10%: " + totalLucroMinimo);
		System.out.println("Lucro entre 10% e 20%: " + totalLucroMedio);
		System.out.println("Lucro acima de 20%: " + totalLucroMaximo);
		
		double valorTotalCompra = 0.0;
		double valorTotalVenda = 0.0;
		
		for (int i = 0; i < N; i++) {
			valorTotalCompra = valorTotalCompra + precosCompra[i];
			valorTotalVenda = valorTotalVenda + precosVenda[i];
		}
		double somaLucros = valorTotalVenda - valorTotalCompra;
		
		System.out.printf("Valor total de compra: %.2f%n", valorTotalCompra);
		System.out.printf("Valor total de venda: %.2f%n", valorTotalVenda);	
		System.out.printf("Lucro total: %.2f%n", somaLucros);
		
		sc.close();

	}

}
