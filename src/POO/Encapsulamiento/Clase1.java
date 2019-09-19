package POO.Encapsulamiento;

// El encapsulamiento "Oculta" los atributos o métodos de una clase
// para que solo puedan ser accedidos desde la misma clase.

public class Clase1 {

    // Atributos privados, accesible solo desde la misma clase
    private String nombre;
    private int edad;


    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
