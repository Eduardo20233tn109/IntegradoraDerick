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
    ITEM_15("Jabón", "Jabón de tocador, 3 barras", 20.00, 15),
    ITEM_16("Manteca", "Manteca vegetal, 500g", 40.00, 16),
    ITEM_17("Yogurt", "Yogurt natural, 1 litro", 35.00, 17),
    ITEM_18("Jugo", "Jugo de naranja, 1 litro", 25.00, 18),
    ITEM_19("Papitas", "Papas fritas, 200g", 15.00, 19),
    ITEM_20("Tortillas", "Tortillas de maíz, paquete de 1kg", 25.00, 20),
    ITEM_21("Sopa", "Sopa instantánea, paquete de 5", 20.00, 21),
    ITEM_22("Chiles", "Chiles frescos, 200g", 10.00, 22),
    ITEM_23("Aguacate", "Aguacates frescos, 3 piezas", 50.00, 23),
    ITEM_24("Pechuga de pollo", "Pechuga de pollo, 1kg", 80.00, 24),
    ITEM_25("Pescado", "Pescado fresco, 1kg", 120.00, 25),
    ITEM_26("Té", "Té verde, 20 bolsitas", 30.00, 26),
    ITEM_27("Chocolates", "Caja de chocolates, 200g", 60.00, 27),
    ITEM_28("Frijoles", "Frijoles negros, 1kg", 35.00, 28),
    ITEM_29("Papas", "Papas frescas, 1kg", 25.00, 29),
    ITEM_30("Cebolla", "Cebollas frescas, 1kg", 18.00, 30),
    ITEM_31("Manzanas", "Manzanas rojas, 1kg", 40.00, 31),
    ITEM_32("Plátanos", "Plátanos frescos, 1kg", 20.00, 32),
    ITEM_33("Zanahorias", "Zanahorias frescas, 1kg", 18.00, 33),
    ITEM_34("Pechuga de pavo", "Pechuga de pavo, 1kg", 100.00, 34),
    ITEM_35("Chiles jalapeños", "Chiles jalapeños frescos, 200g", 15.00, 35);

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
