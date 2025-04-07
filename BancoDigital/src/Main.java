public class Main {

   public static void main(String[] args) {
      Banco bancoInicial = new Banco();
      bancoInicial.setNome("First Bank");
      Cliente carla = new Cliente("Carla", bancoInicial);
      carla.setNome("Carla Edila Silveira");
      Conta ccorrente = new ContaCorrente(carla);
      ccorrente.depositar(100.0);
      Cliente alisson = new Cliente("Alisson", bancoInicial);
      Conta cpoupanca = new ContaPoupanca(alisson);
      ccorrente.imprimirExtrato();
      cpoupanca.imprimirExtrato();
      ccorrente.transferir(48.0, cpoupanca);
      ccorrente.imprimirExtrato();
      cpoupanca.imprimirExtrato();
      bancoInicial.mostrarClientes();
      Cliente carolina = new Cliente("Carolina", bancoInicial);
      Conta ccorrente2 = new ContaCorrente(carolina);
      carolina.setBanco(bancoInicial);
      ccorrente2.imprimirExtrato();
      bancoInicial.mostrarClientes();
   }
}
