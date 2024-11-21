package collections;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Long, String> pessoa = new HashMap<>();

		pessoa.put(49138556898L, "Felipe F");
		pessoa.put(1127756789L, "Geandro");
		pessoa.put(723456789L, "Felipe A");
		
		System.out.println(pessoa);
		
		System.out.println(" " + pessoa.get(49138556898L));
		
		
	}
	

}
