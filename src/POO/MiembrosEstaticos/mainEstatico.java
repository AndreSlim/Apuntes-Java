package POO.MiembrosEstaticos;

/*
*  Los miembros estáticos (Miembros de clase) no pertenecen al objeto cuando es creado
*  si no a la clase
* */

public class mainEstatico {

    // Atributos de la clase

    // Atributo no estático, por lo tanto le pertenece al objeto
    // Cada objeto hace una copia de este atributo y pude manipularlo independientemente
    private String frase = "Atributo inicial";

    // Atributo estático, por lo tanto no pertenece individualmente a cada objeto
    // Cualquier cambio se verá reflejado en TODOS los objetos creados de esta clase
    private static String fraseEstatica = "Hola mundo!!";

    public static void main(String[] args) {

        // Objetos de la clase
        mainEstatico obj1 = new mainEstatico();
        mainEstatico obj2 = new mainEstatico();

        // Atributo modificado solo para objeto 2
        obj2.frase = "Atributo inicial perteneciente al objeto 2";

        // Atributo estático modificado para todos los objetos
        obj2.fraseEstatica = "Hola mundo!! -> Modificado para todos los Objetos";

        System.out.println(obj1.frase);
        System.out.println(obj2.frase);

        // Imprimiendo atributo estático desde objeto 1
        System.out.println("\n" + obj1.fraseEstatica);

        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

        // Los atributos estáticos no necesitan ser instanciados para poder ser utilizados
        System.out.println("\nLlamada al atributo sin Instanciar:\n" + mainEstatico.fraseEstatica);

        // Los meétodos estáticos no necesitan ser instanciados para poder ser utilizados
        System.out.println("\nLa suma del método estático es: " + mainEstatico.sumar(2,3));



    }


    public static int sumar(int num1, int num2){
        int suma = num1+num2;
        return suma;
    }

}
