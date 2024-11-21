package quarta.atv;

import java.util.Scanner;

public class CalculaDiferencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferencia;
		
		System.out.println("Digite o valor da Nota 1: ");
		n1 = ler.nextFloat();
		System.out.println("Digite o valor da Nota 2: ");
		n2 = ler.nextFloat();
		
		System.out.println("Digite o valor da Nota 3: ");
		n3 = ler.nextFloat();
		System.out.println("Digite o valor da Nota 4: ");
		n4 = ler.nextFloat();
		
		diferencia = (n1*n2)-(n3*n4);
		
		System.out.println("A diferencia entre as notas (1 e 2) é de: "+diferencia+" em relação as notas (3 e 4)!");

	}

}
