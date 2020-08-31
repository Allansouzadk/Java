package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Date date;
	private Integer numeroContrato;
	private Double valorTotal;
	private List<Prestacao> list = new ArrayList<>();
	
	public Contrato(Date date, Integer numeroContrato, Double valorTotal) {
		this.date = date;
		this.numeroContrato = numeroContrato;
		this.valorTotal = valorTotal;
	}


	public Double getValorTotal() {
		return valorTotal;
	}




	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public Integer getNumeroContrato() {
		return numeroContrato;
	}




	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}




	public List<Prestacao> getList() {
		return list;
	}

	public void addPrestacao(Prestacao installment) {
		list.add(installment);
	}

	public void removePrestacao(Prestacao installment) {
		list.remove(installment);
	}
	
	
	

}
