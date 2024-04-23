import classes.Leccion2;
import classes.Leccion3;

public class App {
  static void printArray(int[] arr) {
    String texto = "[";
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        texto += arr[i];
      } else {
        texto += ", " + arr[i];
      }
    }
    texto += "]";
    System.out.println(texto);
  }

  public static void main(String[] args) throws Exception {
    int[] nums = { 4, 7, 0, -2, 10, 103, -4, 11, 22 };
    // ordenado = {4, 0, -2, 10, -4, 22, 7, 103, 11}
    printArray(nums);
    printArray(Leccion2.pares_impares(nums));

    Leccion3.sacarPromedio();
  }
}
