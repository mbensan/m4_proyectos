package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Leccion3 {

  public static void sacarPromedio() {
    ArrayList<String> nombres = new ArrayList<String>();
    ArrayList<Integer> edades = new ArrayList<Integer>();
    ArrayList<Double> notas = new ArrayList<Double>();

    Scanner in = new Scanner(System.in);

    while (true) {
      // 1. Preguntamos por el nombre
      System.out.println("Ingrese nombre, o 0 para terminar: ");
      String nombre = in.nextLine();
      if (nombre.equals("0")) {
        break;
      }
      System.out.println("Ingrese la edad del estudiante");
      String edad_str = in.nextLine();
      int edad;
      try {
        edad = Integer.parseInt(edad_str);
      } catch (NumberFormatException e) {
        System.out.println("Debe ingresar un número sin decimales");
        continue;
      }

      System.out.println("Ingrese la nota obtenida");
      String nota_str = in.nextLine();
      double nota;
      try {
        nota = Double.parseDouble(nota_str);
      } catch (NumberFormatException e) {
        System.out.println("Debe ingresar un número con decimales");
        continue;
      }
      nombres.add(nombre);
      edades.add(edad);
      notas.add(nota);
    }
    double suma = 0;
    for (double nota : notas) {
      suma += nota;
    }
    double promedio = suma / notas.size();
    System.out.println("El promedio de las notas es " + promedio);
  }
}
