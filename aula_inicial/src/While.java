import java.util.Scanner;

public class While {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int contador = 0;

while (x != 0){
x = sc.nextInt();
contador = contador + x ;
	
}
sc.close();

System.out.println(x);
System.out.println(contador);
	}

}
