    // Abstracción (capacidad de crear una clase con propiedades y métodos)
public class Persona {

    // Encapsulamiento (Por hacer uso de private y static )
    private static String nombre, apellido, universidad;
    private static int edad, documento;

    // Constructor
    // Polimorfismo (Es que un mismo método ejecute diferentes tareas)

    public Persona(String nombre, String apellido, int edad, int documento, String universidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.universidad = universidad; 
    }

    public Persona(String nombre, String apellido, int edad, int documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.universidad = "UDEA";
    }




    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String Nombre) {
        Persona.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Persona.apellido = apellido;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Persona.edad = edad;
    }

    public static int getDocumento(){
        return documento;
    }

    public static void setDocumento(int documento){
        Persona.documento = documento;
    }

    public static String getUniversidad(){
        return Persona.universidad;
    }


    public void mostrarInfo() {
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
        System.out.println("Universidad: " + universidad);
    }

    public boolean MayorDeEdad() {
        int edadLegal = 18;
        return this.edad >= edadLegal;
    }
    
    public void saludar() {
        System.out.println("Hola, soy " + this.nombre + "!");
    }
    

}
