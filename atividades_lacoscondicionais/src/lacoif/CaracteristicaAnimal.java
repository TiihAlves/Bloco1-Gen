package lacoif;

import java.util.Scanner;

public class CaracteristicaAnimal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String carac1, carac2, carac3;
		
		System.out.println("Indique 3 Características e ");
		System.out.println("   Descubra o Animal! ");
		System.out.println("          Fase 1: ");
		
		System.out.println("vertebrado ou invertebrado?");
		carac1 = ler.next();
		
		if (carac1.equals("vertebrado") ) {
			
			System.out.println("	   Fase 2:");
			System.out.println("ave ou mamifero?");
			carac2= ler.next();
			
				if(carac2.equals("ave") ) {
					System.out.println("	   Fase 3:");
					System.out.println("carnivoro ou onivoro?");
					carac3= ler.next();
					
						if(carac3.equals("carnivoro")) {
							System.out.println("O Animal Indicado é Águia!");
							
						}else if(carac3.equals("onivero")) {
							System.out.println("O Animal Indicado é Pomba!");
							
						}else {
							System.out.println("Opção Inválida!");
						}
						
					
				}else if(carac2.equals("mamifero")) {
					System.out.println("	   Fase 3:");
					System.out.println("onivoro ou herbivoro?");
					carac3= ler.next();
						
						if(carac3.equals("onivoro")) {
						System.out.println("O Animal Indicado é Homem!");
						
						}else if(carac3.equals("herbivoro")) {
						System.out.println("O Animal Indicado é Vaca!");
						
						}else {
						System.out.println("Opção Inválida!");
						}
						
					
				}else {
					System.out.println("Opção Inválida!");
				}
			
		}
		else if(carac1.equals("invertebrado") ) {
			System.out.println("	   Fase 2:");
			System.out.println("inseto ou anelideo?");
			carac2 = ler.next();
			
			if(carac2.equals("inseto") ) {
				System.out.println("	   Fase 3:");
				System.out.println("hematofago ou herbivoro?");
				carac3= ler.next();
				
					if(carac3.equals("hematofago")) {
					System.out.println("O Animal Indicado é Pulga!");
					
					}else if(carac3.equals("herbivoro")) {
					System.out.println("O Animal Indicado é Lagarta!");
					
					}else {
					System.out.println("Opção Inválida!");
					}
				
			}else if(carac2.equals("anelideo")) {
				System.out.println("	   Fase 3:");
				System.out.println("hematofago ou onivoro?");
				carac3= ler.next();
				
					if(carac3.equals("hematofago")) {
					System.out.println("O Animal Indicado é Sanguessuga!");
					
					}else if(carac3.equals("onivoro")) {
					System.out.println("O Animal Indicado é Minhoca!");
					
					}else {
					System.out.println("Opção Inválida!");
					}
				
			}else {
				System.out.println("Opção Inválida!");
			}
			
			
		}else {
			System.out.println("Opção Inválida");
		}
		
		
		
	}

}
