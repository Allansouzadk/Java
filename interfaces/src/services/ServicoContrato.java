package services;

import java.util.Calendar;
import java.util.Date;

import entites.Contrato;
import entites.Prestacao;

public class ServicoContrato {
	
	private PagamentoOnline pagamento;

	public ServicoContrato(PagamentoOnline pagamento) {
		this.pagamento = pagamento;
	}
	

	public void progressoContrato(Contrato contrato, int mes) {
		Double ValorBasico = contrato.getValorTotal() / mes;
		
		for (int i = 1 ; i <= mes; i++) {
            Date date = addMes(contrato.getDate(), i);
			Double valorAtualizado = ValorBasico  + pagamento.interest(ValorBasico, i);
			Double fullValor = valorAtualizado + pagamento.paymentFee(valorAtualizado);
            contrato.addPrestacao(new Prestacao(date, fullValor));	
			
		}
		
	}
	
	private Date addMes(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}	
	
	

}
