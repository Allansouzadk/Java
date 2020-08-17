
public class Poupança extends Conta{
	
	private Double renda;

	public Poupança() {
		super();
	}

	public Poupança(Integer numero, String name, Double saldo, Double renda) {
		super(numero, name, saldo);
		this.renda = renda;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
		
	}
	
	public void updateSaldo() {
		
		saldo += saldo * renda;
		
	}
	
	
	}
