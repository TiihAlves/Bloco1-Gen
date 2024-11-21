package primeira.atv;

import java.util.Scanner;

public class Abono {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, newsalario;
		
		System.out.println("Digite o Valor do salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o Valor do Abono: ");
		abono = ler.nextFloat();
		
		newsalario = salario + abono;
		
		System.out.println("O seu novo salário é: "+ newsalario);

	}

}
