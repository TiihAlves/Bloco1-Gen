package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {

			try {
			System.out.printf("Digite o Dividendo: ");
			dividendo = scanner.nextInt();

			System.out.printf("Digite o Divisor: ");
			divisor = scanner.nextInt();

			dividir(dividendo, divisor);
			} catch(InputMismatchException e) {
				System.err.println("\nERRO: "+e);
				scanner.nextLine();
				System.out.println("\n Digite valores válidos!\n");
			}catch(java.lang.ArithmeticException e) {
				System.err.println("\nERRO: "+e);
				scanner.nextLine();
				System.out.println("\n Divisão Inválida!\n");
			}
			
		} while (loop);

	}

	public static void dividir(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
