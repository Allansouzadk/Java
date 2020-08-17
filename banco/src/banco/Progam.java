package banco;

import java.util.Locale;
import java.util.Scanner;

import entites.Conta;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    Conta conta = new Conta();
	    System.out.print("Qual numero da conta: ");
	    conta.numeroDaConta = sc.nextInt();
	    System.out.print("Digite o nome do titular da conta: ");
	    conta.nome = sc.next();
	    System.out.print("Digite o Sobrenome: ");
	    conta.sobreNome = sc.next();
	    System.out.print("Quer fazer um deposito inicial (s/n)? ");
	    conta.alternativa = sc.next();
	    
		if  (conta.alternativa.equals("s")) {
	    	System.out.print("digite o deposito inicial: ");
	    	double valor = sc.nextDouble();
	    	conta.setSaldo(valor);
	    } 
	    else {
	    	conta.setSaldo(00.00);
	    }
	    
	    System.out.println(conta);
	    System.out.print("Quer fazer um saque (s/n)? ");
	    conta.alternativa = sc.next();
		
	    if  (conta.alternativa.equals("s")) {
	    	System.out.print("digite o valor a sacar: ");
	    	double valor = sc.nextDouble();
	    	conta.saque(valor);
	    } 
	    else {
	    	conta.saque(0);
	    }
	    
	    System.out.println("conta atulizada: " + conta);
	    
	    System.out.print("Quer fazer um deposito (s/n)? ");
	    conta.alternativa = sc.next();
		
	    if  (conta.alternativa.equals("s")) {
	    	System.out.print("digite o valor a ser depositado: ");
	    	double valor = sc.nextDouble();
	    	conta.addDeposito(valor);
	    } 
	    else {
	    	conta.saque(0);
	    }
	    
	    System.out.println("conta atulizada: " + conta);
 
	    
	    
		sc.close();
	}
	
	}
