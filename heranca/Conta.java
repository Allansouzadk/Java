
public class Conta {
	private Integer numero;
	private String name;
	protected Double saldo;
	
	public Conta() {
	}

	public Conta(Integer numero, String name, Double saldo) {
		this.numero = numero;
		this.name = name;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(Double valor) {
		saldo -= valor;
	}
	
	public void deposito(Double valor) {
		saldo += valor;
	}
	
}
