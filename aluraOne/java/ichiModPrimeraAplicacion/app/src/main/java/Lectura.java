import java.util.Scanner;

/**
 * Lectura
 */
public class Lectura {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("escribe el nombre de tu pelicula favorita");
    // cuando es texto usamos nextLine
    String pelicula = teclado.nextLine();
    System.out.println("Ahora escribe la fecha de lanzamiento");
    // para otros tipos pdemos usar nextInt para numeros
    int fechaDeLanzamiento = teclado.nextInt();
    System.out.println("Por ultimo dinos que nota le das a esta pelicula");
    // y para doubles usamos nextDouble
    double nota = teclado.nextDouble();

    System.out.println(pelicula);
    System.out.println(fechaDeLanzamiento);
    System.out.println(nota);

  }
}
