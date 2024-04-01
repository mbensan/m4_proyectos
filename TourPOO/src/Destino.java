public class Destino {
  // Atributos de los objetos
  String nombre;
  private int numDias;
  private float presupuesto;
  boolean necesitaVisa;
  
  // Método Constructor (se llama igual que la clase)
  public Destino (String nombre, int numDias, float presupuesto) {
    this.nombre = nombre;
    this.numDias = numDias;
    this.presupuesto = presupuesto;
    necesitaVisa = false;
  }
  // otros métodos
  public double getGastoDiario () {
    double gDiario = presupuesto / numDias;
    return gDiario;
  }
}
