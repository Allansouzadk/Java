import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Para acessar digite sua idade ");
	int x = sc.nextInt();
		if (x >= 18) {
			System.out.println("pode acessar");
			
		}
		else {
			
			System.out.println("nao pode acessar");
		}
		
		sc.close();
	}

}
