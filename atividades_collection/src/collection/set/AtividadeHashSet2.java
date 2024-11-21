package collection.set;

import java.util.HashSet;
import java.util.Scanner;

public class AtividadeHashSet2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashSet<Integer> valores = new HashSet<Integer>();

		Integer valor = Integer.valueOf(0);

		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		System.out.printf("Número: ");
		valor = scanner.nextInt();

		if (valores.contains(valor)) {
			System.out.println("O Número " + valor + " Encontrado!");
		} else {
			System.out.println("O Número " + valor + " não foi encontrado!");
		}

		scanner.close();
	}

}
