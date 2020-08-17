
import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Qual dia ? ");
int x = sc.nextInt();
String dia;
switch (x) {
case 1: {
	dia = "domingo";
			break;
}
case 2:{
	dia = "segunda";
			break;
}
default:
dia = "invalido";
break;

}
System.out.println(dia);

sc.close();

}
}