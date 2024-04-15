import java.util.Scanner;

public class App {

  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    IOperaciones iop;
    System.out.println("Bienvenido al centro de cálculo");
    while (true) {
      String pregunta = "Ingrese una de las siguientes opciones:\n1. Calculadora Normal.\n2. Calculadora de Segundos\n3. Calculadora de Radianes";
      System.out.println(pregunta);
      String respuesta = in.nextLine();
      if (respuesta.equals("1")) {
        System.out.println("Calculadora normal");
        iop = new Calculadora();
      } else if (respuesta.equals("2")) {
        System.out.println("Calculadora de segundos");
        iop = new CalcReloj();
      } else if (respuesta.equals("3")) {
        System.out.println("Calculadora de Radianes");
        iop = new CalcRadianes();
      } else {
        break;
      }
      calcular(iop);
    }
    System.out.println("Nos vemos!");
  }

  static public void calcular(IOperaciones iop) {
    System.out.println("Ingrese la operacion a realizar:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n");
    String operacion = in.nextLine();
    System.out.println("Ingrese el primer número");
    double primerNum = Double.parseDouble(in.nextLine());
    System.out.println("Ingrese el segundo número");
    double segundoNum = Double.parseDouble(in.nextLine());
    if (operacion.equals("1")) {
      System.out.println(iop.suma(primerNum, segundoNum));
    } else if (operacion.equals("2")) {
      System.out.println(iop.resta(primerNum, segundoNum));
    } else if (operacion.equals("3")) {
      System.out.println(iop.mult(primerNum, segundoNum));
    } else {
      System.out.println(iop.div(primerNum, segundoNum));
    }
  }
}
