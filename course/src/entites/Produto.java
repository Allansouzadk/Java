package entites;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double totalValor() {
		return preco * quantidade;
	}
	public void addProdutos(int quantidade) {
		
		this.quantidade += quantidade;
	}
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return   nome 
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidade, Total: $"
				+ String.format("%.2f", totalValor());
		
				
		
	}
}
