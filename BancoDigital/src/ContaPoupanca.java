public class ContaPoupanca extends Conta {
   public ContaPoupanca(Cliente cliente) {
      super(cliente);
   }

   public ContaPoupanca() {
   }

   public void imprimirExtrato() {
      System.out.println("#### Extrato de Conta Poupança #####");
      super.imprimirInfosComuns();
   }
}
