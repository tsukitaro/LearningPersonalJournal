package org.masumera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.masumera.generics.Maximun;
/**
 * MaximunTest
 */
public class MaximunTest {

  Maximun max;

  @BeforeEach
  void setUp() {
    max = new Maximun();

     //LogManager logManager = LogManager.getLogManager();
     //   Logger julLogger = Logger.getLogger("");
     //
     //   // Ajusta manualmente los niveles de log para JUL
     //   julLogger.setLevel(Level.WARNING);
     //
     //   // Luego inicializa Log4j2
     //   System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
  }

  @Test
  @DisplayName("Maximun method should return the maximun number from 3 numbers")
  void testMaximun() {
    assertEquals(10, max.maximun(10, 1, 2),
       "Regular maximun should work");
  }

  @RepeatedTest(4)
  @DisplayName("Ensure corrrect handling of zero")
  void testMaximunWithZero() {
    assertEquals(15, max.maximun(1, 2, 15),
      "Max should be 15");
  }
  
}
