package classes;

public class Leccion2 {

  static public boolean esPar(int x) {
    if (x % 2 == 0) {
      return true;
    }
    return false;
  }

  static public int[] pares_impares(int[] nums) {
    // Este método debe dejar los números pares al inicio, y los números impares al
    // final
    // [4, 7, 0, -2, 10, 103] => [4, 0, -2, 10, 7, 103]
    if (nums.length <= 1) {
      return nums;
    }
    int largo = nums.length;
    int[] ordenados = new int[largo];

    // 1. Agregamos los números pares
    int pos = 0;
    for (int num : nums) {
      if (esPar(num)) {
        ordenados[pos] = num;
        pos++;
      }
    }
    // 2. Agregamos los números impares
    for (int num : nums) {
      if (!esPar(num)) {
        ordenados[pos] = num;
        pos++;
      }
    }
    return ordenados;
  }
}
