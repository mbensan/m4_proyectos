package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Leccion4 {
  static ArrayList<Tarea> tareas = new ArrayList<Tarea>();
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    demo();

    while (true) {
      String pregunta = "Ingrese una opción\n0. Agregar nueva tarea\n1. Mostrar tareas\n2. Cambiar estado de una tarea";
      System.out.println(pregunta);

      String respuesta = in.nextLine();

      // if (respuesta.equals("0")) {
      // agregar_tarea();
      // } else if (respuesta.equals("1")) {
      // // mostrar tareas
      // } else if (respuesta.equals("2")) {
      // // modificar tarea
      // } else {
      // System.out.println("Esa opción no existe");
      // }
      switch (respuesta) {
        case "0":
          agregar_tarea();
          break;
        case "1":
          listar_tareas();
          break;
        case "2":
          modificar_tarea();
          break;
        default:
          System.out.println("Esa opción no existe");
          break;
      }
    }
  }

  static public void demo() {
    tareas.add(new Tarea("Escribir un poema", "Para un Fanzine"));
    tareas.add(new Tarea("Ordenar la pieza", "Hacer la cama"));
  }

  static public void modificar_tarea() {
    System.out.println("Elija la tarea que desea modificar");
    for (int i = 0; i < tareas.size(); i++) {
      System.out.println(i + ". " + tareas.get(i).nombre);
    }
    int eleccion = Integer.parseInt(in.nextLine());
    System.out.println("\nIngrese el nuevo estado\n1. Pendiente\n2. En proceso\n3. Completado\3\3\n");
    int estado;
    try {
      estado = Integer.parseInt(in.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("Debe ingresar un estado correcto");
      return;
    }
    Tarea porCambiar;
    try {
      porCambiar = tareas.get(eleccion);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Esa tarea no existe");
      return;
    }
    switch (estado) {
      case 1:
        porCambiar.estado = "Pendiente";
        break;
      case 2:
        porCambiar.estado = "En proceso";
        break;
      case 3:
        porCambiar.estado = "Completada";
        break;
      default:
        System.out.println("Esa opcion no es válida");
        return;
    }
    System.out.println("La tarea fué actualizada con éxito");
  }

  static public void agregar_tarea() {
    System.out.println("Ingrese el nombre:");
    String nombre = in.nextLine();

    System.out.println("Ingrese la descripcion:");
    String descripcion = in.nextLine();

    Tarea t = new Tarea(nombre, descripcion);

    tareas.add(t);
    System.out.println("Tarea ingresada correctamente\n");
  }

  static public void listar_tareas() {
    for (Tarea t : tareas) {
      System.out.println(t);
    }
    System.out.println("");
  }

}
