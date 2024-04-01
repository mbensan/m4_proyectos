public class Bootstrap {
/**
 * Clase que sirve para construír elementos de Bootstrap

  /**
   * Función para obtener un enlace del navbar típico de Bootstrap
   * @param url
   * @param texto Contenido del enlace
   * @return String con el HTML necesario
   */
  public static String getEnlace (String url, String texto) {
    String enlace = """
      <li class="nav-item">
        <a class="nav-link" href="%s">%s</a>
      </li>
    """.formatted(url, texto);
    return enlace;
  }
}
