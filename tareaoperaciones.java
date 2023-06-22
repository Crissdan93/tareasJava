package taraJava4;

import java.util.Scanner;

public class tareaoperaciones {

    public int resultado1 = (-16 + 32 / 4 * (48 - 7) % 11);
    public int resultado2 = (18 + 2) / (17 - 12);
    public int resultado3 = 17 - 18 / 6 * 3 + 11 % 4;
    public int resultadoFinal = resultado1+resultado2+resultado3; 

    public void operaciones() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Las expresiones son -16 + 32 / 4 * (48 - 7) % 11 (18 + 2) / (17 - 12) 17 - 18 / 6 * 3 + 11 % 4");

        System.out.println("El resultado de la expresión primera'-16 + 32 / 4 * (48 - 7) % 11' es: " + resultado1);

        System.out.println("El resultado de la expresión segunda '(18 + 2) / (17 - 12)' es: " + resultado2);

        System.out.println("El resultado de la expresión tercera '17 - 18 / 6 * 3 + 11 % 4' es: " + resultado3);
        
        System.out.println("Despues de separarlos el resultado es: " + resultadoFinal);
        
    }

    public static void main(String[] args) {
        tareaoperaciones tarea = new tareaoperaciones();
        tarea.operaciones();
    }
}