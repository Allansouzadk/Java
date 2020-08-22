package entites;


public class PessoaFisica extends Contribuicao {

	private Double despesaComSaude;
	
	public PessoaFisica(Double despesaComSaude) {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double despesaComSaude) {
		super(nome, rendaAnual);
		this.despesaComSaude = despesaComSaude;
	}

	public Double getDespesaComSaude() {
		return despesaComSaude;
	}

	public void setDespesaComSaude(Double despesaComSaude) {
		this.despesaComSaude = despesaComSaude;
	}

	@Override
	public Double taxa() {
		//double basicTax = (getRendaAnual() < 20000.0) ? getRendaAnual() * 0.15 : getRndaAnual() * 0.25;
		
		double basicTax;
		if (getRendaAnual() < 20000.0) {
			basicTax = getRendaAnual() * 0.15;
		}
		else {
			basicTax = getRendaAnual() * 0.25;
		}
		basicTax -= getDespesaComSaude() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}
}
