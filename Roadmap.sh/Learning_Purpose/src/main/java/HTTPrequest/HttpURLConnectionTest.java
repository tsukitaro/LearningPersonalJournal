package HTTPrequest;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * HttpURLConnection
 */
public class HttpURLConnectionTest {

  public static void main(String[] args) throws IOException {
    URL url = new URL("https://animechan.io/api/v1/quotes/random");


    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    connection.setRequestProperty("accept", "application/json");

    InputStream responseStream = connection.getInputStream();

    ObjectMapper mapper = new ObjectMapper();
    //APOD apod = mapper.readValue(responseStream, APOD.class);
    Anime anime = mapper.readValue(responseStream, Anime.class);
    System.out.println(anime.getName());
    

    
  }
}
