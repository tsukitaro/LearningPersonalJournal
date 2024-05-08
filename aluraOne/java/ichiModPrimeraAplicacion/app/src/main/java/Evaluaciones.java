import java.util.Scanner;

/**
 * Evaluaciones
 */
public class Evaluaciones {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double nota = 0;
    double mediaEvaluaciones = 0;
    double totalEvaluaciones = 0;

// con el while, evaluaremos una condicion, y solo mientas se cumpla esa condicion se ejecutara el codigo
    // aqui usamos el "!=" que significa todo el que sea diferente de -1 
    while (nota != -1) {
      System.out.println("Escribe la nota que le darias a la pelicula Matrix");
      nota = teclado.nextDouble();

// usaremos un if para validar si nota != -1 y si el usuario no escribe -1 se ejecuta, de lo contrario si 
      if (nota != -1) {
       // esto dice que "+=" es sumarle 1 a si mismo   
      mediaEvaluaciones += nota;
      // necesitamos un contador para contador para contar los ciclos que se ejecuta
      totalEvaluaciones++;
        
      }
      
     
    }
    System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones/totalEvaluaciones);
    
// esto es para cerrar el objecto  
    teclado.close();
      
  }
}
