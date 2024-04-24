package classes;

public class Leccion5 {
  public static void main(String[] args) {
    Biblioteca nacional = new Biblioteca();

    nacional.addLibro("La fuerza de Sheccid", "Carlos Cuauhtemoc", "qwerty");
    nacional.addLibro("Luna de plutón", "Dross", "qwerty1");
    nacional.addLibro("Mujercitas", "Louisa May Alcott", "qwert2");
    nacional.addLibro("Mujercitas", "Louisa May Alcott", "qwert2");

    nacional.mostrarLibros();

  }
}
