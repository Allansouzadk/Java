package retangulo;

public class Caucular {
	public double altura;
	public double largura;
	
	
	public double perimetro() {
		return altura + altura + largura + largura;
		
	}
	public double area() {
		return altura * largura ;
	}
		
	public double diagonal(){
		return Math.pow(largura, 2) + Math.pow(altura, 2);
			
		}
		
	
	

}
