package classes;

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
    } else {
      return "No Implementado";
    }
  }
}
