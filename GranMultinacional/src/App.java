import productos.*;

public class App {
    public static void main(String[] args) throws Exception {
        RegistroProductos bolsa = new RegistroProductos();
        try {
            Lavadora mademsa = new Lavadora("LAV", 350000, 5, "Mademsa", "A");
            Refrigerador refri = new Refrigerador("Fensa", 250000, 3, "Fensa", 6.5);
            Pantalon tolompas = new Pantalon("PANT", 20000, 10, "cotele", "M");
            // añadir en una sola instrucción
            bolsa.agregarProd(mademsa);
            bolsa.agregarProd(refri);
            bolsa.agregarProd(tolompas);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        bolsa.listarProds();
    }
}
