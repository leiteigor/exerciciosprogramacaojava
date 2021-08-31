/******************************************************************************

2.	Que informe a área e o volume de um cilindro.
 

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Informe a altura do cilindro");
	    double altura = entrada.nextDouble();
	    
	    System.out.println("Informe o raio do cilindro");
	    double raio = entrada.nextDouble();	    
	    
	    double volume;
	    double pi = 3.1;
	    
	    volume = pi * (raio*raio) * altura;
	    
	    System.out.println("O volume do cilindro é: "+ volume);
	    
	}
	
}
