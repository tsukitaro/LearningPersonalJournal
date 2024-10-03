package org.masumera.serializationTest;

import java.io.Serializable;

/**
 * StudentTest
 */
public class StudentTest implements Serializable {

  int id;
  String name; 
  
  public StudentTest(int id, String name){
    this.id = id;
    this.name = name;
  }
}
