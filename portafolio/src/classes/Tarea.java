package classes;

public class Tarea {
  String nombre;
  String descripcion;
  // TODO: Hacer este atributo privado, modificar con getter y setter
  String estado; // pendiente | en proceso | completada

  public Tarea(String nombre, String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.estado = "Pendiente";
  }

  @Override
  public String toString() {
    String res = "%s (%s)\n Estado: %s"
        .formatted(this.nombre, this.descripcion, this.estado);
    return res;
  }

}
