import java.util.Locale;
import java.util.Scanner;

import entites.Tringle;

public class Main {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);

Tringle x , y ;
x = new Tringle();
y = new Tringle();
Scanner sc = new Scanner(System.in);
System.out.println("digite as teres medidas do triangulo X :");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();
System.out.println("digite as teres medidas do triangulo Y :");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();

double areaX = x.area();

double areaY = y.area();

 System.out.printf("valor da area X %.2f%n", areaX );
 System.out.printf("valor da area Y %.2f%n", areaY );



sc.close();

	}

}
