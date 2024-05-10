/**
 * Pelicula
 */
public class Pelicula {

  String nombre;

  int fechaDeLanzamiento;

  int duracionEnMinutos;

  boolean incluidoEnElPlan;

  double sumaDeLasEvaluaciones;

  int totalDeLasEvaluaciones;

  void muestraFichaTecnica(){
    System.out.println("Mi pelicula es: " + nombre);
    System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
    System.out.println("Duracion en minutos: " + duracionEnMinutos);
  }
  
  void evalua(double nota){
    sumaDeLasEvaluaciones += nota;
    totalDeLasEvaluaciones ++;
    // lo mismo pero largo
    // el += hace que sume a ella misma con la variable
    // sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
  } 

  double calculaMedia(){
    return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    
  }
  
}
