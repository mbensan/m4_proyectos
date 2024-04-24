import java.util.ArrayList;

import classes.Planta;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 1. declaro la variable
        Planta romero;

        // 2. Le asigno un valor
        String[] props = { "Memoria", "Crecimiento del Cabello", "Antibacterial" };
        romero = new Planta("Romero", true, 9, props);

        // 3. Creamos otras 2 plantas
        String[] props2 = { "Decorativo" };
        Planta ficus = new Planta("Ficcus", true, 6, props2);

        String[] props3 = { "Sedante", "Antiinflamatoria", "Digestiva", "Antiséptica", "Antibaceriana" };
        Planta lava = new Planta("Lavanda", false, 9, props3);

        ArrayList<Planta> misPlantas = new ArrayList<Planta>();
        misPlantas.add(romero);
        misPlantas.add(ficus);
        misPlantas.add(lava);

        System.out.println(lava);
    }
}
