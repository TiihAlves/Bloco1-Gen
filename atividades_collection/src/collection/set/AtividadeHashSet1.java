package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AtividadeHashSet1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashSet<Integer> valores = new HashSet<Integer>();

		System.out.println("Digite 10 valores não repetidos: ");

		for (int i = 1; i <= 10; i++) {
			System.out.printf(i +"º valor: ");
			valores.add(scanner.nextInt());
		}
		
		System.out.println("");
		
		Iterator<Integer> valor = valores.iterator();
		
		while(valor.hasNext()) {
			System.out.println(valor.next());
		}

		scanner.close();
	}

}
