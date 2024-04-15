package rol;

import java.util.Scanner;

public class Util {
  static Scanner in = new Scanner(System.in);

  public static String leer(String mensaje) {
    System.out.println(mensaje);
    String entradaUsuario = in.nextLine();
    return entradaUsuario;
  }
}
