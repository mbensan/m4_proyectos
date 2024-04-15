package tests;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import classes.MiClase;

public class TestMiClase {
  /**
   * Probamos cuando el primer número es el mayor
   */
  @Test
  public void testNumeroMayor1() {
    MiClase mc = new MiClase();

    int resultado = mc.numeroMayor(3, 2, 1);

    assertTrue(resultado == 3);
  }

  /**
   * Si el segundo número es mayor
   */
  @Test
  public void testNumeroMayor2() {
    MiClase mc = new MiClase();

    int resultado = mc.numeroMayor(10, 15, 8);

    assertTrue(resultado == 15);
  }
}
