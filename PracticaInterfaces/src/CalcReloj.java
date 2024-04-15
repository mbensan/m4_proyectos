public class CalcReloj implements IOperaciones {
  int minutos = 0;

  public double suma(double x, double y) {
    double res = x + y;
    // cuantos minutos caben
    int mins = (int) Math.floor(res / 60);
    this.minutos = mins;

    return res % 60;
  }

  public double resta(double x, double y) {
    double res = x - y;
    // cuantos minutos caben
    int mins = (int) Math.floor(res / 60);
    this.minutos = mins;

    return res % 60;
  }

  public double mult(double x, double y) {
    double res = x * y;
    // cuantos minutos caben
    int mins = (int) Math.floor(res / 60);
    this.minutos = mins;

    return res % 60;
  }

  public double div(double x, double y) {
    double res = x / y;
    // cuantos minutos caben
    int mins = (int) Math.floor(res / 60);
    this.minutos = mins;

    return res % 60;
  }
}

// 50 + 150 = (200) ==> (3min) 20
