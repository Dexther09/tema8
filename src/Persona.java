public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Getter y Setter para la propiedad "edad"
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y Setter para la propiedad "nombre"
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para la propiedad "telefono"
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        // Crear un objeto persona
        Persona persona = new Persona();

        // Utilizar los setters para asignar valores a las propiedades
        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono("123456789");

        // Utilizar los getters para mostrar las propiedades por consola
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
