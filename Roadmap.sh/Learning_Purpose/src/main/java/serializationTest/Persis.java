package serializationTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import serializationTest.StudentTest;

/**
 * Persis
 */
public class Persis {

  public void persistTest() {

    try {
      //create the object
      StudentTest s1 = new StudentTest(211, "ravi");
      // Creating stream and writing the object
      FileOutputStream fout = new FileOutputStream("f.txt");
      ObjectOutputStream out = new ObjectOutputStream(fout);
      out.writeObject(s1);
      out.flush();
      // Closing the stream
      out.close();
      System.out.println("Success");
    } catch (Exception e) {
      System.out.println(e);
    }
    
  }
}
