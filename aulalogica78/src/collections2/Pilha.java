package collections2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		 
        pilha.push("Prato Verde");
        pilha.push("Prato Azul");
        pilha.push("Prato Branco");
        pilha.push("Prato Amarelo");
        pilha.push("Prato Vermelho");
		
		System.out.println("\nElementos da Pilha: "+pilha);
		
		System.out.println("\nRetirar elemento: " + pilha.pop());		
		
		System.out.println("\nElementos da Pilha: "+ pilha);
		
		pilha.push("Prato Roxo");
		
		System.out.println("\nElementos da Pilha: "+ pilha);
		
		Iterator<String> iterator = pilha.iterator();

		//hashNext = percorrer toda a pilha para poder interagir com ela
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		scanner.close();
		
	}

}
