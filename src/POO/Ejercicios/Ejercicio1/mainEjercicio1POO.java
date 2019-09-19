/*
 *   Ejercicio 1: Construir un programa que calcule el área y el perímetro de un
 *   cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud deberán
 *   introducirse por línea de ordenes. Si es un cuadrado, sólo se proporcionará la
 *   longitud de uno de los lados al constructor.
 *
 * */

package POO.Ejercicios.Ejercicio1;

import javax.swing.*;

public class mainEjercicio1POO {

    public static void main(String[] args) {

        // Instancia de la clase Cuadrilátero
        Cuadrilatero c1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado 2"));

        // Comprueba que sea un cuadrado
        if (lado1 == lado2){
            c1 = new Cuadrilatero(lado1);           // Utilizando Constructor 1
        }else {
            c1 = new Cuadrilatero(lado1,lado2);     // Utilizando Constructor 2
        }

        JOptionPane.showConfirmDialog(null, "El perímetro es: " + c1.getPerimetro() +
                                                                        "\nEl área es :"  + c1.getArea(),
                                                                "Resultado",JOptionPane.PLAIN_MESSAGE);

    }

}
