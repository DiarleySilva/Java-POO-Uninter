package banco;

import java.util.Scanner;

public class Conta {
	
	String nome;
	float deposito, saque, saldo, limite;
	
	Scanner teclado = new Scanner(System.in);
	
	void cadastrar() {
		
		System.out.print("Digite seu nome: ");
		nome = teclado.next();
		
		System.out.print("Digite seu saldo: ");
		saldo = teclado.nextFloat();
		
		System.out.print("Digite seu limite: ");
		limite = teclado.nextFloat();
		
		System.out.print("Cadastrado com sucesso.");
		}
	
	public void depositar(){
		
		deposito = teclado.nextFloat();
		System.out.print("Digite quanto quer depositar: ");
		
		saldo += deposito;
		System.out.println("O dinheiro foi depositado.");
		}
	void sacar(float valor) {
		
		saque = teclado.nextFloat();
		System.out.print("Digite quanto quer sacar: ");
		
		if(saque > valor || valor > limite) {
			System.out.println("Saque não permitido.");
		}
		saldo -= valor;
		System.out.println("O dinheiro foi sacado!");
	}
	void transferir(Conta contaNova, float valor) {
		
		if(saldo > valor || valor > limite) {
			System.out.println("Tranferência não permitida.");
		}
		
		saldo -= valor;
		contaNova.saldo += valor;
		}
	public void info() {
		System.out.println("Nome:" + nome);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		}

	public Conta(String nome, float deposito, float saque, float saldo, float limite) {
		super();
		this.nome = nome;
		this.deposito = deposito;
		this.saque = saque;
		this.saldo = saldo;
		this.limite = limite;
	}

}