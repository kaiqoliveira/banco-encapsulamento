public class TestaBanco {
	public static void main(String[] args) {
		Cliente kaique = new Cliente();
		kaique.setNome("Kaique Oliveira");
		kaique.setCpf("222.222.222.-22");
		kaique.setProfissao("Programador");

		Conta contaDoKaique = new Conta(6646,969060);
		contaDoKaique.deposita(100);

		contaDoKaique.setTitular(kaique);
		System.out.println(contaDoKaique.getTitular().getNome());
		System.out.println(contaDoKaique.getTitular());
		
//		Cliente robson = new Cliente();
//		robson.setNome("Robson Alves");
//		robson.setCpf("31313131313");
//		robson.setProfissao("Cozinheiro");
//		
//		Conta contaDoRobson = new Conta(21,2123);
//		contaDoRobson.deposita(20000);
//		System.out.println( contaDoRobson.getSaldo());
//		
//		contaDoKaique.transfere(200, contaDoRobson);
//		
//		System.out.println( contaDoRobson.getSaldo());
		
	}
}