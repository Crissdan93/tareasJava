package tareasJava;

import java.util.Scanner;

public class tarea1 {
	public static void main(String[] arg) {
	
		Scanner input = new Scanner(System.in);
		
		//AREA DE RECTANGULO
		
		System.out.println("Ingrese el largo del rectangulo ");
		int valorLargo = input.nextInt();
		
		System.out.println("Ingresar el ancho del rectangulo ");
		int valorAncho = input.nextInt();
		
		int area= valorLargo * valorAncho;
		
		
		System.out.println("El area del rectangulo es " + area);
		
		
		//AREA DE RECTANGULO
	}

}