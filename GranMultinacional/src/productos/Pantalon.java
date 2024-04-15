package productos;

public class Pantalon extends AProducto {
  String tipo;
  String sexo; // "M" | "F" | "U"

  public Pantalon(String codigo, int precioBase, int stock, String tipo, String sexo) throws Exception {
    super(codigo, precioBase, stock);
    // validamos el tipo de tela
    if (!tipo.equals("jeans") && !tipo.equals("cotele") && !tipo.equals("tela")) {
      throw new Exception("Ese tipo de JEANS no existe");
    }
    // validamos el sexo del corte
    if (!sexo.equals("M") && !sexo.equals("F") && !sexo.equals("U")) {
      throw new Exception("Ese sexo de JEANS no existe");
    }
    this.tipo = tipo;
    this.sexo = sexo;
  }

  public int calcularTotal(int cantidad, String horario) {
    double descuento = 0.1;
    if (horario.equals("nocturno")) {
      descuento = 0.15;
    }

    int total = (int) (((cantidad * this.precioBase) * AProducto.iva) * (1 - descuento));
    return total;
  }

  public String toString() {
    String s = "Pantalón ";
    s += " Tela: " + this.tipo;
    return s;
  }
}
