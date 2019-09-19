/*
*   Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero
*   y actualice su posición dentro del mismo. los movimientos posibles son
*   ARRIBA, ABAJO, IZQUIERDA, DERECHA. Tras cada movimiento el programa mostrará la nueva dirección elegida
*   y las coordenadas de situación del objeto dentro del tablero
*
* */

package POO.Ejercicios.Ejercicio2;

import javax.swing.*;

public class mainEjercicio2POO {

    public static void main(String[] args) {

        int a=5;
        String op;

        try {
            a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del tablero"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡Acción inesperada!" +
                                                                "\nIntroducidos valores por defecto." +
                                                                "\n( 5x5 )");
        }

        a = (a > 0) ? a : 5; // Operador ternario para evitar valores menores a 1
        Tablero tablero = new Tablero(a);

        do {

            try {
                op = JOptionPane.showInputDialog(tablero.getCoordenadas() + "\nMuévase con \"WASD\"" +
                                                                        " \n( Arriba, Izquierda, Abajo, Derecha )").toLowerCase();
            }catch (NullPointerException e){
                op = "*";
            }

            switch (op){
                case "d":
                    tablero.setDerecha();
                    break;
                case "a":
                    tablero.setIzquierda();
                    break;
                case "w":
                    tablero.setArriba();
                    break;
                case "s":
                    tablero.setAbajo();
                    break;
                case "q":
                    JOptionPane.showMessageDialog(null, "¡Adios!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida" +
                                                                        "\nPara salir escriba \"q\"");
                    break;
            }

        } while (!op.equals("q"));

    }

}
