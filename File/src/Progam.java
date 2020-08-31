import java.io.File;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um caminho: ");
		String path = sc.next();
		
		File path1 = new File(path);
		
		System.out.println("GET name: " + path1.getName());
		
		System.out.println("GET parent: " + path1.getParent());
		System.out.println("GET path: " + path1.getPath());

		
		sc.close();
	}

}
