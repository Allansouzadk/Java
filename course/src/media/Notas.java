package media;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		CalcularMedias cal = new CalcularMedias();
		System.out.println("Nota 1: ");
		cal.nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		cal.nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		cal.nota3 = sc.nextDouble();
		cal.media();
	if (cal.media >= 60) {
		System.out.println("Aprovado");
		
	}
	else {
		
		System.out.printf("Reprovado %n falta: ");
		System.out.println(cal.media - 60);
	}
		
		
		sc.close();
	}

}
