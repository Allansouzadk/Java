package finanças;

import java.util.Locale;
import java.util.Scanner;


public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Financas financas = new Financas();
		System.out.println("Entre com os dados abaixo: ");
		System.out.println("Nome: ");
		financas.nome = sc.next();
		System.out.println("salario bruto: ");
		financas.salarioBruto = sc.nextDouble();
		System.out.println("Impostos: ");
		financas.imposto = sc.nextDouble();
		financas.salario(financas.salarioBruto);
		System.out.println(financas);
		System.out.println("digite a porcetagem do acrecimo do valo bruto ");
		financas.porcetagem = sc.nextDouble();
		financas.incremento(financas.porcetagem);
		System.out.println(financas);

		sc.close();
	}

}
