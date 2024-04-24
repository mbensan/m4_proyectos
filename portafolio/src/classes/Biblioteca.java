package classes;

import java.util.ArrayList;

public class Biblioteca {
  private ArrayList<Libro> misLibros = new ArrayList<Libro>();
  int num_libros = 0;

  // titulo = "Odisea"
  // <"Papelucho", "IT", "Odisea">
  private boolean existe(String titulo) {
    for (Libro li : misLibros) {
      if (li.getTitulo().equals(titulo)) {
        return true;
      }
    }
    return false;
  }

  public void addLibro(String titulo, String autor, String ISBN) {
    // 0. Chequeamos que el libro no exista previamente
    if (existe(titulo)) {
      System.out.println("El libro " + titulo + " ya existe");
      return;
    }
    // 1. Creamos el nuevo libro
    Libro nuevoLibro = new Libro(titulo, autor, ISBN);
    // 2. Lo agregamos a la lista
    misLibros.add(nuevoLibro);

    int x = 10;
  }

  public void prestarLibro(String titulo) {
    ;
  }

  public void devolverLibro(String titulo) {
    ;
  }

  public void mostrarLibros() {
    System.out.println("Estos son los libros");
    for (Libro l : misLibros) {
      System.out.println(l.getTitulo());
    }
  }

}
