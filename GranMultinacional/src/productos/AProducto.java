package productos;

abstract class AProducto {
  protected String codigo;
  protected int precioBase;
  protected int stock;

  static final double iva = 1.19;

  public AProducto(String codigo, int precioBase, int stock) throws Exception {
    if (precioBase <= 0) {
      throw new Exception("El precio base no puede ser menor o igual a 0");
    }
    if (stock <= 0) {
      throw new Exception("El stock debe ser positivo");
    }
    this.codigo = codigo;
    this.precioBase = precioBase;
    this.stock = stock;
  }

  boolean validarStock(int cantidad) {
    if (cantidad < stock) {
      System.out.println("Falta de stock");
      return false;
    }
    return true;
  }

  void imprimir() {
    String texto = "Producto cod: %s, precio base = %s, stock = %s".formatted(codigo, precioBase, stock);
    System.out.println(texto);
  }

  // horario = "diurno" | "nocturno"
  abstract int calcularTotal(int cantidad, String horario);

}