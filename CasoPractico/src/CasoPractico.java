import java.util.Scanner;

public class CasoPractico {
  static String nombre = "";
  static String apellido = "";
  static String rut = "";
  static double nota_final = 0.0;
  
  /**
   * Funcion para el calculo de la nota final
   * 
   * @param n1     nota1
   * @param n2     nota2
   * @param n3     nota3
   * @param examen
   * @return promedio de notas al 60% y examen al 40%
   */
  static private double calcular_nota_final(double n1, double n2, double n3, double examen) {
    double nota_final = ((n1 + n2 + n3) / 3) * 0.6 + (examen * 0.4);
    return nota_final;
  }

  static private boolean elegir_curso() {
    Scanner in = new Scanner(System.in);
    System.out.println("Ingrese la asignatura:");
    String asignatura = in.nextLine();
    if (!asignatura.equals("biologia") && !asignatura.equals("fisica") && !asignatura.equals("programacion")) {
      System.out.println("Error. Asignatura no válida");
      return false;
    }
    System.out.println("Ingrese el número de sala:");
    String num_sala = in.nextLine();
    System.out.println("Ingrese la capacidad de la sala");
    String capacidad_sala_str = in.nextLine();
    int capacidad_sala;
    try {
      capacidad_sala = Integer.parseInt(capacidad_sala_str);
    } catch (NumberFormatException e) {
      System.out.println("Capacidad inválida");
      return false;
    }
    if (capacidad_sala > 35 || capacidad_sala < 1) {
      System.out.println("La capacidad de la sala debe estar entre 1 y 35");
      return false;
    }
    return true;
  }

  static private boolean ingresar_datos_personales() {
    Scanner in = new Scanner(System.in);
    System.out.println("Ingrese su rut");
    rut = in.nextLine();
    System.out.println("Ingrese su nombre");
    nombre = in.nextLine();
    System.out.println("Ingrese su apellido");
    apellido = in.nextLine();
    System.out.println("Ingrese su edad");
    String edad_str = in.nextLine();
    // intento transformar la edad a un int
    int edad;
    try {
      edad = Integer.parseInt(edad_str);
    } catch (NumberFormatException e) {
      System.out.println("Debe ingresar una edad válida");
      return false;
    }
    if (edad < 18 || edad > 100) {
      System.out.println("Edad inválida");
      return false;
    }
    return true;
  }

  static private boolean ingresar_notas () {
    Scanner in = new Scanner(System.in);
    // tomo las notas
    System.out.println("Ingrese nota parcial 1");
    String nota_p1_str = in.nextLine();
    double nota_p1;
    try {
      nota_p1 = Double.parseDouble(nota_p1_str);
    } catch (NumberFormatException e) {
      System.out.println("El formato de la nota es incorrecto");
      return false;
    }
    System.out.println("Ingrese nota parcial 2");
    String nota_p2_str = in.nextLine();
    double nota_p2;
    try {
      nota_p2 = Double.parseDouble(nota_p2_str);
    } catch (NumberFormatException e) {
      System.out.println("El formato de la nota es incorrecto");
      return false;
    }
    System.out.println("Ingrese nota parcial 3");
    String nota_p3_str = in.nextLine();
    double nota_p3;
    try {
      nota_p3 = Double.parseDouble(nota_p3_str);
    } catch (NumberFormatException e) {
      System.out.println("El formato de la nota es incorrecto");
      return false;
    }
    System.out.println("Ingrese nota del examen");
    String nota_examen_str = in.nextLine();
    double nota_examen;
    try {
      nota_examen = Double.parseDouble(nota_examen_str);
    } catch (NumberFormatException e) {
      System.out.println("El formato de la nota es incorrecto");
      return false;
    }
    // recién ahora calculo la nota final
    nota_final = calcular_nota_final(nota_p1, nota_p2, nota_p3, nota_examen);
    return true;
  }
  
  static public void mostrarMenu() {

    Scanner in = new Scanner(System.in);

    while (true) {
      String opciones = """
            Elija una opción:
            1. Ingresar datos personales
            2. Elegir curso
            3. Ingresar Notas
            4. Imprimir resultados
            5. Salir
          """;
      System.out.println(opciones);
      String opcion = in.nextLine();

      // Acá tomo la desición de qué hacer
      if (opcion.equals("1")) {
        // tomar datos personales
        boolean ingreso_exitoso = ingresar_datos_personales();
        if (ingreso_exitoso == false) {
          continue;
        }
      } else if (opcion.equals("2")) {
        // tomar datos del curso
        boolean eleccion_exitosa = elegir_curso();
        if (!eleccion_exitosa) {
          continue;
        }
      } else if (opcion.equals("3")) {
        ingresar_notas();
      }
      else if (opcion.equals("4")) {
        System.out.println("%s %s tiene rut %s".formatted(nombre, apellido, rut));
        System.out.println("Su nota final es %s".formatted(nota_final));
      }
      else {
        break;
      }
    }
    // Me despido
    System.out.println("Hasta luego");
    in.close();
  }
}
