package taraJava4;

import java.util.Scanner;

public class tarea7division {
	
	private float numero1;
	private float numero2;
	private float cociente;
	private float sobrante;
	private float resultado;
	
	public void resultadoFinal() {
		cociente = numero1 / numero2;
		sobrante = numero1 % numero2;
		resultado = numero1 / numero2;
	}
	
	public static void main(String[] args) {
		tarea7division datos = new tarea7division();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el numero 1: ");
		datos.numero1 = scanner.nextFloat();

		System.out.print("Ingrese el numero 2: ");
		datos.numero2 = scanner.nextFloat();
		
		datos.resultadoFinal();
		
		System.out.println("En tu división con números " + datos.numero1 + " y "+ datos.numero2 + ", el cociente es " + datos.cociente + ", el sobrante es " + datos.sobrante + " y el resultado es " + datos.resultado);
	}
}