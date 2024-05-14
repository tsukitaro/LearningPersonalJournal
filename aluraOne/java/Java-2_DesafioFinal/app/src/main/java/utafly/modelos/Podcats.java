package utafly.modelos;

/**
 * Podcats
 */
public class Podcats extends Audio {

  private String presentador;
  private String descripcion;
  private String participantes;

  @Override
  public int getClasificacion() {
      if (getTotalDeReproducciones()>5000) {
        return 9;
      }else {
      return 2;
    } 
  }

  public String getPresentador() {
    return presentador;
  }

  public void setPresentador(String presentador) {
    this.presentador = presentador;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getParticipantes() {
    return participantes;
  }

  public void setParticipantes(String participantes) {
    this.participantes = participantes;
  }

}
