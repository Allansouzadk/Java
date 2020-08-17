package entites;

public class Aluguel {

		public String name;
		public String email;
		public int quarto;
		
		public Aluguel(String name, String email, int quarto) {
			this.name = name;
			this.email = email;
			this.quarto = quarto;
		}

		public String toString() {
			return  "quarto: #" 
					+ quarto
					+ " "
					+ "Nome: "
					+ name
					+ " "
					+ "Email: "
					+ email;
		}		

}
