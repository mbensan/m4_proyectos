package tests;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import classes.Edades;

public class EdadesTest {
  @Test
  public void testGetEdadActual() throws Exception {
    assertEquals(Edades.getEdadActual(1, 1, 1990), 34);
    assertEquals(Edades.getEdadActual(11, 8, 2000), 23);
    assertEquals(Edades.getEdadActual(18, 4, 2024), 0);
  }

  @Test
  public void testNoNacido() {
    try {
      Edades.getEdadActual(18, 9, 2024);
    } catch (Exception exc) {
      assertEquals(exc.getMessage(), "Esa persona no ha nacido");
    }
  }

  @Test
  public void testProxCumple() {
    assertEquals(Edades.diasProxCumple(24, 4, 2000), 2);
    assertEquals(Edades.diasProxCumple(22, 5, 2000), 30);
    assertEquals(Edades.diasProxCumple(31, 12, 2000), 253);
    assertEquals(Edades.diasProxCumple(20, 4, 2000), 363);
  }

  @Test
  public void testDecadas() throws Exception {
    assertEquals(Edades.getDecadas(24, 4, 2000), 2);
    assertEquals(Edades.getDecadas(11, 2, 1960), 6);
    assertEquals(Edades.getDecadas(18, 4, 2024), 0);
    assertEquals(Edades.getDecadas(25, 12, 0), 202);
  }
}
