package finanças;

public class Financas {
	public double salarioBruto;
	public double imposto;
	public String nome;
	public double porcetagem;
	
	
	public void salario(double salarioBruto) {
		this.salarioBruto = salarioBruto - imposto;
	}
		
		public String toString() {
			return nome +
					" $" +
					salarioBruto;
					
		}
		public void incremento(double porcetagem) {
			
			this.salarioBruto += (salarioBruto * porcetagem) / 100 ;
			
		}

	}


