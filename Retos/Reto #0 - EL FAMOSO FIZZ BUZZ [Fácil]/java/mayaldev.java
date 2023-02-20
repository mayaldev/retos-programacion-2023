/**
 * @author mayaldev
 *
 */
public class mayaldev {
	/*
	 * Escribe un programa que muestre por consola (con un print) los
	 * n�meros de 1 a 100 (ambos incluidos y con un salto de l�nea entre
	 * cada impresi�n), sustituyendo los siguientes:
	 * - M�ltiplos de 3 por la palabra "fizz".
	 * - M�ltiplos de 5 por la palabra "buzz".
	 * - M�ltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("fizzbuzz");
			} else if(i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
