package tareasJava3;

import java.util.Scanner;

public class tarea3 {
	
	public static final double constante1 = 1.8;
	public static final double constante2 = 32;
	
	public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		
		//AREA DE UN CIRCULO
		
		
		System.out.println("Ingrese el valor en grados Celcius ");
		double celcius = input.nextFloat();
		
		double farenheit = (celcius * constante1) + constante2;
		
		
		System.out.println("El valor en grados Farenheit es " + farenheit);
		
		
}
}