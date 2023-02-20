import java.util.Scanner;

public class mayaldev {
    /*
    * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
    * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
    * gane cada punto del juego.
    * 
    * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
    * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
    *   15 - Love
    *   30 - Love
    *   30 - 15
    *   30 - 30
    *   40 - 30
    *   Deuce
    *   Ventaja P1
    *   Ha ganado el P1
    * - Si quieres, puedes controlar errores en la entrada de datos.   
    * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
    */
    public static void main(String[] args) {
    
        boolean finPartido = false;
        String ganador = new String();

        String[] tablaPuntos = {"Love", "15", "30", "40", "Ventaja", "Ganador"};
        int puntosP1 = 0;
        int puntosP2 = 0;
        boolean existeEmpate = false;

        while (!finPartido) {
            System.out.println("Introduce quien ha marcado. (P1, P2)");
            Scanner s = new Scanner(System.in);
            String marcaPunto = s.nextLine().toUpperCase();
            boolean errorJugador = false;

            switch (marcaPunto) {
                case "P1":
                    puntosP1++;
                    if (puntosP1 == tablaPuntos.length-1) {
                        ganador = "P1";
                        finPartido = true;
                    }
                    break;
                case "P2":
                    puntosP2++;
                    if (puntosP2 == tablaPuntos.length-1) {
                        ganador = "P2";
                        finPartido = true;
                    }
                    break;
            
                default:
                    System.out.println("Jugador inesperado. Introduce P1 ó P2.");
                    errorJugador = true;
                    break;
            }

            if (!finPartido && !errorJugador) {
                if (puntosP1 == 3 && puntosP2 == 3) {
                    existeEmpate = true;
                    System.out.println("Deuce");
                } else if (existeEmpate) {
                    existeEmpate = false;
                    System.out.println("Ventaja " + marcaPunto);
                } else if(puntosP1 == 4 && puntosP2 == 4){
                    puntosP1--;
                    puntosP2--;
                    existeEmpate = true;
                    System.out.println("Deuce");
                } else{
                    System.out.println(tablaPuntos[puntosP1] + " - " + tablaPuntos[puntosP2]);
                }
            }
            
        }

        System.out.println("Ha ganado el " + ganador);
    }
}