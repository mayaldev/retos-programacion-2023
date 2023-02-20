import java.util.Random;

/**
 * mayaldev
 */
public class mayaldev {
    /*
    * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
    * Podrás configurar generar contraseñas con los siguientes parámetros:
    * - Longitud: Entre 8 y 16.
    * - Con o sin letras mayúsculas.
    * - Con o sin números.
    * - Con o sin símbolos.
    * (Pudiendo combinar todos estos parámetros entre ellos)
    */
    public static void main(String[] args) {
        System.out.println("Esta es tu contraseña: " + generarPass(16, true, true, true));
    }

    public static String generarPass(int longitud, boolean mayus, boolean numeros, boolean simbolos){

        StringBuffer passGenerada = new StringBuffer();
        
        if (longitud < 8 || longitud > 16) {
            return new String("Longitud de contraseña invalida.");
        }

        for (int i = 0; i < longitud; i++) {
            Random rEleccion = new Random();
            int eleccion = rEleccion.nextInt(3);
            boolean eleccionValida = true;

            do {

                eleccionValida = true;
                
                if (eleccion == 0) {    //Genera numero
                    if (numeros) {
                        passGenerada.append(generaNumero());
                    } else{
                        eleccionValida = false;
                    }
                    
                } else if (eleccion == 1) { //Genera letra
                    passGenerada.append(generaLetra(mayus));

                } else { //Genera simbolo
                    if (simbolos) {
                        passGenerada.append(generaSimbol());
                    } else{
                        eleccionValida = false;
                    }
    
                }

                if(!eleccionValida){
                    eleccion++;
                    if (eleccion == 3) {
                        eleccion = 0;
                    }
                }

            } while (!eleccionValida);
            
        }

        return passGenerada.toString();
    }

    private static int generaNumero(){
        Random rNumber = new Random();
        return rNumber.nextInt(10);
    }

    private static String generaLetra(boolean mayus){
        String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        String letraSalida = new String();

        Random rLetra = new Random();
        letraSalida = abecedario[rLetra.nextInt(abecedario.length)];

        if (mayus) {
            Random rEleccion = new Random();
            rEleccion.nextInt(2);

            if (rEleccion.nextInt(2) == 0) {
                //Generamos mayus
                letraSalida += letraSalida.toUpperCase();
            }

        }
       
        return letraSalida;
    }

    private static String generaSimbol(){
        String[] simbolos = {"*", "-", "_", ";", ".", ",", "?", "¿", "¡", "!", "$", "#"};

        Random rSimbol = new Random();
        return simbolos[rSimbol.nextInt(simbolos.length)];
    }
}