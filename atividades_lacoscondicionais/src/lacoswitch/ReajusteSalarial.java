package lacoswitch;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int cod;
		float salario;
		double nsalario;
		
		System.out.println("Entre com seu nome:");
		nome = ler.nextLine();
		
		System.out.println("Insira o Código do seu cargo: ");
		System.out.println("(1) - Gerente");
		System.out.println("(2) - Vendedor");
		System.out.println("(3) - Supervisor");
		System.out.println("(4) - Motorista");
		System.out.println("(5) - Estoquista");
		System.out.println("(6) - Técnico de TI");
		cod = ler.nextInt();
		
		
		if((cod <1)|| (cod >6)) {
			System.out.println("Digite uma opção válida!");
		}else {
			
			System.out.println("Digite o valor do Salário: ");
			salario= ler.nextFloat();
			
		
		switch(cod) {
			case 1:
				nsalario = salario;
				System.out.println("Nome Colaborador: "+ nome);
				nsalario += salario * 0.10;
				System.out.println("Cargo: Gerente");
				System.out.printf("Novo Salário: %.2f" , nsalario);
				break;
			case 2:
				nsalario=salario;
				System.out.println("Nome Colaborador: "+ nome);
				nsalario += salario * 0.07;
				System.out.println("Cargo: Vendedor");
				System.out.printf("Novo Salário: %.2f" , nsalario);
				break;
			case 3:
				nsalario = salario;
				System.out.println("Nome Colaborador: "+ nome);
				nsalario += salario * 0.09;
				System.out.println("Cargo: Supervisor");
				System.out.printf("Novo Salário: %.2f" , nsalario);
				break;
			case 4:
				nsalario = salario;
				System.out.println("Nome Colaborador: "+ nome);
				nsalario += salario * 0.06;
				System.out.println("Cargo: Motorista");
				System.out.printf("Novo Salário: %.2f" ,nsalario);
				break;
			case 5:
				nsalario = salario;
				System.out.println("Nome Colaborador: "+ nome);
				nsalario += salario * 0.05;
				System.out.println("Cargo: Estoquista");
				System.out.printf("Novo Salário: %.2f" ,nsalario);
				break;
			case 6:
				nsalario = salario;
				System.out.println("Nome Colaborador: "+ nome);
				nsalario += salario * 0.08;
				System.out.println("Cargo: Técnico de TI");
				System.out.printf("Novo Salário: %.2f" ,nsalario);
				break;
		}
			
			
		}
		
	}

}
