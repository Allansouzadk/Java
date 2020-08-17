
public class App {

	public static void main(String[] args) {
		Conta acc = new Conta(157, "allan", 100.0);
		ContaEmpresarial acce = new ContaEmpresarial(1234, "maria", 100.0,500.0);
		// UPCASTING
		Conta acc1 = acce;
		Conta acc2 = new ContaEmpresarial(12345, "BOB", 1000.0,500.0);
		Conta acc3 =new Poupança(147852, "ALEX", 0.0, 500.0);
		//DOWNCASTING 
		
		ContaEmpresarial acc4 = (ContaEmpresarial)acc2;
		acc4.emprestimo(100.0);

		//ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
		
		if (acc3 instanceof ContaEmpresarial) {
			
			ContaEmpresarial acc5 =(ContaEmpresarial) acc3;
			acc5.emprestimo(200.0);
			System.out.println("emprestimo");
			
		}
		if (acc3 instanceof Poupança ) {
			Poupança acc5 = (Poupança) acc3;
			acc5.updateSaldo();
			System.out.println("update");
			
		}		
				
	}

}
