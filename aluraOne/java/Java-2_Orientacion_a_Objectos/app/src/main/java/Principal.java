/**
 * Principal
 */
public class Principal {

  public static void main(String[] args) {
    Pelicula miPelicula = new Pelicula();
    miPelicula.nombre = "Encanto";
    miPelicula.fechaDeLanzamiento = 2021;
    miPelicula.duracionEnMinutos = 120;

    // System.out.println("Mi pelicula es: " + miPelicula.nombre);
    // System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

    miPelicula.muestraFichaTecnica();
    miPelicula.evalua(10);
    miPelicula.evalua(10);
    miPelicula.evalua(7.8);

    System.out.println(miPelicula.getTotalDeLasEvaluaciones());
    System.out.println(miPelicula.calculaMedia());

    


    // Pelicula otraPelicula = new Pelicula();
    // otraPelicula.nombre = "Matrix";
    // otraPelicula.fechaDeLanzamiento = 1998;
    // otraPelicula.duracionEnMinutos = 180;
    // 
    // // System.out.println("Mi pelicula es: " + otraPelicula.nombre);
    // // System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    // otraPelicula.muestraFichaTecnica();

  }
}
