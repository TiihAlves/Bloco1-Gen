package lacoswitch;

import java.util.Scanner;

public class PedidoLanche {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num,qtd;
		float preco,valor;
		
		System.out.println("Escolha um Pedido: ");
		System.out.println("(1) Cachorro Quente ---- RS 10.00 ");
		System.out.println("(2) X-Salada ---- RS 15.00 ");
		System.out.println("(3) X-Bacon ---- RS 18.00 ");
		System.out.println("(4) Bauru ---- RS 12.00 ");
		System.out.println("(5) Refrigerante ---- RS 8.00 ");
		System.out.println("(6) Suco de Laranja Nt ---- RS 13.00 ");
		num = ler.nextInt();
						
		if((num < 1)||(num >6) ) {
			System.out.println("Digite uma opção válida!");
		}else {
		
		System.out.println("Digite a Quantidade: ");
		qtd = ler.nextInt();
		
		switch (num) {
			case 1:
				preco=10;
				valor = preco * qtd;
				System.out.println("Produto: Cachorro Quente!");
				System.out.printf("Valor Total: R$ %.2f", valor );
				break;
			case 2:
				preco=15;
				valor = preco * qtd;
				System.out.println("Produto: X-Salada!");
				System.out.printf("Valor Total: R$ %.2f", valor );
				break;
			case 3:
				preco=18;
				valor = preco * qtd;
				System.out.println("Produto: X-Bacon!");
				System.out.printf("Valor Total: R$ %.2f", valor );
				break;
			case 4:
				preco=12;
				valor = preco * qtd;
				System.out.println("Produto: Bauru!");
				System.out.printf("Valor Total: R$ %.2f", valor);
				break;
			case 5:
				preco=8;
				valor = preco * qtd;
				System.out.println("Produto: Refrigerante!");
				System.out.printf("Valor Total: R$ %.2f", valor );
				break;
			case 6:
				preco=13;
				valor = preco * qtd;
				System.out.println("Produto: Suco de Laraja!");
				System.out.printf("Valor Total: R$ %.2f", valor );
				break;
			}
		}
		
	}

}
