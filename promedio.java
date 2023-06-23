package areaDeCirculo;

import java.util.Scanner;

public class promedio {
	private float promedio;
	private float numero2;
	private float numero1;

    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de areas de circulo FUNVAL");
        System.out.print("Ingrese el valor del numero1: ");
        numero1= scanner.nextFloat();
        System.out.print("Ingrese el valor del numero2: ");
        numero2 = scanner.nextFloat();
    }

    public float calcularPromedio() {
        double promedio = (numero1+numero2)/2; 
        return (float) promedio;
    }

    public static void main(String[] args) {
        promedio Promedio = new promedio();
        Promedio.solicitarDatos();
        float area = Promedio.calcularPromedio();
        System.out.println("El promedio es : " + area);
    }
    
}
