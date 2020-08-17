package app;

import java.util.Locale;
import java.util.Scanner;

public class MainProgama {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a cotacao do dolar: ");
		Converter.cotacao = sc.nextDouble();
		System.out.print("Quantos dolar voce quer adquirir? ");
		Converter.dolar = sc.nextDouble();
		Converter.Conversao();
		Converter.iof();
		Converter.valorAserPago();
		System.out.println("Voce tera que pagar: R$" + Converter.valorAserPago);
		
		
		
		
		sc.close();

	}

}
