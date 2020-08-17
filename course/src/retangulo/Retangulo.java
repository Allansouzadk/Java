package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Caucular caucular = new Caucular();
		System.out.println("Entre com altura e largura do retangulo: ");
		System.out.println("Altura: ");
		caucular.altura = sc.nextDouble();
		System.out.println("Largura: ");
		caucular.largura = sc.nextDouble();
		System.out.println("O perimetro e : " + caucular.perimetro());
		System.out.println("A area e :" + caucular.area());
		System.out.println("a diagonal e : " + caucular.diagonal());
		
		sc.close();
	}

}
