import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = calculateEvenSum(numbers);
        System.out.println(sum);
    }

    public static int calculateEvenSum(int[] arr) {
        // TODO: Add a multi-line comment explaining the method's purpose

        int sum = 0;

        // TODO: Implement the logic to calculate the sum of even numbers
        // Add single-line comments to explain each step

        return sum;
    }
}