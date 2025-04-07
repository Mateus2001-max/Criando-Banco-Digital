public abstract class Conta implements IConta {
   private static final int AGENCIA_PADRAO = 1;
   private static int SEQUENCIAL = 1;
   protected int agencia;
   protected int numero;
   protected double saldo;
   protected Cliente cliente;

   public Conta(Cliente cliente) {
      this.agencia = 1;
      this.numero = SEQUENCIAL++;
      this.cliente = cliente;
   }

   public Conta() {
   }

   public static int getSEQUENCIAL() {
      return SEQUENCIAL;
   }

   public int getAgencia() {
      return this.agencia;
   }

   public int getNumero() {
      return this.numero;
   }

   public double getSaldo() {
      return this.saldo;
   }

   public Cliente getCliente() {
      return this.cliente;
   }

   public String toString() {
      return "Conta{agencia=" + this.agencia + ", numero=" + this.numero + ", saldo=" + this.saldo + ", cliente=" + this.cliente + "}";
   }

   protected void imprimirInfosComuns() {
      System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
      System.out.printf(String.format("Agência: %d%n", this.agencia));
      System.out.printf(String.format("Número: %d%n", this.numero));
      System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
   }

   public void sacar(double valor) {
      this.saldo -= valor;
   }

   public void depositar(double valor) {
      this.saldo += valor;
   }

   public void transferir(double valor, Conta contaDestino) {
      this.sacar(valor);
      contaDestino.depositar(valor);
   }

   public void imprimirExtrato() {
   }
}
