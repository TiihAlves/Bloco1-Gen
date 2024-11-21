package estruturadedados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();

		int opcao;
		boolean sair = false;
		

		System.out.println("##### Bem-Vindo! #####");

		while(sair == false) {

			System.out.println("\nMenu: ");
			System.out.println("1- Adicionar Livro na Pilha");
			System.out.println("2- Listar todos os Livros");
			System.out.println("3- Pegar um Livro");
			System.out.println("0- Sair");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.printf("Nome do Livro: ");
				scanner.skip("\\R?");
				pilha.push(scanner.nextLine());
								
				System.out.println("Livro Adicionado ! ");
				break;

			case 2:
				Iterator<String> iterator = pilha.iterator();
				System.out.println("\nPilha de Livros:" );
				
				while (iterator.hasNext()) {

					System.out.println(iterator.next());

				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("Não tem livros na pilha");
					System.out.println("Para cotinuar adicione novos Livros");
				} else {
					
					System.out.println("\nLivro Adquirido: " + pilha.pop());
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
