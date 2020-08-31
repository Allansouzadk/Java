
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import formas.Circulo;
import formas.Color;
import formas.Forma;
import formas.Retangulo;



public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o numero de formas: ");
		Integer n = sc.nextInt();
		List<Forma> list = new ArrayList<>();
		
		for (int i = 1 ; i <= n; i++) {
			
			System.out.println(" Forma#"+ i + " dados: ");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print(" Qual a cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (resp == 'r') {
				System.out.print("Entre coma largura: ");
				Double largura = sc.nextDouble();
				System.out.print("Entre coma altura: ");
				Double altura = sc.nextDouble();
				list.add(new Retangulo(color, largura, altura));
		}
			else if (resp == 'c') {
				System.out.println("Entre com o raio do circulo: ");
				Double raio = sc.nextDouble();
				list.add(new Circulo(color, raio));
			}
		}
		
		System.out.println();
		System.out.println("Areas: ");
		for (Forma forma : list) {
			
			System.out.println(String.format("%.2f",forma.area()));
			
		}
		
		sc.close();
	}

	}