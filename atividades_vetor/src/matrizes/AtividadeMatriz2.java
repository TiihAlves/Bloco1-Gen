package matrizes;

import java.util.Scanner;

public class AtividadeMatriz2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double notas[][] = new double[10][4];
		double medias[] = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as notas do " + (i + 1) + "º Participante: ");
			for (int j = 0; j < 4; j++) {
				System.out.printf("Nota do " + (j + 1) + "º Bimestre: ");
				notas[i][j] = scanner.nextDouble();
			}
		}

		for (int i = 0; i < 10; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}

		System.out.println("Médias dos participantes: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d Participante: %.1f%n", (i+1), medias[i]);
		}
		
		scanner.close();
	}

}
