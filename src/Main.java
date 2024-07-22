
public class Main {

	public static void main(String[] args) {
		Cliente feliphe = new Cliente();
		feliphe.setNome("Feliphe");
		feliphe.setChavePix("123-neoboing737-18921");
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		maria.setChavePix("908-koynoula116-17477");
		
		Conta cc = new ContaCorrente(feliphe);
		Conta poupanca = new ContaPoupanca(feliphe);
		
		Conta cc1 = new ContaCorrente(maria);
		Conta poupanca1 = new ContaPoupanca(maria);

		cc.depositar(100);
		cc1.depositar(500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		cc.transferir(100, "TED", cc1);
		cc1.transferir(250, "TED", poupanca1);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		cc1.transferirViaPix(100, feliphe.getChavePix(), poupanca);
		cc1.transferirViaPix(250, feliphe.getChavePix(), cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
	}

}
