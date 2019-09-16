package Basico;

public class Arreglo {

    public static void main(String[] args) {

        // Array Unidimensional sin inicializar
        int[] arrayUnidimensional = new int[5];
        for (int i=0; i < arrayUnidimensional.length; i++){
            arrayUnidimensional[i] = i+1;
        }

        // Array Unidimensional inicializado
        int[] arrayUnidimensionalInicializado = {1,2,3,4,5};

        for (int i:arrayUnidimensional) { System.out.print(i); }
        System.out.println("\n- - -");
        for (int i:arrayUnidimensionalInicializado) { System.out.print(i); }

    }

}
