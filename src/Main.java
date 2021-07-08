
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
		
		for (int index=0; index<n; index++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int soma = 0;
			int auxiliar = 0;
			
			// a variavel auxiliar é para definir que conte somente o incremento nos casos que x for impar
			// foi colocado x dentro de index2 para o codigo ficar mais limpo
			
			for (int index2=x; auxiliar<y; index2++) {
			
				if (index2 % 2 != 0) {
					soma = soma + index2;
					auxiliar = auxiliar + 1;
				}
			}
			
			System.out.println(soma);
		}
		sc.close();
	}
}
