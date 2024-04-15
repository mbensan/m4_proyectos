public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        BankAccount cuentaAmerica = new BankAccount();
        BankAccount cuentaChris = new BankAccount();

        System.out.println("En el banco existen %s cuentas".formatted(BankAccount.numCtas));
        cuentaAmerica.addToCtaCte(2000);
        cuentaAmerica.addToCtaAhorro(5000);
        cuentaChris.addToCtaCte(8000);

        System.out.println("En total el banco tiene %s pesos".formatted(BankAccount.totalDinero));

        cuentaChris.transferir(cuentaAmerica, 5000);
        System.out.println("La cuenta de Chris ahora tiene %s pesos".formatted(cuentaChris.getSaldoCtaCte()));

    }
}
