package vetores;

import java.util.Arrays;

public class VetorEx3 {

	public static void main(String[] args) {
		
		String grupoA[] = { "Amanda", "Elen", "Vinicius" };
        String grupoB[] = { "Samantha", "Letícia", "Alan" };

        System.out.println("Os Arrays são iguais?");
        
        if(Arrays.equals(grupoA, grupoB)) {
        	System.out.println("Sim, são iguais");
        }else {
        	System.out.println("Não, são iguais");
        }

	}

}
