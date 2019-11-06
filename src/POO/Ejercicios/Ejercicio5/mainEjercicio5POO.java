/*
* Diseñar un programa para trabajar con triángulos isósceles. Para ello defina
* los atributos necesarios que se requieren, proporcione métodos de consulta,
* un método constructor e implemente métodos para calcular el perímetro y el área
* de un triángulo, además implementar un método que a partir de un arreglo de
* triángulos devuelva el área del triángulo ed mayor superficie.
*
* */

package POO.Ejercicios.Ejercicio5;

import javax.swing.*;

public class mainEjercicio5POO {

    public static void main(String[] args) {

        double base, lado;

        int numTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Número de triángulos"));

        // Arreglos de objetos
        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[numTriangulos];

        for (int i = 0; i < triangulos.length; i++) {

            base = Double.parseDouble( JOptionPane.showInputDialog(
                    null, "Ingrese el valor de la base para el triángulo no. "+(i+1)));

            lado = Double.parseDouble( JOptionPane.showInputDialog(
                    null, "Ingrese el valor del lado para el triángulo no. "+(i+1)));

            triangulos[i] = new TrianguloIsosceles(base, lado);
        }

        JOptionPane.showMessageDialog(null, "El mayor triángulo tiene de área: " + mayorArea(triangulos));

    }


    public static double mayorArea(TrianguloIsosceles triangulos[]){
        double  area;

        area = triangulos[0].obtenerArea();
        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }

}
