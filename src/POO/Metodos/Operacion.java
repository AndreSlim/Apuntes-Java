package POO.Metodos;

import javax.swing.*;

// Clase Operación
public class Operacion {

    // Atributos de la clase
    int suma, resta, multiplicacion, division;

    // Métodos (Acciones que realiza la Clase)

    public void sumar(int num1, int num2){  // Método con dos parámetros
        suma = num1+num2;
        System.out.println("La suma es: " + suma);
    }

    public void restar(int num1, int num2){
        resta = num1-num2;
        System.out.println("La resta es: " + resta);
    }

    public void multiplicar(int num1, int num2){
        multiplicacion = num1*num2;
        System.out.println("La multiplicación  es: " + suma);
    }

    public void dividir(int num1, int num2){
        division = num1/num2;
        System.out.println("La división es: " + division);
    }


}
