package productos;

public class Lavadora extends Electrodomestico {
  String carga;

  public Lavadora(String cod, int precioBase, int stock, String marca, String carga) throws Exception {
    super(cod, precioBase, stock, marca);
    if (!carga.equals("A") && !carga.equals("C")) {
      throw new Exception("La carga de la lavadora debe ser por arriba (A) o por el costado");
    }
    this.carga = carga;
  }

  @Override
  public double calcularDescto(String horario) {
    if (horario.equals("diurno")) {
      return 0.0;
    } else {
      return 0.2;
    }
  }

  @Override
  public int calcularTotal(int cantidad, String horario) {
    double descuento = calcularDescto(horario);

    int total = (int) (((cantidad * this.precioBase) * AProducto.iva) * (1.0 - descuento));
    return total;
  }

  public String toString() {
    String carga_str;
    if (this.carga.equals("A")) {
      carga_str = "superior";
    } else {
      carga_str = "frontal";
    }
    return "Lavadora de carga %s. Valor: $%s".formatted(carga_str, this.calcularTotal(1, "diurno"));
  }

}
