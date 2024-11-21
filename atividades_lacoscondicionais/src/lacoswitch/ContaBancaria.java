package lacoswitch;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float saldo = 1000, valor;
		int op;
		
		System.out.println("Bem - Vindo!");
		System.out.println("Escolha uma operação");
		System.out.println("(1) - Saldo");
		System.out.println("(2) - Saque");
		System.out.println("(3) - Despósito");
		op = ler.nextInt();
		
		switch(op) {
		
			case 1:
				System.out.printf("Saldo Atual: %.2f" , saldo);
				break;
			case 2:
				System.out.printf("Digite o valor a ser sacado");
				valor = ler.nextFloat();
				
					if(valor > saldo) {
						System.out.printf("Saldo Insuficiente");
					}else {
						saldo = saldo - valor;
						System.out.println("Saque realizado");
						System.out.printf("Operação Saque, Valor atual: %.2f",saldo);
					}
				break;
			case 3:
				System.out.printf("Digite o valor a ser depositado");
				valor = ler.nextFloat();
				
				saldo = saldo + valor;
				System.out.println("Depósito realiazado");
				System.out.printf("Operação Depósito, Valor atual: %.2f",saldo);
				break;
				
			default:
				System.out.println("Operação Inválida!");
		
		}
		
		
	}

}
