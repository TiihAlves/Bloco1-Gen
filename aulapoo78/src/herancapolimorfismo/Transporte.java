package herancapolimorfismo;

public abstract class Transporte {

	private String nome;
	private int capacidade;
	private int velocidade;
	
	public Transporte(String nome, int capacidade, int velocidade) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void visualizar() {
		 
        System.out.println("\n\n************************************************************");
        System.out.println("Dados do Meio de Transporte:");
        System.out.println("****************************************************************");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de passageiros: " + this.capacidade);
        System.out.println("Limite " + this.velocidade + "Km de velocidade. " );
 
    }
	
	
	

}
