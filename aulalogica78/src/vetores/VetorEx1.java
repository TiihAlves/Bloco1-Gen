package vetores;

import java.util.Scanner;

public class VetorEx1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
		String vetorString[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi"};
		
		for(int i = 0; i< vetorString.length; i++) {
			System.out.println((i+1 + "º elemento: "+ vetorString[i]));
		}
		
		scanner.close();

	}

}
