import java.util.Locale;
import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os nomes para comparar se sao iguais!!");
		System.out.print("entre com primeiro nome:");
		String nome1 = sc.next();
		System.out.print("entre com segundo nome nome:");
		String nome2 = sc.next();
		
		if (nome1.equals(nome2)) {
			
			System.out.println("Os nomes sao iguais");
			
		}
		else {
			System.out.println("Os nomes nao sao iguais");
		}
		
		sc.close();
		
	}

}
