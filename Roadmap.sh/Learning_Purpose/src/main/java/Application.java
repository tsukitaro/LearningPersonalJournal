import generics.GenericsDemo;




public class Application {
    public static void main(String[] args) {

        GenericsDemo genericsDemo = new GenericsDemo();

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains: ");
        genericsDemo.printArray(intArray);


        System.out.println("\nArray doubleArray contains: ");
        genericsDemo.printArray(doubleArray);

        System.out.println("\nArray characterArray contains: ");
        genericsDemo.printArray(charArray);


    }
}
