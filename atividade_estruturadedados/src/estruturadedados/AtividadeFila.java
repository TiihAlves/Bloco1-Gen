package estruturadedados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		LinkedList<String> fila = new LinkedList<String>();

		int opcao;
		boolean sair = false;
		

		System.out.println("##### Bem-Vindo! #####");

		while(sair == false) {

			System.out.println("\nMenu: ");
			System.out.println("1- Adicionar cliente na Fila");
			System.out.println("2- Listar todos clientes");
			System.out.println("3- Atender cliente da Fila");
			System.out.println("0- Sair");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.printf("Nome do Cliente: ");
				fila.add(scanner.next());
				System.out.println("Cliente Adicionado!");
				break;

			case 2:
				Iterator<String> iterator = fila.iterator();
				System.out.println("\nFila de Clientes");
				while (iterator.hasNext()) {

					System.out.println(iterator.next());

				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
					System.out.println("Para cotinuar adicione novos clientes a fila");
				} else {
					
					System.out.println("\nPróximo Cliente: " + fila.remove());
				}
				break;

			case 0:
				sair = true;
				break;

			default:
				System.out.println("Opção Inválida! ");

			}
			if(sair == true) {
				System.out.println("Até a Próxima!");
			}
			
		} 
		scanner.close();
	}

}
