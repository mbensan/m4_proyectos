import java.util.Scanner;

/**
 * Clase para tener muchas funciones matemáticas básicas
 */
public class Mates {
  /**
   * Función que suma dos enteros
   * @param uno primer sumando
   * @param dos segundo sumando
   * @return la suma de ambos
   */
  public static double promedio (double n1, double n2, double n3) {
    double prom = (n1 + n2 + n3) / 3;
    return prom;
  }
  public static int suma (int uno, int dos) {
    return uno + dos;
  }
  /**
   * Función de prueba de "suma"
   */
  public static void probarSuma () {
    Scanner in = new Scanner(System.in);

    System.out.println("Ingrese el primer número: ");
    int one = in.nextInt();
    System.out.println("Ingrese el segundo número: ");
    int two = in.nextInt();
    
    int resultado = suma(one, two);

    System.out.println("el resultado de %s más %s es: %s".formatted(one, two, resultado));
  }
}
