package vetores;

import java.util.Scanner;

public class AtividadeVetor1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int valor;
		int valores[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int posicao = -1;

		System.out.println("Digite o valor que deseja encontrar: ");
		valor = scanner.nextInt();

		for (int i = 0; i < valores.length; i++) {
			if (valor == valores[i]) {
				posicao = i;
				break;
			}
		}

		if (posicao != -1) {
			System.out.println("O número " + valor + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + valor + " não foi encontrado!");
		}
		
		scanner.close();
	}
}
