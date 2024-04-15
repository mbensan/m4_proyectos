public class CalcRadianes implements IOperaciones {
  int ciclos = 0;
  final double radPorCiclo = 2 * 3.14;

  public double suma(double x, double y) {
    double res = x + y;
    // cuantos minutos caben
    int cics = (int) Math.floor(res / radPorCiclo);
    this.ciclos = cics;

    return res % radPorCiclo;
  }

  public double resta(double x, double y) {
    double res = x - y;
    // cuantos minutos caben
    int cics = (int) Math.floor(res / radPorCiclo);
    this.ciclos = cics;

    return res % radPorCiclo;
  }

  public double mult(double x, double y) {
    double res = x * y;
    // cuantos minutos caben
    int cics = (int) Math.floor(res / radPorCiclo);
    this.ciclos = cics;

    return res % radPorCiclo;
  }

  public double div(double x, double y) {
    double res = x / y;
    // cuantos minutos caben
    int cics = (int) Math.floor(res / radPorCiclo);
    this.ciclos = cics;

    return res % radPorCiclo;
  }
}
