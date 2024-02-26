public class ObjetosDePersona {
    public static void main(String[] args) {

        //La herencia es la capacidad de crear clases y objetos en base a otras clases
        Persona Estudiante = new Persona("Samuel", "Herrera", 17, 1017926398, "EAFIT");
        System.out.println("\nDatos sobre el Estudiante");
        Estudiante.saludar();
        Estudiante.mostrarInfo();
        System.out.println("Es mayor de edad? " + Estudiante.MayorDeEdad());


        Persona Docente = new Persona("Mariana", "Restrepo", 33, 43502246);
        System.out.println("\nDatos sobre el Docente");
        Docente.saludar();
        Docente.mostrarInfo();
        System.out.println("Es mayor de edad? " + Docente.MayorDeEdad());


        Persona Administrativo = new Persona("Carlos", "Sepulveda", 63, 32535046);
        System.out.println("\nDatos sobre el Administrativo");
        Administrativo.saludar();
        Administrativo.mostrarInfo();
        System.out.println("Es mayor de edad? " + Administrativo.MayorDeEdad());



        
    }

}