package produtos.controller;

import java.util.ArrayList;

import produtos.model.Produtos;
import produtos.model.ProdutosAcessorios;
import produtos.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int codigo = 0;

	@Override
	public void cadastrar(Produtos produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto número: " + produto.getCodigo() + " foi cadastrado com sucesso!");

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void procurarPorNumero(int codigo) {
		var produto = buscarProduto(codigo);

		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.println("\nO Produto de código: " + codigo + " não foi encontrado!");
		}

	}

	@Override
	public void atualizar(Produtos produto) {
		var buscarProduto = buscarProduto(produto.getCodigo());

		if (buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.println("\nO Produto de código: " + produto.getCodigo() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO Produto de código: " + produto.getCodigo() + " não foi encontrado!");
		}

	}

	@Override
	public void deletar(int codigo) {
		var produto = buscarProduto(codigo);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.println("\nO Produto de código: " + produto.getCodigo() + " foi deletado com sucesso!");
			} else {
				System.out.println("\nO Produto de código: " + produto.getCodigo() + " não foi encontrado!");
			}
		}

	}

	@Override
	public void vender(int codigo, int quantidade) {
		var produto = buscarProduto(codigo);

		if (produto != null) {
			float valor = produto.getValor() * quantidade;
			System.out.println("Valor a ser cobrado é de: " + valor + " reais");
			produto.setQuantidade(produto.getQuantidade() - quantidade);

		} else {
			System.out.println("\nO Produto de código: " + codigo + " não foi encontrado!");
		}

	}
	

	public int gerarCodigo() {
		return ++codigo;
	}

	public Produtos buscarProduto(int codigo) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}

}
