package productos;

public class Refrigerador extends Electrodomestico {

  double pies;

  public Refrigerador(String cod, int precioBase, int stock, String marca, double pies) throws Exception {
    super(cod, precioBase, stock, marca);
    if (pies < 1) {
      throw new Exception("No existen refris tan chicos");
    }
    this.pies = pies;
  }

  @Override
  public double calcularDescto(String horario) {
    if (horario.equals("diurno")) {
      return 0.18;
    } else {
      return 0.2;
    }
  }

  @Override
  public int calcularTotal(int cantidad, String horario) {
    double descuento = calcularDescto(horario);

    int total = (int) (((cantidad * this.precioBase) * AProducto.iva) * descuento);
    return total;
  }

  public String toString() {
    String s = "Refrigerador %s de %s pies: Valor $%s".formatted(this.marca, this.pies, this.precioBase);
    return s;
  }
}
