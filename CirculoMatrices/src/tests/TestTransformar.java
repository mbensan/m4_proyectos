package tests;

import classes.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class TestTransformar {
  @Test
  public void testPrimeros15() {
    assertTrue(
        Transformar.palabra(0).equals("cero"));
    assertTrue(
        Transformar.palabra(10).equals("diez"));
    assertTrue(
        Transformar.palabra(14).equals("catorce"));
  }

  @Test
  public void testDieciAlgo() {
    assertTrue(
        Transformar.palabra(16).equals("dieciseis"));
    System.out.println(Transformar.palabra(16));

    assertTrue(
        Transformar.palabra(19).equals("diecinueve"));
    System.out.println(Transformar.palabra(19));
  }

  @Test
  public void testVeinte() {
    assertTrue(
        Transformar.palabra(20).equals("veinte"));
    System.out.println(Transformar.palabra(20));
  }

  @Test
  public void testVeintiAlgo() {
    System.out.println(Transformar.palabra(22));
    assertTrue(
        Transformar.palabra(22).equals("veintidos"));
    System.out.println(Transformar.palabra(27));
    assertTrue(
        Transformar.palabra(27).equals("veintisiete"));
  }
}
