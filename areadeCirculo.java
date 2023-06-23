package areaDeCirculo;

import java.util.Scanner;

public class areadeCirculo {
	private float radio;

    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de areas de circulo FUNVAL");
        System.out.print("Ingrese el valor del radio del círculo: ");
        radio = scanner.nextFloat();
    }

    public float calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return (float) area;
    }

    public static void main(String[] args) {
        areadeCirculo circulo = new areadeCirculo();
        circulo.solicitarDatos();
        float area = circulo.calcularArea();
        System.out.println("El área del círculo es: " + area);
    }
    
}










