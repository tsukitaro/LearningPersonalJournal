import java.util.Scanner;

/**
 * Loops
 */
public class Loops{

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double nota = 0;
    double mediaEvaluaciones = 0;

    // el cero cuenta como primer elemento 
    // aqui el i es el valor inciar, luego esta hasta cuando pasara
    for (int i = 0; i < 3; i++) {
      System.out.println("Escribe la nota que le darias a la pelicula Matrix");
      nota = teclado.nextDouble();
      mediaEvaluaciones = mediaEvaluaciones + nota;
      
    }
    System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones/3);

    // esto es para cerrar el objecto  
    teclado.close();
    
  }
}
