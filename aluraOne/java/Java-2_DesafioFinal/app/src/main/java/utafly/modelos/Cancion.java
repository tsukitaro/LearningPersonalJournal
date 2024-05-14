package utafly.modelos;

/**
 * Cancion
 */
public class Cancion extends Audio {

  private String album;
  private String Autor;
  private String Genero;

  @Override
  public int getClasificacion() {
      if (getTotalDeMeGusta()>3500) {
        return 4;
      }else {
      return 2;
    }
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getAutor() {
    return Autor;
  }

  public void setAutor(String autor) {
    Autor = autor;
  }

  public String getGenero() {
    return Genero;
  }

  public void setGenero(String genero) {
    Genero = genero;
  }

}
