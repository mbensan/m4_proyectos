package movil;

public class Vehiculo {
  private int motor;
  private String marca;
  private String modelo;
  protected float rendimiento;
  private boolean autom;

  public Vehiculo(int motor, String marca, String modelo, float rendimiento, boolean autom) {
    this.motor = motor;
    this.marca = marca;
    this.modelo = modelo;
    this.rendimiento = rendimiento;
    this.autom = autom;
  }

  public Vehiculo(int motor, String marca, String modelo, float rendimiento) {
    this(motor, marca, modelo, rendimiento, false);
  }

  public String getNombre() {
    return this.marca + " " + this.modelo;
  }

  public float getConsumo(int kms) {
    return kms / this.rendimiento;
  }
}
