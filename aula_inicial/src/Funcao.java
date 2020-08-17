import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a, b, c ;
		System.out.println("Digite tres numeros para saber o maior entre eles!!!");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int heier = max(a, b, c);	
		show(heier);
		
		sc.close();
	}
	public static int max(int x,int y, int z) {
		int aux ;
		if (x > y && x > z) {
			aux = x;
		
		}
		else if(y > z) {
			
			aux = y;	
		}
		else {

			aux = z;	
		}
		
		return aux;
		
	}
	
	public static void show(int value) {
		
		System.out.println("maior = " + value);
	}


	}
