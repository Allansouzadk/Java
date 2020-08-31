import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\tem\\allan.txt");
		f.exists();
		Scanner sc = null;
		try {
			sc = new Scanner(f);
			while(sc.hasNextLine()) {
				
				System.out.println(sc.nextLine());
				
			}
		}
		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		
		}
		finally {
			if (sc != null) {
			sc.close();
			}
		}
	}

}
