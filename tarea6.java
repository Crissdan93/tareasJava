package ejercicios_Datos;

import java.util.Scanner;

public class tarea6 {
	
	public int entero1;
	public int entero2;
	public int entero3;	
	
	
	public void mostrarProducto() {
		int resultado = entero1 * entero2 * entero3;
		System.out.println("Bienvenido al generador de producto");
		System.out.println("El producto de los 3 enteros multiplicados es: " + resultado);
	}
	
	public static void main(String[] args) {
		tarea6 producto = new tarea6();
		producto.ingresaNumero();
		producto.mostrarProducto();
	}
	
	public void ingresaNumero() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese entero 1 ");
		entero1 = scanner.nextInt();
		
		System.out.println("Ingrese entero 2 ");
		entero2 = scanner.nextInt();
		
		System.out.println("Ingrese entero 3 ");
		entero3 = scanner.nextInt();
	}
}