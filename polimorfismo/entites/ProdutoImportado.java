package entites;

public final class ProdutoImportado extends Produtos{
private  Double taxa;

public ProdutoImportado(String nome, Double preco, Double taxa) {
	super(nome, preco);
	this.taxa = taxa;
}

public Double getTaxa() {
	return taxa;
}

public void setTaxa(Double taxa) {
	this.taxa = taxa;
}

public Double totalPreco() {
	return getPreco() + taxa;
}

@Override
public String precoTag() {
	return getNome() 
			+ " $ " 
			+ String.format("%.2f", totalPreco())
			+ " (Customs fee: $ " 
			+ String.format("%.2f", taxa)
			+ ")";
}

}
