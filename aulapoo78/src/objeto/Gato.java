package objeto;

public class Gato {

	String nome;
	int idade;
	String cor;
	String raca;

	public void Miar() {
		System.out.println("Miauu");
	}

	public void Comer() {
		System.out.println("Comendo ração");
	}

	public void Dormir() {
		System.out.println("zzz");
	}

	public void Visualizar() {
		System.out.println("\nNome: " + nome);
		System.out.println("Idade em anos: " + idade );
		System.out.println("Cor: " + cor);
		System.out.println("Raça: " + raca);
	}

}
