public class BankAccount {
  private String num;
  private int saldoCtaCte;
  private int saldoCtaAhorro;

  public static int numCtas = 0;
  public static int totalDinero = 0;

  public BankAccount() {
    this.num = getNewNum();
    this.saldoCtaCte = 0;
    this.saldoCtaAhorro = 0;
    numCtas += 1;
  }

  public void transferir(BankAccount receptor, int monto) {
    if (this.saldoCtaCte < monto) {
      System.out.println("Saldo insuficiente");
      return;
    }
    this.saldoCtaCte -= monto;
    receptor.saldoCtaCte += monto;
    // se debe procurar que exista saldo suficiente
  }

  public void addToCtaCte(int monto) {
    this.saldoCtaCte += monto;
    totalDinero += monto;
  }

  public void addToCtaAhorro(int monto) {
    this.saldoCtaAhorro += monto;
    totalDinero += monto;
  }

  static private String getNewNum() {
    double num = Math.random() * 6;
    return "12345";
  }

  public String getNum() {
    return this.num;
  }

  public void setNum(String num) {
    this.num = num;
  }

  public int getSaldoCtaCte() {
    return this.saldoCtaCte;
  }

  public void setSaldoCtaCte(int saldoCtaCte) {
    this.saldoCtaCte = saldoCtaCte;
  }

  public int getSaldoCtaAhorro() {
    return this.saldoCtaAhorro;
  }

  public void setSaldoCtaAhorro(int saldoCtaAhorro) {
    this.saldoCtaAhorro = saldoCtaAhorro;
  }

}
