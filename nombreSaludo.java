package tarea5;

import java.util.Scanner;


public class nombreSaludo {
    private String nombre;
    private int edad;
    
    public static void main(String[] args) {
        nombreSaludo persona = new nombreSaludo();
        persona.ingresarDatos();
        persona.saludar();
    }
    
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();
    }
    
    public void saludar() {
        System.out.println("¡Hola " + nombre + "! Tienes " + edad + " años.");
    }
    
    
}