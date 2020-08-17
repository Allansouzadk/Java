
public class ContaEmpresarial extends Conta{

	private Double limiteDeEmprestimo;

	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String name, Double saldo, Double limiteDeEmprestimo) {
		super(numero, name, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo ;
	}

public void emprestimo(double valor) {
	if (valor <= limiteDeEmprestimo)
		saldo += valor -10.0;
	
}
	
	
}
