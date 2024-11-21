package lacoscondicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		float n1, n2, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a Nota1: ");
		n1 = ler.nextFloat();
		
		System.out.println("Digite a Nota2: ");
		n2 = ler.nextFloat();
		
		media = (n1+n2) / 2;
		
		if(media >= 5) {
			System.out.printf(media+" Parabéns você foi aprovado!");
		}
		else {
			System.out.println(media+" Reprovado, estde mais");
		}
		
		ler.close();
	}

}
