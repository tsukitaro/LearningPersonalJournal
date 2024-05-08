
/**
 * Desafio_juego_adivinacion
 */
import java.util.Random;
import java.util.Scanner;

public class Desafio_juego_adivinacion {

  public static void main(String[] args) {
    // scanner clase
    Scanner teclado = new Scanner(System.in);

    // variables
    int numeroAleatorio = 0;
    int intentos = 1;
    // int[] listaNumeroSorteado;
    int numeroMaximo = 100;
    int intentosMaximos = 5;

    // imprime numero correcto
    // System.out.println(numeroCorrecto);

    // numero aleatorio
    Random rand = new Random();

    numeroAleatorio = rand.nextInt(100);

    numeroAleatorio += 1;

    System.out.println(numeroAleatorio);

    // solicitamos ingrese un numero
    System.out.println("Ingrese un numero del 1 al " + numeroMaximo);

    for (int i = 0; i <= intentosMaximos; i++) {
      int numeroDado = teclado.nextInt();
      if (numeroAleatorio == numeroDado) {
        System.out.println("Acertaste el numero en " + intentos + " intentos");
        break;
      } else if (numeroDado > numeroAleatorio) {
        System.out.println("Estas por encima");
        intentos ++;
      }else if (numeroDado < numeroAleatorio) {
        System.out.println("Estas por debajo");
        intentos ++;
      }
    }

    teclado.close();

  }
}
