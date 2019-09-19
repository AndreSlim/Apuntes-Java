package POO.Ejercicios.Ejercicio2;

public class Tablero {

    // Atributos
    private int[][] coordenadas;

    // Métodos

    // Constructor
    public Tablero(int a) {
        coordenadas = new int[a][a];
        for (int i=0; i < coordenadas.length; i++){
            for (int j=0; j < coordenadas.length; j++){
                coordenadas[i][j] = 0;
            }
        }
        coordenadas[a/2][a/2] = 1;
    }

    // Dibujando el mapa del tablero
    String getCoordenadas() {
        StringBuilder mapa = new StringBuilder();
        for (int[] coordenada : coordenadas) {  // foreach para recorrer el array
            for (int j = 0; j < coordenadas.length; j++) {
                mapa.append(coordenada[j]).append(" "); // Dibujando los puntos
            }
            mapa.append("\n");
        }
        return mapa.toString();
    }

    void setAbajo() {
        int a=0, b=0;
        for (int i = 0; i < coordenadas.length; i++) {
            for (int j = 0; j < coordenadas.length; j++) {
                if (coordenadas[i][j] == 1){
                    a = i;      // Obteniendo coordenadas del punto actual
                    b = j;
                }
            }
        }
        try {
            coordenadas[a][b] = 0;      // Actualizando la posición del punto
            coordenadas[a+1][b] = 1;
            System.out.println((a+1)+" - "+b);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("¡Fuera de Rango!");
            coordenadas[a][b] = 1;
            System.out.println(a+" - "+b);
        };
    }

    void setArriba() {
        int a=0, b=0;
        for (int i = 0; i < coordenadas.length; i++) {
            for (int j = 0; j < coordenadas.length; j++) {
                if (coordenadas[i][j] == 1){
                    a = i;
                    b = j;
                }
            }
        }
        try {
            coordenadas[a][b] = 0;      // Actualizando la posición del punto
            coordenadas[a-1][b] = 1;
            System.out.println((a-1)+" - "+b);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("¡Fuera de Rango!");
            coordenadas[a][b] = 1;
            System.out.println(a+" - "+b);
        };
    }

    void setIzquierda() {
        int a=0, b=0;
        for (int i = 0; i < coordenadas.length; i++) {
            for (int j = 0; j < coordenadas.length; j++) {
                if (coordenadas[i][j] == 1){
                    a = i;
                    b = j;
                }
            }
        }
        try {
            coordenadas[a][b] = 0;      // Actualizando la posición del punto
            coordenadas[a][b-1] = 1;
            System.out.println(a+" - "+(b-1));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("¡Fuera de Rango!");
            coordenadas[a][b] = 1;
            System.out.println(a+" - "+b);
        };
    }

    void setDerecha() {
        int a=0, b=0;
        for (int i = 0; i < coordenadas.length; i++) {
            for (int j = 0; j < coordenadas.length; j++) {
                if (coordenadas[i][j] == 1){
                    a = i;
                    b = j;
                }
            }
        }
        try {
            coordenadas[a][b] = 0;      // Actualizando la posición del punto
            coordenadas[a][b+1] = 1;
            System.out.println(a+" - "+(b+1));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("¡Fuera de Rango!");
            coordenadas[a][b] = 1;
            System.out.println(a+" - "+b);
        };
    }




}
