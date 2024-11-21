package lacoif;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Escolha um Número: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O numero escolhido é Par");
			if(num > 0) {
				System.out.println(" e é Positivo!");
			}else if(num == 0) {
				System.out.println(" e o número é 0");
			}else {
				System.out.println(" e é Negativo!");
			}
		}else {
			System.out.println("O numero escolhido é Ímpar");
			if(num > 0) {
				System.out.println(" e é Positivo!");
			}else {
				System.out.println(" e é Negativo!");
			}
		}
	}

}
