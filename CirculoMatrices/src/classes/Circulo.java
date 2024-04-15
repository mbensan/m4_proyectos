package classes;

public class Circulo {
  private int radio;
  private static double pi = 3.14;

  public Circulo(int radio) {
    this.radio = radio;
  }

  public double getPerimetro() {
    double res = 2 * pi * this.radio;
    return Math.round(res * 100) / 100.0;
  }

  public double getArea() {
    return 0;
  }
}
