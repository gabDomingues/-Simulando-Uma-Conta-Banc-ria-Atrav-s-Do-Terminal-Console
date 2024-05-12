import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("Por favor, digite o número da Conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência");
        agencia = sc.next();
        System.out.println("Por favor, digite o seu nome: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                 "conta " + numeroConta + "e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}