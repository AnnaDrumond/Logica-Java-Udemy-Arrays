package exemplo.funcoes.string;

public class Main01 {

	public static void main(String[] args) {
		
		// Fun��es interessantes em String

		String original = "abcde FGHIJ ABC abc DEFG ";
		
		System.out.println("Original: -" + original + "-");
		
		// para transformar para minusculas
		String s01 = original.toLowerCase();
		System.out.println("toLowerCase: -" + s01 + "-");
		
		// para transformar para maiusculas
		String s02 = original.toUpperCase();
		System.out.println("toUpperCase: -" + s02 + "-");
		
		// para remover espa�os em branco
		String s03 = original.trim();
		System.out.println("trim: -" + s03 + "-");
		
		// recortar - no caso abaixo � para pegar os caracteres ap�s o 2 car e apresentar
		String s04 = original.substring(2);
		System.out.println("substring(2): -" + s04 + "-");
		
		// recortar - no caso abaixo � para pegar os caracteres ap�s o 2 car e ANTES do 9 car e apresentar
		String s05 = original.substring(2, 9);
		System.out.println("substring(2, 9): -" + s05 + "-");
		
		// substituir - no caso abaixo o programa deve trocar todo 'a' por 'x'
		String s06 = original.replace('a', 'x');
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		
		// substituir - no caso abaixo o programa deve trocar todo 'abc' por 'xy'
		String s07 = original.replace("abc", "xy");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		
		// Buscar a primeira posicao de 'bc' na string - neste exemplo var i dever� valer 1
		// lembre que as posi��es ser�o de 0 em diante
		int i = original.indexOf("bc");
		System.out.println("Index of 'bc': " + i);
		
		
		// Buscar a �ltima posicao de 'bc' na string - neste exemplo var j dever� valer 17
		int j = original.lastIndexOf("bc");
		System.out.println("Last index of 'bc': " + j);
		
		String s = "potato apple lemon";
		
		// recorta uma String com base em um separador informado , no caso abaixo foi espa�o em branco(" ").
		@SuppressWarnings("unused")
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
		
	}

}
