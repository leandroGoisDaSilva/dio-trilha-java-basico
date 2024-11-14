import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o número da conta: ");
        int numeroConta= scan.nextInt();

        System.out.print("Insira o número da agência: ");
        String agencia = scan.next();

        System.out.print("Digite seu nome: ");
        String nome = scan.next();

        System.out.print("Insira o valor do depósito: ");
        double saldo = scan.nextDouble();

        System.out.println();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua gência é " +
                agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
