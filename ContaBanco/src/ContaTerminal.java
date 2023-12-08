import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia, nomeCliente;
        float saldo;


        System.out.println("Insira o numero da conta:");
        numeroConta = scanner.nextInt();
        System.out.println("Insira a agencia:");
        agencia = scanner.next();
        System.out.println("Insira o nome do Cliente:");
        nomeCliente = scanner.next();
        System.out.println("Insira o saldo:");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ agencia + ", conta " + numeroConta+ " e seu saldo " + saldo +" já está disponível para saque.");


    }
}
