package metodos;

import java.util.Scanner;

public class Exemplo1 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1,num2,resul;
		System.out.println("Digite um valor para somar");
		num1 = scanner.nextInt();
		System.out.println("Digite outro valor para somar");
		num2 = scanner.nextInt();
		resul = somar(num1,num2);
		System.out.println(resul);
		
		scanner.close();
		
	}

	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}

}
