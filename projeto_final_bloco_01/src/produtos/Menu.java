package produtos;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import produtos.controller.ProdutoController;
import produtos.model.ProdutosAcessorios;

public class Menu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ProdutoController produto = new ProdutoController();

		int opcao, quantidade, codigo, conector;
		float valor;
		String nome, tipoConector;

		System.out.println("Cadastro de produtos\n");
		ProdutosAcessorios pa1 = new ProdutosAcessorios("Carregador", 20.0f, 5, produto.gerarCodigo(), "Tipo C");
		produto.cadastrar(pa1);

		ProdutosAcessorios pa2 = new ProdutosAcessorios("Carregador Portatil", 60.0f, 10, produto.gerarCodigo(),
				"Tipo C");
		produto.cadastrar(pa2);

		ProdutosAcessorios pa3 = new ProdutosAcessorios("Fone de ouvido", 40.0f, 20, produto.gerarCodigo(), "PS2");
		produto.cadastrar(pa3);

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                    TK ELETRONICS                    ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            6 - Vender Produtos                      ");
			System.out.println("            7 - sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite apenas Números");
				scanner.nextLine();
				opcao = 0;
			}
			if (opcao == 7) {
				System.out.println("\n*****************************************************");
				System.out.println("TK ELETRONICS Agradece, até a próxima! ");
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n");
			
				System.out.println("Digite o nome do Produto: ");
				scanner.skip("\\R?");
				nome = scanner.nextLine();

				System.out.println("Digite o valor do Produto: ");
				valor = scanner.nextFloat();

				System.out.println("Digite a quantidade do Produto: ");
				quantidade = scanner.nextInt();

				do {
					System.out.println("O Produto tem conector? (1- s / 2- n)");
					conector = scanner.nextInt();
				} while (conector < 1 && conector > 2);

				switch (conector) {
				case 1 -> {
					System.out.println("Digite o tipo do conector: ");
					scanner.skip("\\R?");
					tipoConector = scanner.nextLine();
					produto.cadastrar(
							new ProdutosAcessorios(nome, valor, quantidade, produto.gerarCodigo(), tipoConector));
				}
				case 2 -> {
					tipoConector = "Não possui conector";
					produto.cadastrar(
							new ProdutosAcessorios(nome, valor, quantidade, produto.gerarCodigo(), tipoConector));
				}
				}

				keypress();
				break;

			case 2:
				System.out.println("Listar Todos os Produtos\n");

				produto.listarTodos();
				keypress();
				break;

			case 3:
				System.out.println("Buscar Produto por Código\n");

				System.out.println("Digite o Código do produto: ");
				codigo = scanner.nextInt();

				produto.procurarPorNumero(codigo);

				keypress();
				break;

			case 4:
				System.out.println("Atualizar Dados do Produto\n");

				System.out.println("Digite o código do Produto: ");
				codigo = scanner.nextInt();

				var buscaProduto = produto.buscarProduto(codigo);

				if (buscaProduto != null) {

					System.out.println("Digite o nome do Produto: ");
					scanner.skip("\\R?");
					nome = scanner.nextLine();

					System.out.println("Digite o valor do Produto: ");
					valor = scanner.nextFloat();

					System.out.println("Digite a quantidade do Produto: ");
					quantidade = scanner.nextInt();

					do {
						System.out.println("O Produto tem conector? (1- s / 2- n)");
						conector = scanner.nextInt();
					} while (conector < 1 && conector > 2);

					switch (conector) {
					case 1 -> {
						System.out.println("Digite o tipo do conector: ");
						scanner.skip("\\R?");
						tipoConector = scanner.nextLine();
						produto.atualizar(new ProdutosAcessorios(nome, valor, quantidade, codigo, tipoConector));
					}
					case 2 -> {
						tipoConector = "Não possui conector";
						produto.atualizar(new ProdutosAcessorios(nome, valor, quantidade, codigo, tipoConector));
					}
					default -> {
						System.out.println("Opção inválida!");
					}
					}
				} else {
					System.out.println("O Produto não foi encontrado!");
				}

				keypress();
				break;

			case 5:
				System.out.println("Excluir Produto\n");

				System.out.println("Digite o código do Produto:");
				codigo = scanner.nextInt();

				produto.deletar(codigo);

				keypress();
				break;

			case 6:
				System.out.println("Vender Produtos\n");

				System.out.println("Digite o código do produto: ");
				codigo = scanner.nextInt();
				produto.procurarPorNumero(codigo);

				System.out.println("\nDigite a quantidade que irá vender:");
				quantidade = scanner.nextInt();

				produto.vender(codigo, quantidade);

				keypress();
				break;
			
			default:
				System.out.println("Opção Inválida!");

				keypress();
				break;
			}

		}

	}

	public static void keypress() {
		try {
			System.out.println("\n Pressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Pressione Enter");
		}

	}

}
