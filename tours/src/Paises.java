import java.util.ArrayList;
import java.util.Scanner;

/**
 * Compendio de funciones para demostrar como se iteran arrays y ArrayList's
 */
public class Paises {
  /**
   * Función que solicita el número de países a visitar.
   * Luego itera por dichos países, con un "for"
   */
  public static void tour() {
    // 1. Creamos un Scanner para leer
    Scanner in = new Scanner(System.in);
    // 2. Preguntamos el número de países a visitar
    System.out.println("Ingrese el número de países");
    // 3. Leemos el número de paises y los transformamos al tipo "int"
    String num_paises_string = in.nextLine();
    int num_paises = Integer.parseInt(num_paises_string);
    // 4. Creamos un array donde ir guardando países
    String[] paises = new String[num_paises];
    // 5. Iteramos para ir llenando el array "paises"
    for (int i = 0; i < num_paises; i = i + 1) {
      System.out.println("Ingrese el país " + i);
      String nuevo_pais = in.nextLine();
      paises[i] = nuevo_pais;
    }
    // 6. Visitamos los países
    for (String pais : paises) {
      System.out.println("Usted visitó " + pais);
    }
  }

  /**
   * Función que usa ArrayList para iterar sobre un arreglo de largo indefinido
   */
  public static void tourList () {
    // lo vamos a implementar con arraylist
    // 1. Creamos un Scanner para ir leyendo paises
    Scanner in = new Scanner(System.in);
    // 2. Iniciamos un ArrayList para ir guardando los países
    ArrayList <String> paises = new ArrayList<String>();
    // 3. Usamos un while para ir preguntando paises
    while (true) {
      // 4. Le preguntamos al usuario
      System.out.println("Ingrese un nuevo país:");
      // 5. leemos un nuevo país
      String nuevo_pais = in.nextLine();
      // 6. Chequeamos si el usuario ya no desea seguir ingresando paises
      if (nuevo_pais.equals("0")) {
        break;
      }
      // 7. Si todo esta OK, agregamos el nuevo país
      paises.add(nuevo_pais);
    }
    for (String pais : paises) {
      System.out.println(pais);
    }
  }

  /** 
   * Evolución de la función anterior.
   * Ahora se usa un ArrayList de arrays de Strings
   */
  public static void presupuesto () {
    // 1. Creamos una lista donde dejar los países
    ArrayList <String []> paises = new ArrayList<String []>();
    // 2. Creamos un Scanner para leer los datos de los países
    Scanner in = new Scanner(System.in);
    // 3. Usamos un while infinito para ir llenando los paises

    int presupuesto_total = 0;

    while (true) {
      System.out.println("Ingrese el nombre del nuevo país");
      String nombre_pais = in.nextLine();
      System.out.println("Ingrese el dinero presupuestado para " + nombre_pais);
      String presupuesto_pais = in.nextLine();
      if (nombre_pais.equals("0")) {
        break;
      }
      // 5. Vamos a crear el nuevo pais
      String [] nuevo_pais = {nombre_pais, presupuesto_pais};
      // 6. Añadimos el nuevo pais a la lista de paises
      paises.add(nuevo_pais);
      // 7. Sumamos el presupuesto del país al presupuesto total
      int pres_pais_int = Integer.parseInt(presupuesto_pais);
      presupuesto_total += pres_pais_int;
    }
    // 7. Imprimimos los datos de los paises en la terminal
    for (String [] pais : paises) {
      String frase = "En " + pais[0] + " vamos a gastar $" + pais[1];
      System.out.println(frase);
    }
    // 8. Imprimimos el presupuesto total
    System.out.println("El presupuesto total es de $" + presupuesto_total);
  }
}
