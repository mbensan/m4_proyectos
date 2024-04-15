package productos;

import java.util.ArrayList;

public class RegistroProductos {
  ArrayList<AProducto> productos = new ArrayList<AProducto>();

  public void agregarProd(AProducto nuevo) {
    if (buscarProd(nuevo.codigo)) {
      return;
    }
    productos.add(nuevo);
  }

  public boolean buscarProd(String cod_buscado) {
    for (AProducto p : productos) {
      if (p.codigo.equals(cod_buscado)) {
        return true;
      }
    }
    return false;
  }

  public boolean buscarProd(AProducto buscado) {
    for (AProducto p : productos) {
      if (p.codigo.equals(buscado.codigo)) {
        return true;
      }
    }
    return false;
  }

  public void eliminarProd(String cod_buscado) {
    for (AProducto p : productos) {
      if (p.codigo.equals(cod_buscado)) {
        productos.remove(p);
        return;
      }
    }
  }

  public void listarProds() {
    for (AProducto p : productos) {
      System.out.println(p);
    }
  }
}
