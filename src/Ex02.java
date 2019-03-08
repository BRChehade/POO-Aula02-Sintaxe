import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Ler = new Scanner(System.in);
	
	int n1, n2;
	System.out.println("Entre com o primeiro inteiro: ");
    n1 = Ler.nextInt();
    System.out.println("Entre com o segundo inteiro: ");
    n2 = Ler.nextInt();
				
    if(n1 < n2) {
    	System.out.println("O primeiro valor e menor: " +n1);
    }else { 
    	if (n1 == n2){
    		System.out.println("Ambos tem o mesmo valor" );
	    }else {
	    	System.out.println("O segundo valor e menor: " +n2);
    }
	}
	}
}