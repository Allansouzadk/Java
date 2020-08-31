package formas;

public abstract class Forma implements FormaServices {
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
}