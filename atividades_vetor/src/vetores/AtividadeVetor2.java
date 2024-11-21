package vetores;

import java.util.Scanner;

public class AtividadeVetor2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int valores[] = new int[10];

		System.out.println("Digite 10 números inteiros:");

		for (int i = 0; i < 10; i++) {
			System.out.printf((i + 1) + "º Número: ");
			valores[i] = scanner.nextInt();
		}

		System.out.println("Elementos nos indices ímpares: ");
		for (int i = 1; i < valores.length; i += 2) {
			System.out.printf(valores[i]+ " ");
		}
		System.out.println("");

		System.out.println("Elementos que são números pares: ");
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 == 0) {
				System.out.printf(valores[i]+" ");
			}
		}
		System.out.println("");

		int soma = 0;

		for (int numero : valores) {
			soma += numero;
		}
		
		double media = soma / 10.0;
		
		System.out.println("A soma dos valores é: "+soma);
		System.out.printf("A média dos valores é: %.2f", media);
		
		scanner.close();
	}

}
