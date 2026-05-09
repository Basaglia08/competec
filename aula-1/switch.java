import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
	    
	    System.out.println("Código:");
	    int code = leia.nextInt();
	    
	    switch(code) {
	        case 1:
	        System.out.println("Abacaxi");
	        break;
	        
	        case 2:
	        System.out.println("Goiaba");
	        break;
	        
	        case 3:
	        System.out.println("Laranja");
	        break;
	        
	        default:
	        System.out.println("Código invalido");
	    }
	}
}
