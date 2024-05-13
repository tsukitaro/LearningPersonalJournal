package screenmatch.calculos;

import screenmatch.Pelicula;

/**
 * CalculadoraDeTiempo
 */
public class CalculadoraDeTiempo {

  private int tiempoTotal;

  public void incluye(Pelicula pelicula){
    tiempoTotal += pelicula.getDuracionEnMinutos();
  }
}
