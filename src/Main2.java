import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int maior, menor;
		

		do {

			if (M > N) {
				maior = M;
				menor = N;
			} else {
				maior = N;
				menor = M;
			}
			
			int soma = 0;
			
			for (int i = menor; i <= maior; i++) {
				System.out.print(i + " ");
				soma += i;
			}
			System.out.println("Sum=" + soma);
			M = sc.nextInt();
			N = sc.nextInt();
			soma = 0;
			
		} while (M > 0 && N > 0);

		sc.close();

	}

}
