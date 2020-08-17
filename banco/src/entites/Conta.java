package entites;


public class Conta {
	public String nome, sobreNome;
	private double saldo;
	public int numeroDaConta;
	public String alternativa;

	public Conta() {
		
	}
	
	public Conta(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saque(double saldo) {
	
		this.saldo -= saldo;
	}
	public void addDeposito(double saldo) {
		this.saldo += saldo;
	}
	
	public String toString() {
		return  "Conta:" 
				+ numeroDaConta
				+ " "
				+ "Titular:"
				+ nome
				+ " "
				+ sobreNome
				+ " , Saldo:R$"
				+ String.format("%.2f",saldo);
	}
}
   
	
	
	
