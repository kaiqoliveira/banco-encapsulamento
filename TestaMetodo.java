public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoKaique = new Conta(6646,969060);
		contaDoKaique.deposita(100);
		contaDoKaique.deposita(50);
		System.out.println(contaDoKaique.getSaldo());

		boolean conseguiuRetirar = contaDoKaique.saca(20);
		System.out.println(contaDoKaique.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(6644,969063);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoKaique);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoKaique.getSaldo());
	}

}