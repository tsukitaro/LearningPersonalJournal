import java.util.Scanner;

public class Java1_DesafioExtra {
  public static void main(String[] args) {
    String nombre = "Matsu Shougo";
    String tipoDeCuenta = "Corriente";
    double saldo = 1599.99;
    int opcion = 0;

    System.out.println("********************");
    System.out.println("\nNombre del cliente: " + nombre);
    System.out.println("El tipo de cuenta es: "+ tipoDeCuenta);
    System.out.println("El saldo de la cuenta es: "+saldo);
    System.out.println("\n ********************");
    
    String menu = """ 
    \n
     *** Escriba el numero de la opcion ***
    1. - Consultar saldo
    2. - Retirar
    3. - Depositar
    9. - Salir
    """;

    Scanner teclado = new Scanner(System.in);

    while (opcion != 9) {

      System.out.println(menu);

      opcion = teclado.nextInt();
      switch (opcion) {
        case 1:
          System.out.println("Su saldo es: "+ saldo);
          break;
        case 2:
          System.out.println("Cuanto desea Retirar");
          double valorRetirar = teclado.nextInt();
          if (valorRetirar>saldo) {
            System.out.println("El valor a retirar supera su saldo, lo devolvera al menu");
          }else {
          saldo = saldo - valorRetirar;
          System.out.println("acaba de retirar "+valorRetirar + " su nuevo saldo es: "+saldo);
          break;
        }
          break;
        case 3:
          System.out.println("Cuanto desea Depositar");
          double valorDepositar = teclado.nextInt();
          saldo =  saldo + valorDepositar;
          System.out.println("Su nuevo saldo es: "+saldo);
          break;
        default:
          System.out.println("Gracias por utilizar nuestros servicios, Hasta pronto.");
          break;
      }
      
    }
    teclado.close();
    
  }
}
