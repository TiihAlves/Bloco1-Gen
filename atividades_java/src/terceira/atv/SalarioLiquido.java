package terceira.atv;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salarioBruto, horasExtras, adicionalNoturno, descontos, salarioLiquido;
		
		System.out.println("Digite o valor do salário bruto: ");
		salarioBruto = ler.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = ler.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		horasExtras = ler.nextFloat();
		
		System.out.println("Digite o valor total dos descontos: ");
		descontos = ler.nextFloat();
		
		salarioLiquido =(salarioBruto+adicionalNoturno+(horasExtras*5))-descontos;
		
		System.out.println("O seu salário líquido é de: $"+ salarioLiquido);

	}

}
