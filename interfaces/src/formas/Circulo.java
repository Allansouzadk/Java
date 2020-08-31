package formas;


public final class Circulo extends Forma{
	
	private Double raio;

	public Circulo() {
		super();
	}

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	@Override
	
	public Double area() {
		return Math.PI * raio * raio;
	}
	

}