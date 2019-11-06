/*
* Construir un programa que dada una serie de vehículos caracterizados por su marca,
* modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se
* deberán leer por teclado las características de cada vehículo y crear un clase
* que represente a cada uno de ellos.
*/

package POO.Ejercicios.Ejercicio3;

import javax.swing.*;

public class mainEjercicio3POO {

    public static void main(String[] args) {

        int numVehiculos = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de vehiculos"));

        // Creando array de la clase coches
        Vehiculo coches[] = new Vehiculo[numVehiculos];


        // Agregando datos a cada objeto dentro del arreglo
        for (int i = 0; i < coches.length; i++) {
            String marca = JOptionPane.showInputDialog(null, "Marca del coche número "+ (i+1));
            String modelo = JOptionPane.showInputDialog(null, "Modelo del coche número "+ (i+1));
            float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Precio del coche número "+(i+1)));
            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        int indiceBarato = indiceCocheMasBarato(coches);
        JOptionPane.showMessageDialog(null, "El coche más barato es \n" +
                coches[indiceBarato].toString());

    }


    // Buscando el índice del arreglo para encontrar el coche más barato
    public static int indiceCocheMasBarato(Vehiculo coches[]){
        float precio = coches[0].getPrecio();   // Precio primer coche
        int indice = 0;

        // recorriendo precios
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;     // Menor precio que el actual
            }
        }
        return indice;
    }




}
