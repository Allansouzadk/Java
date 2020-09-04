import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entites.User;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com caminho do arquivo:");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
		Set<User> set = new HashSet<>();
			String line = br.readLine();
			while(line != null) {
				
				String[] fild = line.split(" ");
				String username = fild[0];
				Date date = Date.from(Instant.parse(fild[1]));
				set.add(new User(username, date));
				line = br.readLine();
			}
			
			System.out.println("Total de users: "+ set.size());
			
		}
		
		catch (IOException e) {

			System.out.println("ERROR: " + e.getMessage());
		
		}
		
		sc.close();
	}

}
