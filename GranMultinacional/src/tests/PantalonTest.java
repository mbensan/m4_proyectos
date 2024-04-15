package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import productos.Pantalon;

public class PantalonTest {
  @Test
  public void testPrecioTotal() throws Exception {
    Pantalon p = new Pantalon("PANT", 10000, 1, "cotele", "M");
    int precio = p.calcularTotal(1, "diurno");
    // espero que el precio final sea de 10710
    assertEquals(precio, 10710);
  }
}
