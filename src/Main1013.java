import java.util.Locale;
import java.util.Scanner;

public class Main1013 {

	public static void main(String[] args) {
		// Fa�a um programa que leia tr�s valores inteiros e apresente o maior dos tr�s
		// valores lidos seguido da mensagem �eh o maior�.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, e;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		d = (a + b + Math.abs(a - b)) / 2;
		e = (d + c + Math.abs(d - c)) / 2;

		System.out.println(e + " eh o maior");

		sc.close();

	}

}
