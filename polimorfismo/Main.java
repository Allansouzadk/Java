import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ProdutoImportado;
import entites.Produtos;
import entites.ProdutosUsados;


public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Entre com numero de produtos: ");
		Integer n = sc.nextInt();
		
		List<Produtos> list = new ArrayList<>();
		
		for (int i = 0 ; i < n ; i++) {
			
			System.out.println("Diga a categoria do produto (c = comun , i = importado, u = usado): ");
			
			char resp = sc.next().charAt(0);
			
			if (resp == 'c') {
				System.out.println("Entre com nome do produto: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Entre com preço do produto: ");
				Double preco = sc.nextDouble();
				list.add(new Produtos(name, preco));
				
			}
			else if (resp == 'u') {
				System.out.print("Entre com nome do produto: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Entre com preço do produto: ");
				Double preco = sc.nextDouble();
				System.out.print("Entre com a data de fabricacao; ");
				Date date = sdf.parse(sc.next());
				list.add(new ProdutosUsados(name, preco, date));
				
			}
			else if(resp == 'i') {
				System.out.println("Entre com nome do produto: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Entre com preço do produto: ");
				Double preco = sc.nextDouble();
				System.out.print("Entre com valor da taxa : ");
				Double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(name, preco, taxa));
				
			}
			
				
			}
			
			
		for (Produtos prod : list) {
			
			System.out.println(prod.precoTag());
			
		}
		
		
		
		sc.close();
	}

}
