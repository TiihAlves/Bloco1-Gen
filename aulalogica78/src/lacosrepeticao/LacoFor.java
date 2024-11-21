package lacosrepeticao;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int num, i,res;
		
		System.out.println("Insira o número para ver a tabuada:");
		num = scanner.nextInt();
		
		for(i=0; i<=10; i++) {
			res = num*i;
			System.out.println(num + "X"+ i + "="+ res);
			
		}
		
	}

}
