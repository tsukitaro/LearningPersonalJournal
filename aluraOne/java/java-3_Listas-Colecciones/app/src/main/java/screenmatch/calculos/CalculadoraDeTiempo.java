package screenmatch.calculos;

import screenmatch.modelos.Titulo;

/**
 * CalculadoraDeTiempo
 */
public class CalculadoraDeTiempo {

  private int tiempoTotal;

  public int getTiempoTotal() {
    return tiempoTotal;
  }

  public void incluye(Titulo titulo) {
    this.tiempoTotal += titulo.getDuracionEnMinutos();
  }

}
