package HTTPrequest;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

//import java.util.Iterator;

//import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * HttpURLConnection
 */
public class HttpURLConnectionTest {

  public void HttpTest() throws IOException {
    URL url = new URL("https://animechan.io/api/v1/quotes/random");

    ObjectMapper mapper = new ObjectMapper();

    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    connection.setRequestProperty("accept", "application/json");

    try (InputStream responseStream = connection.getInputStream()) {
      ApiResponse anime = mapper.readValue(responseStream, ApiResponse.class);
      System.out.println(responseStream);
      System.out.println(anime.data().content());
      System.out.println("hello");

    } catch (IOException e) {
      e.printStackTrace();
    }

    //
    // JsonNode jsonResponse = mapper.readTree(responseStream);
    //
    // JsonNode characterNode = jsonResponse.path("data").path("character");
    //
    // Iterator<JsonNode> elements = characterNode.elements();
    //
    // while (elements.hasNext()) {
    // JsonNode charNext = elements.next();
    // Anime anime = new
    // Anime(charNext.path("data").path("character").path("name").asText());
    // System.out.println(anime.getCharacter());
    //
    // }
    //
    // APOD apod = mapper.readValue(responseStream, APOD.class);

  }
}
