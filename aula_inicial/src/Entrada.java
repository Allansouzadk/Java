import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Qual sua idade ? ");
		idade = sc.nextInt();

		System.out.println(idade);
		sc.close();
	}

}
