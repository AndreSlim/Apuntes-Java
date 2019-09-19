package POO.ModificadoresAcceso.Paquete1;

/*
*  Modificador de acceso indica cual es la visibilidad que
*  tendrá un atributo o un método con referencia a otras clases
*
*  -private
*   Restringe para ser utilizado solo por los métodos de la misma clase
*
*   Por defecto los atributos pueden ser accesados por cualquier método
*   que se encuentren en el mismo package
*
*  -public
*   Puede ser utilizado por cualquier clase, sea la clase del mismo package o no
*
*
* */

public class Clase1 {

    // Atributos
    private int atributo1;
    int atributo2;
    public int atributo3;


    // Métodos
    public void metodo1(){
        atributo1 = 123;
    }


}
