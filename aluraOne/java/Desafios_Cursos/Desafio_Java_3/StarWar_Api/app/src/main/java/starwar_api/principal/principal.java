package starwar_api.principal;

import java.io.IOException;
import java.util.Scanner;

import starwar_api.modulos.Consulta;
import starwar_api.modulos.GeneradorDeArchivo;
import starwar_api.modulos.Pelicula;

/**
 * principal
 */
public class principal {

  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);

    Consulta consulta = new Consulta();
    System.out.println("Indique el numero de la pelicula a consultar");

    try {
      var numeroPelicula = Integer.valueOf(lectura.nextLine());
      Pelicula pelicula = consulta.buscaPelicula(Integer.valueOf(numeroPelicula));
      System.out.println(pelicula);

      GeneradorDeArchivo generador = new GeneradorDeArchivo();
      generador.guardarJson(pelicula);

    } catch (NumberFormatException e){
      System.out.println("No se encontro el número "+e.getMessage());
      
    } catch (RuntimeException | IOException e) {
      System.out.println(e.getMessage());
      System.out.println("Finaliza el progama.");
    }
    // var numeroPelicula = lectura.nextLine();
    // Pelicula pelicula = consulta.buscaPelicula(Integer.valueOf(numeroPelicula));
    // System.out.println(pelicula);

    lectura.close();

  }
}
