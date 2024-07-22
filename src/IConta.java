
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, String formaDePagamento, IConta contaDestino);
	
	void transferirViaPix(double valor, String chavePix, IConta contaDestino);
	
	void imprimirExtrato();
}
