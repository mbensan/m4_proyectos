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

  public void addToCtaCte(int monto) {
    // hacer algo
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
