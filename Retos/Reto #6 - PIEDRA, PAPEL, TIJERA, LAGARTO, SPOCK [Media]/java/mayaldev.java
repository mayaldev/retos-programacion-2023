import java.util.HashMap;
import java.util.Map;

public class mayaldev {
    /*
    * Crea un programa que calcule quien gana más partidas al piedra,
    * papel, tijera, lagarto, spock.
    * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
    * - La función recibe un listado que contiene pares, representando cada jugada.
    * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
    *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
    * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
    * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
    *
    * -- Reglas --
    * Tijeras cortan papel
    * Papel cubre piedra
    * Piedra aplasta lagarto
    * Lagarto envenena Spock
    * Spock destruye tijeras
    * Tijeras decapitan lagarto
    * Lagarto come papel
    * Papel desaprueba Spock
    * Spock vaporiza piedra
    * Piedra aplasta tijeras
    *
    */
    public static void main(String[] args) {     

        String[][] listPar = {{"🗿", "✂️"}, {"✂️", "🗿"}, {"📄", "✂️"}};
        //String[][] listPar = {{"🗿", "🗿"}};
        //String[][] listPar = {{"🗿", "✂️"}};
        //String[][] listPar = {{"✂️", "🗿"}};

        System.out.println(calculaPartida(listPar));
    }

    private static String calculaPartida(String[][] listPar){
        String ganador = new String();
        int contJugador1=0;
        int contJugador2=0;

        for (String[] par : listPar) {
            int hacePunto = calculaGanadorJugada(par[0], par[1]);
            if (hacePunto == 1) {
                contJugador1++;
            } else if (hacePunto == 2) {
                contJugador2++;
            }
        }

        if (contJugador1 > contJugador2) {
            ganador = "Gana Player 1";
        } else if (contJugador1 < contJugador2) {
            ganador = "Gana Player 2";
        } else {
            ganador = "Tie (empate)";
        }

        return ganador;
    }

    /**
     * Si gana jugador 1 devuelve 1
     * Si gana jugador 2 devuelve 2
     * Si hay empate devuelve 0
     * 
     * @param player1
     * @param player2
     * @return
     */
    private static int calculaGanadorJugada(String player1, String player2){
        Map<String, String[]> reglas = new HashMap<String, String[]>();
        reglas.put("🗿", new String[] {"✂️", "🦎"});
        reglas.put("📄", new String[] {"🗿", "🖖"});
        reglas.put("✂️", new String[] {"📄", "🦎"});
        reglas.put("🦎", new String[] {"🖖", "📄"});
        reglas.put("🖖", new String[] {"🗿", "✂️"});
        
        if (player1 != player2) {
            boolean encontrado = false;
            String[] values = reglas.get(player1);

            for (String gana : values) {
                if (gana.equals(player2)) {
                    encontrado=true;
                    break;
                }else{
                    encontrado=false;
                }
            }

            if (encontrado) {
                return 1;
            }else{
                return 2;
            }

        } else {
            return 0;
        }
    }
}