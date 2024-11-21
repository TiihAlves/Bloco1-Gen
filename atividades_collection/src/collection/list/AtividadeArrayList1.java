package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeArrayList1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite 5 cores: ");
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf(i+ "º Cor: ");
			cores.add(scanner.next());
		}
		
		System.out.println("");
		
		System.out.println("Lista de Cores");
		System.out.println(cores);
		
		System.out.println("");
		
		System.out.println("Lista de Cores Ordenadas");
		cores.sort(null);
		System.out.println(cores);

		scanner.close();
	}

}
