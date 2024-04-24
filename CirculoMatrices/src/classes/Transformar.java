package classes;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

// 82
public class Transformar {
  static public String palabra(int num) {
    /**
     * 1 => "uno",
     * 5 => "cinco",
     * 945821 => "novecientos cuarenta y cinco mil ochocientos veinti uno"
     */
    String[] primeros15 = {
        "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
        "siete", "ocho", "nueve", "diez", "once", "doce", "trece",
        "catorce", "quince"
    };
    if (num <= 15) { // los primeros 15
      return primeros15[num];
    } else if (num <= 19) { // dieci-algo
      int unidades = num - 10;
      return "dieci" + palabra(unidades);
    } else if (num == 20) {
      return "veinte";
    } else if (num <= 29) { // veinti-algo
      return "veinti" + palabra(num - 20);
    } else if (num <= 99) { // algo y algo (52)
      int decenas = Math.round(num / 10);
      int unidades = num - (decenas * 10);
      String[] decenas_palabras = { "", "", "", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
          "noventa" };

      if (unidades == 0) {
        return decenas_palabras[decenas];
      }
      return decenas_palabras[decenas] + " y " + palabra(unidades);
    } else if (num == 100) {
      return "cien";
    } else if (num <= 199) { // ciento - algo
      int resto = num - 100;
      return "ciento " + palabra(resto);
    } else if (num <= 999) {
      int centenas = Math.round(num / 100);
      int resto = num - (centenas * 100);

      String[] centenas_palabras = { "", "", "docientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos",
          "setecientos", "ochocientos", "novecientos" };
      if (resto == 0) {
        return centenas_palabras[centenas];
      }
      return centenas_palabras[centenas] + " " + palabra(resto);
    } else if (num == 1000) {
      return "mil";
    } else if (num <= 1999) { // mil - algo
      int resto = num - 1000;
      return "mil " + palabra(resto);
    } else if (num <= 999999) { // algo - mil -algo // 567 203
      int miles = Math.round(num / 1000);
      int resto = num - (miles * 1000);
      if (resto == 0) {
        return ajustarUn(palabra(miles)) + " mil";
      }
      return ajustarUn(palabra(miles)) + " mil " + palabra(resto);
    } else {
      return "No Implementado";
    }

  }

  static public String ajustarUn(String palabra) {
    if (palabra.endsWith("uno")) {
      String nueva = palabra.replace("uno", "un");
      return nueva;
    }
    return palabra;
  }

  public static void main(String[] args) {
    System.out.println(palabra(203567));
    System.out.println(palabra(789045));
    System.out.println(palabra(301000));

    LocalDate ahora = LocalDate.now();
    System.out.println(ahora);

    LocalDate fecha_nac = LocalDate.of(2010, 9, 21);
    System.out.println(fecha_nac.getMonthValue());
  }
}
