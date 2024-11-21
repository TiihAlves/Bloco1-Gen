package metodos;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		mensagem("Digite um valor: ");
		num1= scanner.nextInt();
		mensagem("Digite outro valor: ");
		num2= scanner.nextInt();
		somarNumero(num1,num2);
		
		scanner.close();
	}

	public static void mensagem(String texto) {

		System.out.printf("Método apenas para impressão\n");
		System.out.printf(texto);

	}

	public static void somarNumero(int a, int b) {
		int resul = a + b;
			System.out.println("A soma é: "+ resul);
	}

}
