/**
 * Principal
 */
import screenmatch.modelos.Pelicula;
import screenmatch.modelos.Serie;

public class Principal {

  public static void main(String[] args) {
    Pelicula miPelicula = new Pelicula();
    miPelicula.setNombre("Encanto");
    miPelicula.setFechaDeLanzamiento(2021);
    miPelicula.setDuracionEnMinutos(120);
    miPelicula.setIncluidoEnElPlan(true);

    // System.out.println("Mi pelicula es: " + miPelicula.nombre);
    // System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

    miPelicula.muestraFichaTecnica();
    miPelicula.evalua(10);
    miPelicula.evalua(10);
    miPelicula.evalua(7.8);
    System.out.println("Media de eVAluaciones de la pelicula: " + miPelicula.calculaMedia());


    Serie casaDragon = new Serie();
    casaDragon.setNombre("La casa del dragon");
    casaDragon.setFechaDeLanzamiento(2022);
    casaDragon.setTemporadas(1);
    casaDragon.setMinutosPorEpisodio(50); 
    casaDragon.setEpisodiosPorTemprada(10);
    casaDragon.muestraFichaTecnica();
    System.out.println(casaDragon.getDuracionEnMinutos());

    // comentamos esto para seguir con el curso
    // System.out.println(miPelicula.getTotalDeLasEvaluaciones());
    // System.out.println(miPelicula.calculaMedia());

    


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
