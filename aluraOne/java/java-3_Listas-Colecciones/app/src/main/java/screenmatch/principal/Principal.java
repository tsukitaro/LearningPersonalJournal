package screenmatch.principal;

import java.util.ArrayList;

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
    Pelicula miPelicula = new Pelicula("Encanto", 2001);
    miPelicula.setFechaDeLanzamiento(2021);
    miPelicula.setDuracionEnMinutos(120);
    miPelicula.setIncluidoEnElPlan(true);

    // System.out.println("Mi pelicula es: " + miPelicula.nombre);
    // System.out.println("Su fecha de lanzamiento es: " +
    // miPelicula.fechaDeLanzamiento);

    miPelicula.muestraFichaTecnica();
    miPelicula.evalua(10);
    miPelicula.evalua(10);
    miPelicula.evalua(7.8);
    System.out.println("Media de eVAluaciones de la pelicula: " + miPelicula.calculaMedia());

    Serie casaDragon = new Serie("La casa del dragon", 2022);
    casaDragon.setTemporadas(1);
    casaDragon.setMinutosPorEpisodio(50);
    casaDragon.setEpisodiosPorTemprada(10);
    casaDragon.muestraFichaTecnica();
    System.out.println(casaDragon.getDuracionEnMinutos());

    Pelicula otraPelicula = new Pelicula("Matrix", 1998);
    otraPelicula.setDuracionEnMinutos(180);

    CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
    calculadora.incluye(miPelicula);
    calculadora.incluye(otraPelicula);
    System.out
        .println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: " + calculadora.getTiempoTotal());

    FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
    filtroRecomendacion.filtra(miPelicula);

    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setNombre("La casa Targaryen");
    episodio.setSerie(casaDragon);
    episodio.setTotalVisualizaciones(300);

    filtroRecomendacion.filtra(episodio);

    // usar var para usar una inferencia del tipo de dato
    var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
    // peliculaDeBruno.setNombre();
    peliculaDeBruno.setDuracionEnMinutos(100);

    ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
    listaDePeliculas.add(peliculaDeBruno);
    listaDePeliculas.add(miPelicula);
    listaDePeliculas.add(otraPelicula);

    System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
    System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

    System.out.println(listaDePeliculas.get(0).toString());

    // comentamos esto para seguir con el curso
    // System.out.println(miPelicula.getTotalDeLasEvaluaciones());
    // System.out.println(miPelicula.calculaMedia());

    // System.out.println("Mi pelicula es: " + otraPelicula.nombre);
    // System.out.println("Su fecha de lanzamiento es: " +
    // otraPelicula.fechaDeLanzamiento);
    // otraPelicula.muestraFichaTecnica();

  }
}
