package HTTPrequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * HttpClientTest
 */
public class HttpClientTest {

  
  // var client = HttpClient.newHttpClient();
  //
  // var request = HttpRequest.newBuilder(
  // URI.create("https://animechan.io/api/v1/quotes/random"))
  // .header("accept", "application/json")
  // .build();
  //
  public void httpClientTestM() throws IOException, InterruptedException {

  // create a client
  HttpClient client = HttpClient.newHttpClient();

  // create a request

  HttpRequest request = HttpRequest.newBuilder(
      URI.create("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY"))
      .header("accept", "application/json")
      .build();

  // use the client to send the request
  HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    

    ObjectMapper mapper = new ObjectMapper();

    ApiResponse animeResponse = mapper.readValue(response.body(), ApiResponse.class);
    System.out.println(animeResponse.data().animedata().name());

    

  // the response:
  // System.out.println(response.body().get().title);
  }

}
