import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Ler = new Scanner(System.in);
	
	int n1;
	System.out.println("Entre com um numero ");
    n1 = Ler.nextInt();
				
	switch (n1) {
		
	case 1:
		System.out.println("Mes Janeiro :D");
		break;
		
	case 2:
		System.out.println("Mes Fevereiro :D");
		break;
		
	case 3:
		System.out.println("Mes Marco :D");
		break;
		
	case 4:
		System.out.println("Mes Abil :D");
		break;
		
	case 5:
		System.out.println("Mes Maio :D");
		break;
		
	case 6:
		System.out.println("Mes Junho :D");
		break;
		
	case 7:
		System.out.println("Mes julio :D");
		break;
		
	case 8:
		System.out.println("Mes Agosto :D");
		break;
		
	case 9:
		System.out.println("Mes Setembro :D");
		break;
		
	case 10:
		System.out.println("Mes Outubro :D");
		break;
		
	case 11:
		System.out.println("Mes Novembro :D");
		break;
		
	case 12:
		System.out.println("Mes Dezembro :D");
		break;
		
	default:
		System.out.println("Valor inserido incorreto");
		break;
		
	}
	}
}