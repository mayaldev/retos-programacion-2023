import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class mayaldev {
    /*
    * Crea 3 funciones, cada una encargada de detectar si una cadena de
    * texto es un heterograma (no contiene letras repetidas), un isograma(cada letra aparece el mismo numero de veces repetida)
     o un pangrama(textos en los que debe aparecer todas las letras del abecedario).
    * - Debes buscar la definición de cada uno de estos términos.
    */
    public static void main(String[] args) {

        String texto = "El veloz murcielago hindu comia feliz cardillo y kiwi. La cigueña tocaba el saxofon detras del palenque de paja";
        
        System.out.println(esHetergrama(texto) ? "Es Heterograma" : "No es Heterograma");
        System.out.println(esIsograma(texto) ? "Es Isograma" : "No es Isograma");
        System.out.println(esPangrama(texto) ? "Es Panagrama" : "No es Panagrama");

    }

    private static boolean esHetergrama(String text){

        String[] arrayText = text.split("");
        Map<String, Integer> mapa = new HashMap<String, Integer>();

        for (String character : arrayText) {
            if(character.matches("[a-zA-Z]")){
                mapa.put(character, null != mapa.get(character) ? + mapa.get(character) + 1 : 1);
                if (mapa.get(character) > 1) {
                    return false;
                }
            }
        }
        
        return true;
    };

    private static boolean esIsograma(String text){

        String[] arrayText = text.split("");
        Map<String, Integer> mapa = new HashMap<String, Integer>();

        for (String character : arrayText) {
            if(character.matches("[a-zA-Z]")){
                mapa.put(character, null != mapa.get(character) ? + mapa.get(character) + 1 : 1);
                
            }
        }
        
        Integer primerValor = 0;
        boolean getPrimerValor = true;
        for (Integer value : mapa.values()) {
            if (getPrimerValor) {
                primerValor = value;
                getPrimerValor = false;
            }

            if (value != primerValor) {
                return false;
            }
        }

        return true;
    };

    private static boolean esPangrama(String text){

        String[] arrayText = text.split("");
        Map<String, Boolean> abecedario = new HashMap<String, Boolean>();

        for (String character : arrayText) {
            if(character.matches("[a-zA-Zñ]")){
                abecedario.put(character.toLowerCase(), true);
            }
        }

        return abecedario.size() != 27 ? false : true;
    };
    
}
