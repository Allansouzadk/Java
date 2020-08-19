package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class ProdutosUsados extends Produtos {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date date;

	public ProdutosUsados(String nome, Double preco, Date date) {
		super(nome, preco);
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String precoTag() {
		return getNome() 
				+ " (used) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Manufacture date: "
				+ sdf.format(date)
				+ ")";
	}
	
}
