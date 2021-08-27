/******************************************************************************

Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

Criado por Igor Leite em 27/08/2021

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    int idadeEmAnos, idadeEmDias, idadeEmSemanas;
	    
	    int anoAtual = 2021;
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite em que ano você nasceu: ");
	    int anoNasc = entrada.nextInt();
	    
	    idadeEmAnos = anoAtual - anoNasc;
        idadeEmDias = idadeEmAnos * 365;
        idadeEmSemanas = idadeEmAnos * 48;
        
        System.out.println("Você tem "+ idadeEmAnos +" anos, que equivalem a "+ idadeEmDias +" dias, que equivalem a "+ idadeEmSemanas + " semanas.");
	    
	    
	    
	    
		
	}
}
