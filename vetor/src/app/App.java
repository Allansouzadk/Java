package app;

import java.util.Locale;
import java.util.Scanner;

import entites.Aluguel;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos estudantes vao alugar um quarto? ");
		int quartos = 10;
		int estudantes = sc.nextInt();
		Aluguel[] aluguel = new Aluguel[quartos];
		for(int i=1;  i < estudantes + 1; i++ ) {
			String name, email;
			int quarto;
			System.out.println("Digite seu nome: ");
			name = sc.next();
			System.out.println("Digite seu email: ");
			email = sc.next();
			System.out.println("Digite o numero do seu quarto (de 1 a 9): ");

			quarto = sc.nextInt();
			aluguel[i] = new Aluguel( name, email, quarto);

		}
		
		for (int i = 0; i < estudantes + 1; i++) {
			System.out.println(aluguel);
		}
		


		sc.close();
	}

}
