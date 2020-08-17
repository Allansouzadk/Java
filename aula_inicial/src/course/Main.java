package course;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
Double preco , desconto ;

preco = sc.nextDouble();

desconto = (preco < 20.00)? preco * 0.1 : preco * 0.05 ;

System.out.println("valor do desconto " + desconto);

sc.close();
	}

}
