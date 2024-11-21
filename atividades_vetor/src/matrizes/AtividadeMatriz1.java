package matrizes;

import java.util.Scanner;

public class AtividadeMatriz1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int matrizValores[][] = new int[3][3];
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		System.out.println("Digite os valores da matriz 3x3: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Linha [" + (i + 1) + "], Coluna [" + (j + 1) + "]: ");
				matrizValores[i][j] = scanner.nextInt();
			}
		}

		System.out.printf("Elementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matrizValores[i][i] + " ");
			somaDiagonalPrincipal += matrizValores[i][i];
		}
		
		System.out.println("");
		
		System.out.printf("Elementos da Diagonal Secundária: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matrizValores[i][2 - i] + " ");
			somaDiagonalSecundaria += matrizValores[i][2 - i];
		}
		
		System.out.println("");
		
		System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
		System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);

		scanner.close();
	}

}
