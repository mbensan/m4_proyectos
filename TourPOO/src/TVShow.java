public class TVShow {
  private String nombre;
  private int temporadas;
  private int capitulos;
  private int edadMinima;

  public TVShow(String nombre, int temporadas, int capitulos, int edadMinima) {
    this.nombre = nombre;
    this.temporadas = temporadas;
    this.capitulos = capitulos;
    this.edadMinima = edadMinima;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTemporadas() {
    return this.temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  public int getCapitulos() {
    return this.capitulos;
  }

  public void setCapitulos(int capitulos) {
    this.capitulos = capitulos;
  }

  public int getEdadMinima() {
    return this.edadMinima;
  }

  public void setEdadMinima(int edadMinima) {
    this.edadMinima = edadMinima;
  }

  public String getClasificacion() {

    if (this.edadMinima >= 18) {
      return "A";
    } else if (this.edadMinima >= 13) {
      return "PG13";
    } else if (this.edadMinima >= 6) {
      return "F";
    } else {
      return "TE";
    }
  }

}
