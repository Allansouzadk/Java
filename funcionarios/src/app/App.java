package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Employ;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employ> list = new ArrayList<>();
		System.out.println("Quantos funcionarios deseja cadastrar?");
		int n = sc.nextInt();
		for (int i=0; i<n;i++) {
			System.out.print("Funcionario #" + (i+1) + ":");
			System.out.println();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("salario: ");
			Double salario = sc.nextDouble();
			Employ emp = new Employ(id, name, salario);
			
			list.add(emp);
			
		}
		System.out.println("digite o id do funcionario para o incremeto: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null)
			System.out.println("id invalido");
		
		else {
			System.out.println("Digite a porcemtagem para o incremento: ");
			double percente = sc.nextDouble();
			list.get(pos).incrementoSalario(percente);
		}
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for (Employ emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}
	
	public static Integer position(List<Employ> list , int id) {
		for(int i=0; i <list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
