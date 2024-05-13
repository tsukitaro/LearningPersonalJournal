package screenmatch.calculos;

import screenmatch.modelos.Pelicula;

/**
 * CalculadoraDeTiempo
 */
public class CalculadoraDeTiempo {

  private int tiempoTotal;

  public int getTiempoTotal() {
    return tiempoTotal;
  }

  public void incluye(Pelicula pelicula) {
    tiempoTotal += pelicula.getDuracionEnMinutos();
  }

}
