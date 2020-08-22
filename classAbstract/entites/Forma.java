package entites;

public abstract class Forma {
	private Color color;

	public Forma() {
		super();
	}

	public Forma(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract Double  area();
	
}
