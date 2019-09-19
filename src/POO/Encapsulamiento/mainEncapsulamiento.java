package POO.Encapsulamiento;

public class mainEncapsulamiento {

    public static void main(String[] args) {

        Clase1 objeto = new Clase1();

        objeto.setNombre("Andrés");
        objeto.setEdad(25);

        System.out.println("Nombre: " + objeto.getNombre());
        System.out.println("Edad: " + objeto.getEdad());

    }

}
