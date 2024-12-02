public enum Persona {
    PERSONA_1("Eduardo", "Juarez", 1),
    PERSONA_2("Laura", "Perez", 2),
    PERSONA_3("Daniel", "Gomez", 3),
    PERSONA_4("Lluvia", "Gonzalez", 4),
    PERSONA_5("Ruben", "Nieto", 5);

    private final String nombre;
    private final String apellido;
    private final int id;

    Persona(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }
}
