package screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

/**
 * Titulo
 */
public class Titulo {
  
  @SerializedName("Title")
  private String nombre;

  @SerializedName("year")
  private int fechaDeLanzamiento;

  private int duracionEnMinutos;

  private boolean incluidoEnElPlan;

  private double sumaDeLasEvaluaciones;

  private int totalDeLasEvaluaciones;

  public Titulo(String nombre, int fechaDeLanzamiento) {
    this.nombre = nombre;
    this.fechaDeLanzamiento = fechaDeLanzamiento;
  }

  public int getTotalDeLasEvaluaciones() {
    return totalDeLasEvaluaciones;
  }

  public void muestraFichaTecnica() {
    System.out.println("Mi pelicula es: " + nombre);
    System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
    System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
  }

  public void evalua(double nota) {
    sumaDeLasEvaluaciones += nota;
    totalDeLasEvaluaciones++;
    // lo mismo pero largo
    // el += hace que sume a ella misma con la variable
    // sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
  }

  public double calculaMedia() {
    return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;

  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
    // this hace que java reconozca la variable a la que queremos definirla
  }

  public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
    this.fechaDeLanzamiento = fechaDeLanzamiento;
  }

  public void setDuracionEnMinutos(int duracionEnMinutos) {
    this.duracionEnMinutos = duracionEnMinutos;
  }

  public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
    this.incluidoEnElPlan = incluidoEnElPlan;
  }

  public String getNombre() {
    return nombre;
  }

  public int getFechaDeLanzamiento() {
    return fechaDeLanzamiento;
  }

  public int getDuracionEnMinutos() {
    return duracionEnMinutos;
  }

  public boolean isIncluidoEnElPlan() {
    return incluidoEnElPlan;
  }

  @Override
  public String toString() {
    return "nombre=" + nombre + 
           ", fechaDeLanzamiento=" + fechaDeLanzamiento;
  }

  

}
