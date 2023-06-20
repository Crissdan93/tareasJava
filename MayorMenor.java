package tarea4;

import java.util.Scanner;

public class MayorMenor {
	private int valor1;
    private int valor2;
    private int valor3;
    
    public static void main(String[] args) {
        MayorMenor mm = new MayorMenor();
        mm.ingresarValores();
        mm.mostrarMayorMenor();
    }
    public void ingresarValores() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        valor2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer valor: ");
        valor3 = scanner.nextInt();

}
    
    public void mostrarMayorMenor() {
        int mayor = valor1;
        int menor = valor1;
        
        if (valor2 > mayor) {
            mayor = valor2;
        }
        
        if (valor3 > mayor) {
            mayor = valor3;
        }
        
        if (valor2 < menor) {
            menor = valor2;
        }
        
        if (valor3 < menor) {
            menor = valor3;
        }
        
        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);
    }
    
    
    }
    

