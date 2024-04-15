package tests;

import classes.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatrizTests {
  Matriz m1;
  Matriz m2;

  @Before
  public void iniciar() {
    int[][] valores = {
        { 4, 5, 7 },
        { 7, 21, 4 },
        { 5, 9, 10 }
    };
    m1 = new Matriz(valores);

    int[][] valores2 = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 1, 3, 5, 7 },
        { 2, 4, 6, 8 }
    }; // 20 * 16 = 320
    m2 = new Matriz(valores2);
  }

  @Test
  public void testMatrix3() throws Exception {
    int valorEsperado = 1155;
    assertTrue(m1.multDiagonales() == valorEsperado);
  }

  @Test
  public void testMatrix4() throws Exception {
    int valorEsperado = 320;
    assertTrue(m2.multDiagonales() == valorEsperado);
  }

}
