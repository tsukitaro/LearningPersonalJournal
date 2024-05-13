/**
 * Principal
 */
import screenmatch.calculos.CalculadoraDeTiempo;
import screenmatch.calculos.FiltroRecomendacion;
import screenmatch.modelos.Episodio;
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

    Pelicula otraPelicula = new Pelicula();
    otraPelicula.setNombre("Matrix"); 
    otraPelicula.setFechaDeLanzamiento(1998);
    otraPelicula.setDuracionEnMinutos(180);   
    
    CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
    calculadora.incluye(miPelicula);
    calculadora.incluye(otraPelicula);
    System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: " + calculadora.getTiempoTotal());

    FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
    filtroRecomendacion.filtra(miPelicula);

    Episodio  episodio = new Episodio ();
    episodio.setNumero(1);
    episodio.setNombre("La casa Targaryen");
    episodio.setSerie(casaDragon);
    episodio.setTotalVisualizaciones(300);

    filtroRecomendacion.filtra(episodio);
    


    // comentamos esto para seguir con el curso
    // System.out.println(miPelicula.getTotalDeLasEvaluaciones());
    // System.out.println(miPelicula.calculaMedia());

    




    // System.out.println("Mi pelicula es: " + otraPelicula.nombre);
    // System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    // otraPelicula.muestraFichaTecnica();

  }
}
