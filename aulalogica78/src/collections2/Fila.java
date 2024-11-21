package collections2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		LinkedList<String> fila = new LinkedList<String>();
		
		//String nome;
		
		Collections.addAll(fila, "Gabriel","Priscila","kaue");
		
		System.out.println(fila);
		
		System.out.println("\nAdicionar novo Elemento: ");
		fila.add(scanner.next());
		//nome= scanner.next();
		//fila.add(nome);
		
		System.out.println(fila);
		
		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());
	
		System.out.println(fila);
		
		System.out.println("\nRemover Elemento: "+ fila.remove());
		
		System.out.println(fila);
		
		fila.clear();
		System.out.println(fila);
		
		scanner.close();
	}

}
