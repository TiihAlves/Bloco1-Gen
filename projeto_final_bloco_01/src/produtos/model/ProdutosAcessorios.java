package produtos.model;

public class ProdutosAcessorios extends Produtos {

	String tipoConector;

	public ProdutosAcessorios(String nome, float valor, int quantidade,int codigo, String tipoConector) {
		super(nome, valor, quantidade, codigo);
		this.tipoConector = tipoConector;
	}

	public String getTipoConector() {
		return tipoConector;
	}

	public void setTipoConector(String tipoConector) {
		this.tipoConector = tipoConector;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de Conector: "+ this.tipoConector);

	}

}
