package services;

public class PaypalPagamento implements PagamentoOnline {
	private static final double TAXA = 0.02;
	private static final double JUROS = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		// TODO Auto-generated method stub
		return amount * TAXA;
	}

	@Override
	public double interest(double amount, int mes) {
		// TODO Auto-generated method stub
		return amount * mes * JUROS;
	}
	

}
