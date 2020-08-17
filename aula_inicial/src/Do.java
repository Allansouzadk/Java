import java.util.Scanner;

public class Do {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Double C, F;
char resp;

do {
	System.out.println("Digite a temperatura em celsios");
	C = sc.nextDouble();
	F = 9.0 * C / 5.0 + 32.0 ;
	System.out.printf("A temperatura equivalente em Farehaite e %.2f%n", F);
	System.out.println("Deseja repetir (s/n)?  ");
	resp = sc.next().charAt(0);
	
	
}while(resp != 'n');


System.out.println("Fim do progama!!");


sc.close();

	}

}
