package lacosrepeticao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        boolean autenticado = false;
 
		
		do {
			System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
 
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            if(usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            	System.out.println("Autenticação bem-sucedido! Bem-Vindo." );
            }else {
            	
            	System.out.println("Usuário ou senha incorretos. Tente novamente.");
                System.out.print("Deseja tentar novamente? (s/n): ");
                String continuar = scanner.next().toUpperCase();
                
                	if(continuar.equals("S")) {
                		autenticado = true;
                		scanner.nextLine();
                	}else {
                		autenticado = false;
                		System.out.println("Não consegue né!? ");
                	}
            }
            
            
 
		}while(autenticado);{
			
		}

	}

}
