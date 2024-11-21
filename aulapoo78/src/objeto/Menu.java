package objeto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		
		System.out.println("Cadastre seu Gato: ");
		
		System.out.printf("Nome: ");
		gato1.nome = scanner.next();
		System.out.printf("Idade: ");
		gato1.idade = scanner.nextInt();
		System.out.printf("Cor: ");
		gato1.cor = scanner.next();
		System.out.printf("Raça: ");
		gato1.raca = scanner.next();
		
		gato1.Visualizar();
		
		// Gato 2
		
		System.out.println("\nCadastre o segundo Gato: ");
		
		System.out.printf("Nome: ");
		gato2.nome = scanner.next();
		System.out.printf("Idade: ");
		gato2.idade = scanner.nextInt();
		System.out.printf("Cor: ");
		gato2.cor = scanner.next();
		System.out.printf("Raça: ");
		gato2.raca = scanner.next();
		
		gato2.Visualizar();
		
		System.out.println("\nO que o gato 2 está fazendo?");
		gato2.Miar();
		
		scanner.close();
	}

}
