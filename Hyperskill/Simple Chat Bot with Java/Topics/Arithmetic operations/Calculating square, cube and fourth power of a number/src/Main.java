import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt(); 

        // Compute and print the square of n
        int square = n*n;

        // Compute and print the cube of n
        int cube = n*n*n;
        // Compute and print the fourth power of n
        int fourthPower = n*n*n*n;
        System.out.println(square);
        System.out.println(cube);
        System.out.println(fourthPower);

    }
}