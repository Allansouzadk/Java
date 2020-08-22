import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Contribuicao;
import entites.Empresas;
import entites.PessoaFisica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		List<Contribuicao> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de taxas para pagamentos: ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i<=n ; i++) {
			System.out.print("Pagador da taxa #"+ i + " Dados: ");
			System.out.print("Pessoa Fisica ou empresa? ");
			char resp = sc.next().charAt(0);
			if (resp == 'i') {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.println("qual renda anual: ");
			Double rendaAnual = sc.nextDouble();
			System.out.println("Despezas com saude: ");
			Double despesaComSaude = sc.nextDouble() ;
			list.add(new PessoaFisica(nome, rendaAnual, despesaComSaude));
			}
			else if(resp == 'c') {
				
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.println("qual renda anual: ");
				Double rendaAnual = sc.nextDouble();
				System.out.println("Numero de Funcionarios: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new Empresas(nome, rendaAnual, numeroDeFuncionarios));
			}
			
		}
		
		System.out.println("a renda atualizadas depois de abatido as taxas: ");
		
		for (Contribuicao cont : list) {
			
			System.out.println(cont.getNome() + ": $ " + String.format("%.2f", cont.taxa()));
			
		}
		System.out.println();
		double sum = 0.0;
		for (Contribuicao cont : list) {
			sum += cont.taxa();
		}
		System.out.println("TOTAL DE TAXAs: $ " + String.format("%.2f", sum));
		
		
		sc.close();
	}

}
