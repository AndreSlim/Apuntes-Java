package POO.SobrecargaMetodos;

public class mainPersonaSobrecarga {

    public static void main(String[] args) {


        // Utilizando el Constructor 1
        Persona persona1 = new Persona("Andrés", 25);
        // Utilizando el método correr 1
        persona1.correr();


        // Utilizando el Constructor 2
        Persona persona2 = new Persona("Oaxaca");
        // Utilizando el método correr 2
        persona2.correr(50);

    }

}
