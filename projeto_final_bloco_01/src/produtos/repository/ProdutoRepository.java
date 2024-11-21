package produtos.repository;

import produtos.model.Produtos;

public interface ProdutoRepository {

		// CRUD da Conta (Create, Read, Update e Delete)
		public void cadastrar(Produtos produto);
		public void listarTodos();
		public void procurarPorNumero(int numero);
		public void atualizar(Produtos produto);
		public void deletar(int numero);
	
		// Metodos de compra e venda
		public void vender(int codigo, int quantidade);
	
}
