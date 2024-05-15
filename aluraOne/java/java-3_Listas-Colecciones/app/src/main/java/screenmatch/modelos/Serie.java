package screenmatch.modelos;

/**
 * Serie
 */
public class Serie extends Titulo{

  private int temporadas;
  private int episodiosPorTemprada;
  private int minutosPorEpisodio;

  @Override
  public int getDuracionEnMinutos() {
    return temporadas * episodiosPorTemprada * minutosPorEpisodio;
  }
 
  
  public int getTemporadas() {
    return temporadas;
  }
  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }
  public int getEpisodiosPorTemprada() {
    return episodiosPorTemprada;
  }
  public void setEpisodiosPorTemprada(int episodiosPorTemprada) {
    this.episodiosPorTemprada = episodiosPorTemprada;
  }
  public int getMinutosPorEpisodio() {
    return minutosPorEpisodio;
  }
  public void setMinutosPorEpisodio(int minutosPorEpisodio) {
    this.minutosPorEpisodio = minutosPorEpisodio;
  }

  
}
