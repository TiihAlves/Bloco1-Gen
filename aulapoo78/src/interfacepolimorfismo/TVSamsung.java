package interfacepolimorfismo;

public class TVSamsung implements ControleRemoto {

	private boolean ligado = false;
	private int canalAtual = 1;

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("TV Samsung Ligada.");
	}

	@Override
	public void desligar() {
		ligado = false;
		System.out.println("TV Samsung Desligada.");
	}

	@Override
	public void mudarCanal(int canal) {
		if(ligado) {
			canalAtual = canal;
			System.out.println("TV Samsung mudando para o canal: " + canalAtual);
		}else {
			   System.out.println("TV Samsung está desligada.");
		   }
		
	}
	
}
