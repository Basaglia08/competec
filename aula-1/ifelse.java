import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
	    
	    double precoAbacaxi = 8.5;
	    double precoGoiaba = 2.0;
	    double precoLaranja = 1.3;
	    
	    System.out.println("Escreva o codigo do produto:");
	    int produto = leia.nextInt();
	    
	    if (produto == 1) {
	        System.out.println("Preço do abacaxi: "+precoAbacaxi);
	    }
	    
	    else if (produto == 2) {
	        System.out.println("Preço da goiaba: "+precoGoiaba);
	    }
	    
	    else if (produto == 3) {
	        System.out.println("Preço da laranja: "+precoLaranja);
	    }
	    
	    else if (produto > 3) {
	        System.out.println("Não há produto com está numeração :/");
	    }
	}
}
