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

    // treinta y siete => 84 decenas=8 unidades=4
    @Test
    public void testAlgoYAlgo() { // 30 - 99
        assertTrue(
                Transformar.palabra(87).equals("ochenta y siete"));
        assertTrue(
                Transformar.palabra(95).equals("noventa y cinco"));
        assertTrue(
                Transformar.palabra(70).equals("setenta"));
    }

    @Test
    public void testCientoAlgo() { // 101 - 199
        assertTrue(
                Transformar.palabra(123).equals("ciento veintitres"));
        assertTrue(
                Transformar.palabra(145).equals("ciento cuarenta y cinco"));
        assertTrue(
                Transformar.palabra(170).equals("ciento setenta"));

    }

    @Test
    public void testAlgoCientosAlgo() { // 200 - 999
        assertTrue(
                Transformar.palabra(567).equals("quinientos sesenta y siete"));
        assertTrue(
                Transformar.palabra(700).equals("setecientos"));
        assertTrue(
                Transformar.palabra(901).equals("novecientos uno"));

    }

    @Test
    public void testAlgoMilAlgo() { // 200 - 999
        assertTrue(
                Transformar.palabra(3567).equals("tres mil quinientos sesenta y siete"));
        assertTrue(
                Transformar.palabra(793641).equals("setecientos noventa y tres mil seiscientos cuarenta y uno"));
        assertTrue(
                Transformar.palabra(472000).equals("cuatrocientos setenta y dos mil"));

    }
}
