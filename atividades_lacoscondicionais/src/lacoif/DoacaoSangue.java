package lacoif;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome,doacao;
		int idade;
		boolean pdoacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = ler.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = ler.nextInt();
		System.out.println("Primeira Doação? (s)(n) ");
		doacao = ler.next();
		
		if((idade < 18)||(idade > 69)) {
			System.out.printf(nome + " não está apto para doar sangue");
		}else if(idade >= 60){
			
			switch (doacao) {
			case "s":
				System.out.printf(nome + " não está apto para doar sangue");
				break;
			case "n":
				System.out.printf(nome + " está apto para doar sangue");
				break;
			
			default:
				System.out.printf(" Você digitou uma opção inválida!");
				break;
				
			}	
		}else {
			System.out.printf(nome + " está apto para doar sangue");
		}
		
		
		
	}

}
