package usothis;

public class UsoThis {

    public static void main(String[] args) {

        Persona p1 = new Persona("Santiago", "Mrv");
        System.out.println("p1 = " + p1); //Se muestra la referencia a Persona

    }
}

class Persona {

    String nombre, apellidos;

    //Constructor
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        System.out.println("Acceso a persona con uso de this" + this);
    }

}
