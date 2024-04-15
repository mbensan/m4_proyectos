package productos;

public abstract class Electrodomestico extends AProducto implements ProductoDescontable {
  protected String marca;

  public Electrodomestico(String codigo, int precioBase, int stock, String marca) throws Exception {
    super(codigo, precioBase, stock);
    if (marca.length() <= 2) {
      throw new Exception("La marca debe ser de largo mayor a 2  carácteres");
    }
    this.marca = marca;
  }

}
