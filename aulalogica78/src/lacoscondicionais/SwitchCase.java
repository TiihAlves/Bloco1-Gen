package lacoscondicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
        
        op = ler.nextInt();
        
        switch (op) {
        
        case 1 :
        	System.out.println("Livro: Harry Potter");
        	break;
        
        case 2 :
        	System.out.println("Frase Motivacional: O importante é o que importa!");
        	break;
        
        case 3 :
        	System.out.println("Indicalção de música: 'True love' ");
        	break;
        	
        	default:
        		System.out.println("Digite uma opção válida!");
        		break;
        }
        
	}

}
