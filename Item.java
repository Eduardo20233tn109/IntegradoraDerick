public enum Item {
    ITEM_1("Arroz", "Arroz de grano largo, 1kg", 30.00, 1),
    ITEM_2("Pan", "Pan integral, paquete de 500g", 25.00, 2),
    ITEM_3("Leche", "Leche entera, 1 litro", 18.00, 3),
    ITEM_4("Huevos", "Caja con 12 huevos frescos", 40.00, 4),
    ITEM_5("Pasta", "Pasta tipo espagueti, 500g", 20.00, 5),
    ITEM_6("Azúcar", "Azúcar blanca, 1kg", 22.00, 6),
    ITEM_7("Café", "Café molido, 250g", 50.00, 7),
    ITEM_8("Aceite", "Aceite de oliva, 1 litro", 90.00, 8),
    ITEM_9("Sal", "Sal marina, 500g", 12.00, 9),
    ITEM_10("Tomates", "Tomates frescos, 1kg", 35.00, 10),
    ITEM_11("Lechuga", "Lechuga fresca, unidad", 18.00, 11),
    ITEM_12("Cereal", "Cereal de avena, 300g", 45.00, 12),
    ITEM_13("Papel higiénico", "Paquete de 4 rollos", 35.00, 13),
    ITEM_14("Detergente", "Detergente líquido para ropa, 1 litro", 55.00, 14),
    ITEM_15("Jabón", "Jabón de tocador, 3 barras", 20.00, 15);

    private final String nombre;
    private final String descripcion;
    private final double precio;
    private final int id;

    Item(String nombre, String descripcion, double precio, int id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }
}
