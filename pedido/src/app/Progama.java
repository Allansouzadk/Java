package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Clients;
import entites.Order;
import entites.OrderItem;
import entites.OrderStatus;
import entites.Produto;


public class Progama {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Clients client = new Clients(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Produto product = new Produto(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addInten(it);			
		}
		
		System.out.println();
		System.out.println(order);

		
		sc.close();
	}

}
