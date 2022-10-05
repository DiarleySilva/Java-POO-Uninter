package cofre.moedas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcao, tipoMoeda;
		
		Cofrinho cofre = new Cofrinho();
		
		Moeda moeda = null;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Converter");
		System.out.println("0 - Sair");
		System.out.print("Escolha um opção: ");
		opcao = teclado.nextInt();
		
		while(opcao!=0) {
			
			switch (opcao) {
			case 1:
				
				tipoMoeda = 0;
				System.out.println("1 - Real");
				System.out.println("2 - Dólar");
				System.out.println("3 - Euro");
				System.out.println("0 - Voltar");
				System.out.print("Qual moeda deseja adicionar: ");
				tipoMoeda = teclado.nextInt();
				
				if(tipoMoeda == 1) {
					System.out.print("Quanto deseja adicionar em reais(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofre.adicionar(moeda);
					System.out.println("Moeda adicionada com sucesso!");
				}
				else if(tipoMoeda == 2) {
					System.out.print("Quanto deseja adicionar em dólares(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Dolar(valor);
					cofre.adicionar(moeda);
					System.out.println("Moeda adicionada com sucesso!");
				}
				else if(tipoMoeda == 3) {
					System.out.print("Quanto deseja adicionar em euros(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Euro(valor);
					cofre.adicionar(moeda);
					System.out.println("Moeda adicionada com sucesso!");
				}
				else if(tipoMoeda == 0) {
					break;
				}
				break;
			
			case 2:
				tipoMoeda = 0;
				System.out.println("1 - Real");
				System.out.println("2 - Dólar");
				System.out.println("3 - Euro");
				System.out.println("0 - Voltar");
				System.out.print("Qual moeda deseja adicionar: ");
				tipoMoeda = teclado.nextInt();
				
				if(tipoMoeda == 1) {
					System.out.print("Quanto deseja remover em reais(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofre.remover(moeda);
					System.out.println("Moeda removida com sucesso!");
				}
				else if(tipoMoeda == 2) {
					System.out.print("Quanto deseja remover em dólares(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofre.remover(moeda);
					System.out.println("Moeda removida com sucesso!");
				}
				else if(tipoMoeda == 3) {
					System.out.print("Quanto deseja remover em euros(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofre.remover(moeda);
					System.out.println("Moeda removida com sucesso!");
				}
			case 3:
				cofre.listagem();
				break;
			}
			
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Listar");
			System.out.println("4 - Converter");
			System.out.println("0 - Sair");
			System.out.print("Escolha um opção: ");
			opcao = teclado.nextInt();
		}
	}
}