import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ramdom_P {

    public static void main(String[] args) {
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 35 (inclusive)
        int cantidadPersonas = random.nextInt(1) + 1;

        // Crear una lista a partir de los valores del enum
        List<Persona> personas = new ArrayList<>(List.of(Persona.values()));

        // Barajar la lista para asegurar aleatoriedad
        Collections.shuffle(personas);

        // Tomar los primeros 'cantidadProductos' elementos de la lista
        List<Persona> personasAleatorios = personas.subList(0, cantidadPersonas);

        // Mostrar los productos seleccionados
        System.out.println("Se seleccionaron " + cantidadPersonas + " persona aleatorios:");
        for (Persona persona : personasAleatorios) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());

        }
    }
}
