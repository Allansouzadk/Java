package entites;

public class Employ {
	private Integer id;
	private String name;
	private Double salario;
	
	public Employ(Integer id, String name, Double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void incrementoSalario(double percent) {
		salario += salario * percent / 100.0;
}
	public String toString() {
		return  "ID: #" 
				+ id
				+ " "
				+ "Nome: "
				+ name
				+ " "
				+ "Salario: "
				+ salario;
	}		

	

}
