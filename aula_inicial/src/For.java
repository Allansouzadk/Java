import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int contador = 0;

		for (int i=0; i<N; i++ ) {
         int x = sc.nextInt();
		contador = contador + x ;
			
		}
		sc.close();

		System.out.println(contador);
	}

}
