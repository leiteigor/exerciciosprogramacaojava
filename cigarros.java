/******************************************************************************

1.	Calcular a quantidade dinheiro gasta por um fumante.

Dados: o número de anos que ele fuma,
o nº de cigarros fumados por dia e
o preço de uma carteira com 20 cigarros. 

Feito por Igor Leite 
Data 31/08/21


*******************************************************************************/
import java.util.Scanner;

public class Main
{
    
    
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Há quantos anos você fuma?");
		    double anosFumando = entrada.nextDouble();
		
		System.out.println("Quantos cigarros você fuma por dia");
		    double cigarrosPorDia = entrada.nextDouble();
		
		double precoCigarro = 7.49;
		double valorGasto;
		
		double tempoFumando = anosFumando * 365;
		double totalCigarro = cigarrosPorDia * 365;
	
		valorGasto = precoCigarro * totalCigarro;
		
		System.out.println("Você está fumando há "+ tempoFumando +" dias, e já fumou "+ totalCigarro + " cigarros durante esse tempo.");
		System.out.println("E já gastou R$"+ valorGasto);

	}
}






