package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas
		// que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor
		// imprimir os nomes dos alunos aprovados,	considerando aprovados aqueles cuja média das notas seja >=6.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String [] nomes = new String [N];
		double [] notasUm = new double [N];
		double [] notasDois = new double [N];
		
		
		for ( int i = 0 ;  i< N ; i++) {
			nomes [i] = sc.next();
			notasUm [i] = sc.nextDouble();
			notasDois[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		// como nao preciso "armazenar" as medias dos alunos no meu problema, nao preciso usar um array / vetor
		
		for ( int i = 0 ;  i< N ; i++) {		
			double media = (notasUm [i] + notasDois[i] / 2.0);
			if ( media >= 6) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}

