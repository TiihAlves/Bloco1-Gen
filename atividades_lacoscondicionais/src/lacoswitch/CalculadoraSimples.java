package lacoswitch;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float v1, v2, res;
		int op;
		
		System.out.println("Digite o valor 1: ");
		v1 = ler.nextFloat();
		System.out.println("Digite o valor 2: ");
		v2 = ler.nextFloat();
		
		System.out.println("Digite o código da operação: ");
		System.out.println("(1) - Soma ");
		System.out.println("(2) - Subtração ");
		System.out.println("(3) - Multiplicação ");
		System.out.println("(4) - Divisão ");
		op= ler.nextInt();
		
		if((op < 1)||(op > 4)) {
			System.out.println("Operação Inválida!");
		}else {
			
			switch (op) {
			
				case 1:
					res = v1+v2;
					System.out.println("O resultado é: "+res);
					break;
				case 2:
					res = v1-v2;
					System.out.println("O resultado é: "+res);
					break;
				case 3:
					res = v1*v2;
					System.out.println("O resultado é: "+res);
					break;
				case 4:
					res = v1/v2;
					System.out.println("O resultado é: "+res);
					break;
			}
			
		}
		
	}

}
