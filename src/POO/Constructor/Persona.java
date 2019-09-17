package POO.Constructor;

import java.sql.SQLOutput;

public class Persona {

    // ~Atributos~
    String nombre;
    int edad;


    // Método constructor
    public Persona(String nombre, int edad){       // Es publico y no retorna valores
        this.nombre = nombre;
        this.edad = edad;
        // 'this' Hace referencia a las variables de los ~Atributos~,
        // diferenciándose de las variables que hacen referencia a los argumentos del método
    }


    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

}
