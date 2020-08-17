package entites;

public class OrderItem {
	private Integer quantidade;
	private Double preco;
	private Produto product;

public OrderItem() {
	    
  }

public OrderItem(Integer quantidade, Double preco, Produto product) {
	this.quantidade = quantidade;
	this.preco = preco;
	this.product = product;
}

public Integer getQuantidade() {
	return quantidade;
}

public void setQuantidade(Integer quantidade) {
	this.quantidade = quantidade;
}

public Double getPreco() {
	return preco;
}

public void setPreco(Double preco) {
	this.preco = preco;
}

public Produto getProduct() {
	return product;
}

public void setProduct(Produto product) {
	this.product = product;
}
public Double subTotal() {
	
	return preco * quantidade ;
	
}
  	@Override
  	public String toString() {
  		return product.getName() +
			", $" +
  				String.format("%.2f",preco) +
  				", Quantidae:" +
  				quantidade +
  				", Subtotal: $" +
  				String.format("%.2f", subTotal());
  				
  }
  
  }

