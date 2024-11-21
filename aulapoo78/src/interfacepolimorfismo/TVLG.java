package interfacepolimorfismo;

public class TVLG implements ControleRemoto,Conectividade {

	private boolean ligado = false;
	private int canalAtual = 1;

	@Override
	public void conectarInternet() {
		System.out.println("TV LG conectada à internet");
	}
	
	@Override
	public void ligar() {
		ligado = true;
		System.out.println("TV LG Ligada.");
	}

	@Override
	public void desligar() {
		ligado = false;
		System.out.println("TV LG Desligada.");
	}

	@Override
	public void mudarCanal(int canal) {
		if(ligado) {
			canalAtual = canal;
			System.out.println("TV LG mudando para o canal: " + canalAtual);
		}else {
			   System.out.println("TV LG está desligada.");
		   }
		
	}
	
	
	
}
