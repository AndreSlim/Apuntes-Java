package POO.SobrecargaMetodos;

public class Persona {

    // Atributos
    String nombre;
    int edad;
    String estado;

    // Métodos

    // En la sobrecarga de métodos, estos se diferenciarán unos de otros de acuerdo a los parámetros solicitados

    // Método constructor 1 (Dos parámetros)
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método constructor 2 (Un parámetro)
    public Persona(String estado) {
        this.estado = estado;
    }

    // Método correr 1 (Sin parámetro)
    public void correr(){
        System.out.println("Método correr 1:");
        System.out.println("nombre: " + nombre + "\nedad: " + edad + "\n");
    }

    // Método correr 2 (Un parámetro)
    public void correr(int km){
        System.out.println("Método correr 2:");
        System.out.println("kilómetros recorridos: " + km + "\n");
    }





}
