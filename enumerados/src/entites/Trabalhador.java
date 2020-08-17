package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	private Nivel level;
	private String name;
	private Double baseSalario;
	private Departamentos departamento;
	
	private List<Contratos> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(Nivel level, String name, Double baseSalario, Departamentos departamento) {
		this.level = level;
		this.name = name;
		this.baseSalario = baseSalario;
		this.departamento = departamento;

	}

	public Nivel getLevel() {
		return level;
	}

	public void setLevel(Nivel level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	public List<Contratos> getContratos() {
		return contratos;
	}

	public void addContratos(Contratos contrato) {
	
		contratos.add(contrato);
	}
	public void removeContratos(Contratos contrato) {
		
		contratos.remove(contrato);
	}
	public Double renda(int ano , int mes) {
		double soma = baseSalario;
		Calendar cal = Calendar.getInstance();
		for (Contratos c : contratos) {
			cal.setTime(c.getDate());

			int yer = cal.get(Calendar.YEAR);
			int mês = 1 + cal.get(Calendar.MONTH);
			
			if(ano == yer && mês == mes) {
				soma += c.valorTotalEmHoras();
			}
		}
		return soma;
	}
}
