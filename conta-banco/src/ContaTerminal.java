import java.util.Scanner;

public class ContaTerminal {
    static Integer numeroConta;
    static String agencia;
    static String nomeCliente;
    static Double saldo;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");;

        System.out.println("Favor, digite o número da Agência: ");
        agencia = sc.nextLine();
        System.out.println("Favor, digite o número da Conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Favor, digite o seu Nome: ");
        nomeCliente = sc.next();
        System.out.println("Favor, digite o Saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "
                + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}
