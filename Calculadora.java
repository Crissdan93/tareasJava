package tareaDia14;

import java.util.Scanner;

public class Calculadora 
{
	
	
	public int entero1;
	public int entero2;
	

	public float multiplicación(float numerom1, float numerom2) {
	    float resultadoMulti = numerom1 * numerom2;
	    return resultadoMulti;
	}
    
    public float division(float numerod1, float numerod2) 
    
    
    {
	 
	   float resultadodivision = (numerod1 / numerod2);
	   return resultadodivision;
	 
    }
	
    public float suma(float numeros1, float numeros2) 
    
    
    {
	 
	   float resultadosuma = (numeros1 + numeros2);
	   return  resultadosuma;
	 
    }

    public float resta (float numeror1, float numeror2) 
    
    
    {
	 
	   float resultadoresta = (numeror1 - numeror2);
	   return resultadoresta;
	   
    }
 
    public void ingresaNumero() 
    {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Ingrese entero 1 ");
		entero1 = scanner.nextInt();
		
		System.out.println("Ingrese entero 2 ");
		entero2 = scanner.nextInt();
		
    }
	 
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        Calculadora calculadoraFunval = new Calculadora();

        do {
            opcionesCalculadora();
            opcion = scanner.nextInt();

            switch (opcion) 
            {
                case 1:
                	calculadoraFunval.ingresaNumero();
                    float resultadoMulti = calculadoraFunval.multiplicación(calculadoraFunval.entero1, calculadoraFunval.entero2);
                    System.out.println("El resultado de la multiplicación " + resultadoMulti);
                    break;
                case 2:
                	calculadoraFunval.ingresaNumero();
                    float resultadodivision = calculadoraFunval.division(calculadoraFunval.entero1, calculadoraFunval.entero2);
                    System.out.println("El resultado de la división " + resultadodivision);
                    break;
                case 3:
                	calculadoraFunval.ingresaNumero();
                    float resultadosuma = calculadoraFunval.suma(calculadoraFunval.entero1, calculadoraFunval.entero2);
                    System.out.println("El resultado de la suma " + resultadosuma);
                    break;
                case 4:
                	calculadoraFunval.ingresaNumero();
                    float resultadoresta = calculadoraFunval.resta(calculadoraFunval.entero1, calculadoraFunval.entero2);
                    System.out.println("El resultado de la resta " + resultadoresta);
                    break;
			              
			            }
			        } while (opcion != 0);

			        scanner.close();
			    }

			    public static void opcionesCalculadora() {
			        System.out.println("Seleccione una opción:");
			        System.out.println("1. Multiplicación 1");
			        System.out.println("2. Division 2");
			        System.out.println("3. Suma 3");
			        System.out.println("4. Resta 4");
			       
			    }
			}

