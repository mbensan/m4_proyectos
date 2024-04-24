package classes;

public class Planta {
  private String nombre;
  private boolean esInterior;
  private int mesPlantacion;

  private String[] propiedades;

  public Planta(String nombre, boolean esInterior, int mesPlantacion, String[] propiedades) {
    this.nombre = nombre;
    this.esInterior = esInterior;
    this.mesPlantacion = mesPlantacion;
    this.propiedades = propiedades;
  }

  public String toString() {
    String respuesta = nombre + " \npropiedades: ";

    for (String propiedad : propiedades) {
      respuesta += propiedad + ", ";
    }

    return respuesta;
  }

}
