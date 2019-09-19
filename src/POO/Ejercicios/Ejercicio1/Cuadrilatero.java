package POO.Ejercicios.Ejercicio1;

public class Cuadrilatero {

    // Atributos
    private float lado1;
    private float lado2;

    // Métodos

    // Constructor 1
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Constructor 2
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;        // Ambos lados son iguales
    }

    // Getters

    public float getPerimetro(){
        //float perimetro = 2 * (lado1 + lado2);
        //return perimetro;
        return 2 * (lado1 + lado2);
    }

    public float getArea(){
        return (lado1 + lado2);
    }

}
