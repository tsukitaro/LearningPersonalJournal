package screenmatch.principal;

import java.util.ArrayList;

import screenmatch.modelos.Pelicula;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

/**
 * PrincipalConListas
 */
public class PrincipalConListas {

  public static void main(String[] args) {
         Pelicula miPelicula = new Pelicula("Encanto", 2001);
    Pelicula otraPelicula = new Pelicula("Matrix", 1998);
    var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
    Serie casaDragon = new Serie("La casa del dragon", 2022);


    
     ArrayList<Titulo> lista = new ArrayList<>();
    lista.add(peliculaDeBruno);
    lista.add(miPelicula);
    lista.add(otraPelicula);
    lista.add(casaDragon);
    // cambiamos el objeto a titulo de pelicula para que tome series y peliculas 
    //
    
    for (Titulo item : lista) {
      System.out.println(item);
    }

   
  }
}
