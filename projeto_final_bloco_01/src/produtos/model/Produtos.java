package produtos.model;

public abstract class Produtos {

	private String nome;
	private float valor;
	private int quantidade;
	private int codigo;

	public Produtos(String nome, float valor, int quantidade, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizar() {
		System.out.println("\n***********************************************************");
		System.out.println("Dados do Produto ");
		System.out.println("***********************************************************");
		System.out.println("Código do Produto: "+ this.codigo);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Valor do produto: " + this.valor);
		System.out.println("Quantidade do produto em estoque: " + this.quantidade);

	}

}
