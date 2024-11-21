package conta;

import java.util.Scanner;

public class MenuConta {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		conta.setTitular(scanner.next());
		
		System.out.println(conta.getTitular());
		
		
		
		//conta.Exibir();
		
			scanner.close();
	}

}
