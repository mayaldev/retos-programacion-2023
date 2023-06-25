import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class mayaldev {
    /*
    * Llamar a una API es una de las tareas más comunes en programación.
    *
    * Implementa una llamada HTTP a una API (la que tú quieras) y muestra su
    * resultado a través de la terminal. Por ejemplo: Pokémon, Marvel...
    *
    * Aquí tienes un listado de posibles APIs: 
    * https://github.com/public-apis/public-apis
    */

    private static final String BASE_URL = "https://pokeapi.co/api/v2/";

    public static void main(String[] args) {

        try {
            getNamePokemon(1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    private static void getNamePokemon(int idPokemon) throws IOException{
        callAPI("pokemon/" + idPokemon);
    }

    private static String callAPI(String endPoint) throws IOException{
        
        String responseCall = new String();

        URL url = new URL(BASE_URL + endPoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();

        if(responseCode != 200){
            throw new RuntimeException("Ha ocurrido un error. HTTPResponseCode: " + responseCode);
        }else{
            responseCall = conn.getResponseMessage();
        }

        conn.disconnect();
        
        return responseCall;
    }
}
