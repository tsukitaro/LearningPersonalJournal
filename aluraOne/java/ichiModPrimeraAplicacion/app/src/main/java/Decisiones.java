public class Decisiones {
  public static void main(String[] args) {
    int fechaDeLanzamiento = 1999;
    boolean incluidoEnElPlan = false;
    double notaDeLaPelicula = 8.2;
    String tipoPlan = "plus";
  
// codigo que prueba los operadores relacionales
    
    
    //
    // if (fechaDeLanzamiento >= 2022) {
    //     System.out.println("Peliculas mas populares");
    // }else {
    //   System.out.println("Peliculas retro que aun vale la pena ver");
    // }

// el operador || es {or} donde puede cualquiera de las condiciones
// el operador && es {and} donde ambas condiciones tienen que ser verdaderas para que se ejecute
    if (incluidoEnElPlan && tipoPlan.equals("plus")) {
      System.out.println("Disfrute su pelicula");
    }else {
      System.out.println("Pelicula no disponible para su plan actual");
    }
  }
}
