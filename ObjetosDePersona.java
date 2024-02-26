public class ObjetosDePersona {
    public static void main(String[] args) {
        //Herencia es la capacidad de crear clases y objetos en base a otras clases
        Persona Estudiante = new Persona("Samuel", "Herrera", 18);
        System.out.println("Nombre: " + Estudiante.getNombre() );
    }
}
