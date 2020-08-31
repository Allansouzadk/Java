package services;

public interface PagamentoOnline {
	
	double paymentFee(double amount);
	double interest(double amount, int months);

}
