import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ramdom_I {

    public static void main(String[] args) {
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 35 (inclusive)
        int cantidadProductos = random.nextInt(35) + 1;

        // Crear una lista a partir de los valores del enum
        List<Item> items = new ArrayList<>(List.of(Item.values()));

        // Barajar la lista para asegurar aleatoriedad
        Collections.shuffle(items);

        // Tomar los primeros 'cantidadProductos' elementos de la lista
        List<Item> productosAleatorios = items.subList(0, cantidadProductos);

        // Mostrar los productos seleccionados
        System.out.println("Se seleccionaron " + cantidadProductos + " productos aleatorios:");
        for (Item item : productosAleatorios) {
            System.out.println("- " + item.getNombre() + ": " + item.getDescripcion() + " ($" + item.getPrecio() + ")");
        }
    }
}
