import java.util.Scanner;

public class mayaldev {
    /*
    * Crea un programa que simule el comportamiento del sombrero selccionador del
    * universo mágico de Harry Potter.
    * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
    * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
    * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
    *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
    * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
    *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
    */
    public static void main(String[] args) {
        int puntos = 0;
        int preguntas = 5;
        String casa = new String();

        for (int i = 1; i <= preguntas; i++) {

            System.out.println("Pregunta "+ i + ": ");
            Scanner s = new Scanner(System.in);
            String respuesta = s.nextLine();

            switch (respuesta) {
                case "1":
                    puntos++;
                    break;
                case "2":
                    puntos+=2;
                    break;
                case "3":
                     puntos+=3;
                    break;
                case "4":
                    puntos+=4;
                    break;
            
                default:
                    System.out.println("Respuesta incorrecta");
                    i--;
                    break;
            }
            
        }

        if (puntos >= 5 && puntos < 10) {
            casa = "Gryffindor";
        } else if (puntos >= 10 && puntos < 15) {
            casa = "Slytherin";
        } else if (puntos >= 15 && puntos < 20) {
            casa = "Hufflepuff";
        } else {
            casa = "Ravenclaw";
        }

        System.out.println("Perteneces a la casa: " + casa);

    }
}
