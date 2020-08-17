import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Contratos;
import entites.Departamentos;
import entites.Nivel;
import entites.Trabalhador;

public class Progama {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Qual seu departamento?");
		String departamento = sc.next();
		System.out.println("Qual seu nome: ");
		String name = sc.next();
		System.out.println("Qual seu Salario Base:");
		Double baseSalario = sc.nextDouble();
		System.out.println("Qual seu Nivel: ");
		String level = sc.next();
		Trabalhador trabalhador = new Trabalhador(Nivel.valueOf(level), name, baseSalario, new Departamentos(departamento));
		System.out.println("Quantos contratos ele vai ter ?");
		int n = sc.nextInt();
		
		for (int i = 1 ; i < n + 1 ; i++) {
			System.out.println("Contrato N #"+ i + ": ");
			System.out.println("Qual a data do contrato (dd/mm/yyy)? ");
			Date date = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			Double valor = sc.nextDouble();
			System.out.println("Quantas horas maxima no contrato ");
			int horas = sc.nextInt();
			Contratos contratos = new Contratos(date, valor, horas);
			trabalhador.addContratos(contratos);
			
		}

		System.out.println();
		System.out.println("Entre com mm/yyyy :");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0,2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Name:" + trabalhador.getName());
		System.out.println("Departamento:"+ trabalhador.getDepartamento().getNome());
		System.out.println("Renda de "+ mesEano + ":" + trabalhador.renda(ano, mes));
		


		


		
		
		
		
		
		sc.close();	
	}

}
