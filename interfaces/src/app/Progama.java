package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.Contrato;
import entites.Prestacao;
import services.PaypalPagamento;
import services.ServicoContrato;

public class Progama {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados: ");
		
		try {
			System.out.print("Informe o numero do contrato: ");
			int numero = sc.nextInt();
			System.out.print("Data (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.next());
			System.out.println(" Valor do contrato: ");
			double valorTotal = sc.nextDouble();
			System.out.print("Quantas parcelas: ");
			int parcela = sc.nextInt();
			Contrato c = new Contrato(date, numero, valorTotal);
			ServicoContrato cs = new ServicoContrato(new PaypalPagamento());
			
			cs.progressoContrato(c,parcela);
			System.out.println("Prestações: ");
			for (Prestacao prestacao : c.getList()) {
				System.out.println(prestacao);
			}
		
		} catch (ParseException e) {
			System.out.println("ERROR: "+ e.getMessage());
		}
		
		finally {
			sc.close();
	
			}
	}

}
