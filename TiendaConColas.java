import java.util.Random;
import java.util.Scanner;

public class TiendaConColas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Crear la cola de carritos
        Queue<Carrito> colaDeCarritos = new Queue<>();

        // Preguntar cuántos carritos se van a crear
        System.out.print("¿Cuántos carritos deseas crear? ");
        int cantidadCarritos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Crear listas de personas y productos usando DoubleLinkedList
        DoubleLinkedList<Persona> listaPersonas = new DoubleLinkedList<>();
        for (Persona persona : Persona.values()) {
            listaPersonas.add(persona);
        }

        DoubleLinkedList<Item> listaProductos = new DoubleLinkedList<>();
        for (Item item : Item.values()) {
            listaProductos.add(item);
        }

        // Generar carritos
        for (int i = 0; i < cantidadCarritos; i++) {
            // Seleccionar una persona aleatoria
            int indicePersona = random.nextInt(listaPersonas.size());
            Persona personaSeleccionada = listaPersonas.get(indicePersona);

            // Seleccionar productos aleatorios
            int cantidadProductos = random.nextInt(35) + 1;
            DoubleLinkedList<Item> productosAleatorios = new DoubleLinkedList<>();
            for (int j = 0; j < cantidadProductos; j++) {
                int indiceProducto = random.nextInt(listaProductos.size());
                productosAleatorios.add(listaProductos.get(indiceProducto));
            }

            // Crear y añadir el carrito a la cola
            Carrito carrito = new Carrito(personaSeleccionada, productosAleatorios);
            colaDeCarritos.offer(carrito);
        }

        // Procesar carritos
        System.out.println("\nCarritos creados. Vamos a procesarlos.");
        while (!colaDeCarritos.isEmpty()) {
            Carrito carritoActual = colaDeCarritos.peek();
            System.out.println("\nCarrito actual:");
            System.out.println("Atendido por: " + carritoActual.getPersona().getNombre() + " " + carritoActual.getPersona().getApellido());
            System.out.println("Productos:");
            for (int i = 0; i < carritoActual.getProductos().size(); i++) {
                Item item = carritoActual.getProductos().get(i);
                System.out.println("- " + item.getNombre() + ": " + item.getDescripcion() + " ($" + item.getPrecio() + ")");
            }

            // Preguntar si avanzar al siguiente carrito
            System.out.print("\n¿Avanzar al siguiente carrito? (Escribe 'Si' para avanzar): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("Si")) {
                colaDeCarritos.poll(); // Eliminar el carrito actual
            } else {
                System.out.println("Operación cancelada.");
                break;
            }
        }

        if (colaDeCarritos.isEmpty()) {
            System.out.println("\nYa son todos los carritos.");
        }
        scanner.close();
    }
}

// Clase Carrito
class Carrito {
    private final Persona persona;
    private final DoubleLinkedList<Item> productos;

    public Carrito(Persona persona, DoubleLinkedList<Item> productos) {
        this.persona = persona;
        this.productos = productos;
    }

    public Persona getPersona() {
        return persona;
    }

    public DoubleLinkedList<Item> getProductos() {
        return productos;
    }
}
