public class ContaCorrente extends Conta {
   public ContaCorrente(Cliente cliente) {
      super(cliente);
   }

   public ContaCorrente() {
   }

   public void imprimirExtrato() {
      System.out.println("#### Extrato de Conta Corrente #####");
      super.imprimirInfosComuns();
   }
}
