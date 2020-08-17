package app;

import java.util.Locale;
import java.util.Scanner;

import entites.Produto;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("entre com o produto no estoque: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.println("preco: ");
		double preco = sc.nextDouble();
		System.out.print("quantidade no estoque: ");
		int quantidade = sc.nextInt();
		System.out.println();
		Produto produto = new Produto(nome, quantidade, preco);
		System.out.println("produtos no estoque: " + produto);
		System.out.println();
		System.out.println("entre com numero que entrou no estoque ");
		quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.println("atualizado estoque : " + produto);
		System.out.println();
		
		System.out.println("entre com numero que saiu no estoque ");

		quantidade = sc.nextInt();
		
		produto.removeProdutos(quantidade);
		System.out.println();
		System.out.println("atualizado estoque : " + produto);
		
sc.close();
	}

}
