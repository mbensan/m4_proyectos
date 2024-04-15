package classes;

public class Matriz {
  private int[][] valores;

  public Matriz(int[][] valores) {
    this.valores = valores;
  }

  public Matriz(int dimension) {
    this.valores = new int[dimension][dimension];
  }

  public Matriz(int n_filas, int n_columnas) {
    this.valores = new int[n_filas][n_columnas];
  }

  public void add(int fila, int col, int valor) {
    this.valores[fila][col] = valor;
  }

  public int multDiagonales() throws Exception {
    if (this.valores.length != this.valores[0].length) {
      throw new Exception("La matriz debe ser cuadrada para multiplicar sus diagonales");
    }

    int diag1 = 0;
    int diag2 = 0;
    for (int i = 0; i < this.valores.length; i++) {
      diag1 += this.valores[i][i];
      diag2 += this.valores[i][(this.valores.length - 1) - i];
    }
    return diag1 * diag2;
  }

}
/*
 * 
 * valores = [
 * [4, 5, 7],
 * [7,21, 4],
 * [5, 9,10]
 * ]
 */
