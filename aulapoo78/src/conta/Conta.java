package conta;

public class Conta {

	private String titular;
	private int numero_conta;
	private int agencia;
	private int tipo;
	private float saldo;

	//public Conta(String titular, int numero_conta, int agencia, int tipo, float saldo) {
	//
	//	this.titular = titular;
	//	this.numero_conta = numero_conta;
	//	this.agencia = agencia;
	//	this.tipo = tipo;
	//	this.saldo = saldo;
	//}

	
	
	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public int getNumero_conta() {
		return numero_conta;
	}



	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public void Exibir() {

		System.out.println("Titular: " + titular);
		System.out.println("Numero da conta: " + numero_conta);
		System.out.println("Agência: " + agencia);
		System.out.println("Tipo de conta: " + tipo);
		System.out.println("Saldo: " + saldo);

	}

}
