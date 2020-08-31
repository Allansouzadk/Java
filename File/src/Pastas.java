import java.io.File;
import java.util.Scanner;

public class Pastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um caminho: ");
		
		String path1 = sc.next();
		File path = new File(path1);
		
		
		try {
			File[] pastas = path.listFiles(File::isDirectory);
			System.out.println("pastas");
			for (File  pasta : pastas) {
				
				System.out.println(pasta);
				
			}
			
			File[] files = path.listFiles(File:: isFile);
			System.out.println("Files");
			
			for (File file : files) {
				
				System.out.println(file);
				
			}
		
			boolean success = new File(path1 + "\\subdir").mkdir();
			
			System.out.println(success);
			
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: pasta não existe!!! ");
		
		}
		
		finally {
			sc.close();
		}
		
		
		
		sc.close();
		
		
	}

}
