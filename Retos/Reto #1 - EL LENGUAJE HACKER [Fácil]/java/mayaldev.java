import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mayaldev {

	/*
	 * Escribe un programa que reciba un texto y transforme lenguaje natural a
	 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
	 *  se caracteriza por sustituir caracteres alfanum�ricos.
	 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
	 *   con el alfabeto y los n�meros en "leet".
	 *   (Usa la primera opci�n de cada transformaci�n. Por ejemplo "4" para la "a")
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("1", "L");
		diccionario.put("2", "R");
		diccionario.put("3", "E");
		diccionario.put("4", "A");
		diccionario.put("5", "S");
		diccionario.put("6", "b");
		diccionario.put("7", "T");
		diccionario.put("8", "B");
		diccionario.put("9", "g");
		diccionario.put("0", "o");

		diccionario.put("a", "4");
		diccionario.put("b", "13");
		diccionario.put("c", "[");
		diccionario.put("d", ")");
		diccionario.put("e", "3");
		diccionario.put("f", "|=");
		diccionario.put("g", "&");
		diccionario.put("h", "#");
		diccionario.put("i", "1");
		diccionario.put("j", ",_|");
		diccionario.put("k", ">|");
		diccionario.put("l", "1");
		diccionario.put("m", "/\\/\\");
		diccionario.put("n", "^/");
		diccionario.put("o", "0");
		diccionario.put("p", "|*");
		diccionario.put("q", "(_,)");
		diccionario.put("r", "12");
		diccionario.put("s", "5");
		diccionario.put("t", "7");
		diccionario.put("u", "(_)");
		diccionario.put("v", "\\/");
		diccionario.put("w", "\\/\\/");
		diccionario.put("x", "><");
		diccionario.put("y", "j");
		diccionario.put("z", "2");


		try (Scanner scanner = new Scanner(System.in)) {
			String texto = scanner.nextLine();
			StringBuffer textoSalida = new StringBuffer();

			for (int i = 0; i < texto.length(); i++) {
				if(null != diccionario.get(Character.toString(texto.toLowerCase().charAt(i)))){
					textoSalida.append(diccionario.get(Character.toString(texto.toLowerCase().charAt(i))));
				} else{
					textoSalida.append(texto.charAt(i));
				}
			}
			
			System.out.println("Texto cifrado: " + textoSalida);
		}
		
	}

}
