package segunda.atv;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite a 1ª Nota: ");
		n1= ler.nextFloat();
		
		System.out.println("Digite a 2ª Nota: ");
		n2= ler.nextFloat();
		
		System.out.println("Digite a 3ª Nota: ");
		n3= ler.nextFloat();
		
		System.out.println("Digite a 4ª Nota: ");
		n4= ler.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Sua média final foi: "+ media);

	}

}
