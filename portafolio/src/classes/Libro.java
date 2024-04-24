package classes;

public class Libro {
  private String titulo;
  private String autor;
  private boolean disp;
  private String ISBN;

  public Libro(String titulo, String autor, String ISBN) {
    this.titulo = titulo;
    this.autor = autor;
    this.disp = true;
    this.ISBN = ISBN;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public boolean isDisp() {
    return this.disp;
  }

  public boolean getDisp() {
    return this.disp;
  }

  public void setDisp(boolean disp) {
    this.disp = disp;
  }

  public String getISBN() {
    return this.ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

}
