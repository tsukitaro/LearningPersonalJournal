import java.io.IOException;
import java.net.URISyntaxException;

import generics.BoxExample;
import generics.GenericsDemo;
import generics.Maximun;
import serializationTest.Depersist;
//import serializationTest.Persis;

public class Application {
  public static void main(String[] args) throws IOException, URISyntaxException {
    //HTTPrequest.HttpURLConnectionTest test = new HTTPrequest.HttpURLConnectionTest();
    //test.HttpTest();

    // printTest();
    // printGenericClass();
    // printFirstExample();
    // FilePath filePath = new FilePath();
    // filePath.testFilePath();


    //Persis persis = new Persis();
    //persis.persistTest();
    Depersist depersist = new Depersist();
    depersist.depersistTest();
  }

  public static void printTest() {
    Maximun maximun = new Maximun();
    System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximun.maximun(3, 4, 5));

    System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximun.maximun(6.6, 8.8, 7.7));

    System.out.printf("Max of %s, %s and %s is %s\n\n", "pear", "apple", "orange",
        maximun.maximun("pear", "apple", "orange"));
  }

  public static void printGenericClass() {
    BoxExample<Integer> integerBox = new BoxExample<Integer>();
    BoxExample<String> stringBoxExample = new BoxExample<String>();

    integerBox.add(12);
    stringBoxExample.add(new String("This is a example"));

    System.out.printf("Integer value :%d\n\n", integerBox.get());
    System.out.printf("String value :%s\n", stringBoxExample.get());
  }

  public static void printFirstExample() {
    GenericsDemo genericsDemo = new GenericsDemo();

    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println("Array integerArray contains: ");
    genericsDemo.printArray(intArray);

    System.out.println("\nArray doubleArray contains: ");
    genericsDemo.printArray(doubleArray);

    System.out.println("\nArray characterArray contains: ");
    genericsDemo.printArray(charArray);
  }
}
