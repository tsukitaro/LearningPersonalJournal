package serializationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

/**
 * Depersist
 */
public class Depersist {

  public void depersistTest() {
    try {
      // creating steam to read the object
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
      StudentTest s = (StudentTest) in.readObject();
      // print data of the seralized ojbect
      System.out.println(s.id + " " + s.name);
      // closing
      in.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
