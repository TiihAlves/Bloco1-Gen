package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class VetorEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int vetorInteiros[] = new int[5];
		
		// faz o usuario preencher o vetor

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorInteiros[i] = scanner.nextInt();
		}
		
		// retorna os valores preenchidos peço usuario
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1 + "º Número foi: " + vetorInteiros[i]));
		}
		
		//organiza vetor em ordem descrecente
		
		System.out.println("Tamanho do vetor: "+ vetorInteiros.length);
		
		Arrays.sort(vetorInteiros);
		
		//Imprime o vetor na nova ordem
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1 + "º Número foi: " + vetorInteiros[i]));
		}
		
		

		scanner.close();

	}

}
