import entites.Client;

public class HashCode {

	public static void main(String[] args) {
		Client cl = new entites.Client("allan", "allansouzadk@gmail.com");
		Client cl2 = new Client("allan", "maria@gmail.com");
		
		
		System.out.println(cl.hashCode());
		System.out.println(cl2.hashCode());
		System.out.println(cl.equals(cl2));

		
		
		
		
		
		
	}

}
