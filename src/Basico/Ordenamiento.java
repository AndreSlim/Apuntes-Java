package Basico;

import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) {

        int arreglo[] = new int[10];

        aleatorio(arreglo);
        metodoBurbuja(arreglo);

        aleatorio(arreglo);
        metodoInsercion(arreglo);

    }


    private static void aleatorio(int[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = random.nextInt(100) + 1;   // Números entre 1 y 100
        }
        System.out.println("Números aleatorios del arreglo actual:");
        for (int i:arreglo) { System.out.print(i + " "); }
    }


    private static void metodoBurbuja(int[] arreglo) {
        int aux;
        for (int i=0; i<(arreglo.length-1); i++) {              // Loop al arreglo
            for (int j = 0; j < (arreglo.length - 1); j++){     // Loop para intercambio
                if (arreglo[j] > arreglo[j + 1]) {              // NúmeroActual > NúmeroSiguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];                // Intercambiando posición
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("\nResultado del método burbuja:");
        for (int i:arreglo) { System.out.print(i + " "); }
        System.out.println("\n");
    }


    private static void metodoInsercion(int[] arreglo) {
        int aux, pos;
        for (int i=0; i<arreglo.length; i++){           // Loop al arreglo
            pos = i;                                    // Posición del elemento a ordenar
            aux = arreglo[i];                           // Valor del elemento a ordenar
            while ((pos>0) && (arreglo[pos-1]>aux)){    // NoHayNúmeroEnIzquierda & NúmeroIzquierdaMayorQueActual
                arreglo[pos] = arreglo[pos-1];          // Intercambio de posiciones
                pos--;                                  // Comprobando hasta llegar a posición inicial
            }
            arreglo[pos] = aux;                         // Refrescar el número actual
        }
        System.out.println("\nResultado del método por inserción:");
        for (int i:arreglo) { System.out.print(i + " "); }
        System.out.println("\n");
    }

}
