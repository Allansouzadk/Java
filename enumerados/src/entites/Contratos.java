package entites;

import java.util.Date;

public class Contratos {
private Date date;
private Double valorDaHoras;
private Integer horas;

public Contratos() {
}

public Contratos(Date date, Double valorDaHoras, Integer horas) {
	this.date = date;
	this.valorDaHoras = valorDaHoras;
	this.horas = horas;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Double getValorDaHoras() {
	return valorDaHoras;
}

public void setValorDaHoras(Double valorDaHoras) {
	this.valorDaHoras = valorDaHoras;
}

public Integer getHoras() {
	return horas;
}

public void setHoras(Integer horas) {
	this.horas = horas;
}

	public Double valorTotalEmHoras() {
		return horas * valorDaHoras;
	}


}
