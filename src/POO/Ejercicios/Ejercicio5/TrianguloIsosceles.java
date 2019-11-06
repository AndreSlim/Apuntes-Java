package POO.Ejercicios.Ejercicio5;

public class TrianguloIsosceles {

    // Atributos
    private double base;
    private double lado;

    // Constructor
    public TrianguloIsosceles(double base, double lado) {
        this.lado = lado;
        this.base = base;
    }

    // Método obtener perímetro
    public double obtenerPerimetro(){
        double perimetro = (2 * lado * base);
        return perimetro;
    }

    // Método obtener área
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado) - ((base*base)/4)))/2;
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
