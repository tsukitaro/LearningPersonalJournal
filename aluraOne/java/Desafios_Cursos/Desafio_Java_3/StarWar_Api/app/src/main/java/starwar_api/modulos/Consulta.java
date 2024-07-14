package starwar_api.modulos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

/**
 * Consulta
 */
public class Consulta {

  public Pelicula buscaPelicula(int numeroPelicula) {

    URI direccion = URI.create("https://swapi.dev/api/films/" + numeroPelicula);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(direccion)
        .build();

    try {
      HttpResponse<String> response = client
          .send(request, BodyHandlers.ofString());

      return new Gson().fromJson(response.body(), Pelicula.class);
      // se tratan los erroes y se envia a RuntimeException
    } catch (Exception e) {
      throw new RuntimeException("No se encuentra pelicula");
    }

  }

}
