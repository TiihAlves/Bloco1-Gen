package lacoscondicionais;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		
		float n1, n2, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a Nota1: ");
		n1 = ler.nextFloat();
		
		System.out.println("Digite a Nota2: ");
		n2 = ler.nextFloat();
		
		media = (n1+n2) / 2;
		
		if(media >= 6) {
			System.out.printf(media+" Parabéns você foi aprovado!");
		}
		
		else if (media >= 5) {
			System.out.printf(" Você ficou de recuperação! %.2f", media);
		}
		
		else 
		{
			System.out.printf("Reprovado, estude mais %.2f", media);
		}
		
		ler.close();
	}
		

	}


