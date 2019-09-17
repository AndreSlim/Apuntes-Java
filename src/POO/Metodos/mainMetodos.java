package POO.Metodos;

import javax.swing.*;

public class mainMetodos {

    public static void main(String[] args) {

        // Creando el objeto
        Operacion op = new Operacion();

        // Matriz con los números a utilizar
        int[] numeros = new int[2];

        leerNumeros(numeros);

        // Enviando datos como Argumentos
        op.sumar(numeros[0], numeros[1]);
        op.restar(numeros[0], numeros[1]);
        op.multiplicar(numeros[0], numeros[1]);
        op.dividir(numeros[0], numeros[1]);
    }

    // Método con dato de retorno (Solución menos óptima solo para fines prácticos)
    private static int[] leerNumeros(int[] numeros) {
        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero número"));
        numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        return numeros; // Retorna el array con los datos capturados
    }

}
