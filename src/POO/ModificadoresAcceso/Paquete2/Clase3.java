package POO.ModificadoresAcceso.Paquete2;

// Para hacer uso de objetos de otro paquete se debe de importar
import POO.ModificadoresAcceso.Paquete1.Clase1;

public class Clase3 {

    public static void main(String[] args) {

        Clase1 objetoClase1 = new Clase1();

        // No es posible porque el atributo no es publico
        //objetoClase1.atributo1 = 123;

        // Atributo alcanzado
        objetoClase1.atributo3 = 123;

    }

}
