package movil;

public class Moto extends Vehiculo {

  private boolean tieneAcoplado;

  public Moto(int motor, String marca, String modelo, float rendimiento, boolean autom) {
    // Llamamos al constructor de la clase madre
    super(motor, marca, modelo, rendimiento, autom);
    // Configuramos las cosas propias de la clase Moto
    this.tieneAcoplado = false;
  }

  public boolean getTieneAcoplado() {
    return this.tieneAcoplado;
  }

  public void setTieneAcoplado(boolean tieneAcoplado) {
    this.tieneAcoplado = tieneAcoplado;
  }

  public float getConsumo(int kms) {
    if (this.tieneAcoplado) {
      return (kms / this.rendimiento) * 7 / 10;
    } else {
      return kms / this.rendimiento;
    }
  }

}
