package lacoif;

import java.util.Scanner;

public class LendoValores {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c,soma;
		
		System.out.println("Digite um valor para A:");
		a = ler.nextInt();
		System.out.println("Digite um valor para B:");
		b = ler.nextInt();
		System.out.println("Digite um valor para C:");
		c = ler.nextInt();
		
		soma = a+b;
		
		if(soma > c) {
			System.out.println("A soma de A e B é: "+soma);
			System.out.println("Então a soma de A + B é maior que C !");
			
		}else if(soma == c) {
			System.out.println("A soma de A e B é: "+soma);
			System.out.println("Então a soma de A + B é igual a C !");
		}else {
			System.out.println("A soma de A e B é: "+soma);
			System.out.println("Então a soma de A + B é menor que C !");
		}
		
		
	}
	
}
