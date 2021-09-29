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
        //Se utiliza this en un contecto dinamico dentro de una clase.
        this.nombre = nombre;
        this.apellidos = apellidos;
        System.out.println("Acceso a persona con uso de this " + this);
        new Imprimir().imprimir(this);
    }

}

class Imprimir {

    public void imprimir(Persona persona) {
        System.out.println("Imprimimos persona desde el metodo imprimir: " + persona);
        System.out.println("Imprimimos persona haciendo uso de this desde imprimir " + this);
    }
}
