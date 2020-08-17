import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Quantos minutos usados? ");

int minutos = sc.nextInt();

Double  conta = 50.00;

if (minutos > 100) {
	conta = conta + (minutos - 100) * 2.0;
}

	System.out.printf("valor a pagar e de = R$%.2f%n" , conta );
	
	
sc.close();		
		
		
	}

}
