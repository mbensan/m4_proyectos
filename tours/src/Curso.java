import java.util.Scanner;

public class Curso {
  public static void preguntaInicial () {
    Scanner in = new Scanner(System.in);

    while (true) {
      System.out.println("Ingrese una de las 4 opciones");
      String opcion_elegida = in.nextLine();
      if (opcion_elegida.equals("1")) {
        // hacemos algo
      }
      else if (opcion_elegida.equals("2")) {
        // hacemos otra cosa
      }
      // else if opcion 3, else if opcion 4.
      else {
        System.out.println("Opción no valida");
        break;
      }
    }
  }
}
