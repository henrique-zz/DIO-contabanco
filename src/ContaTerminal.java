import java.util.Scanner;

public class ContaTerminal {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.print("\nDigite o número da agência: ");
        agencia = input.nextLine();

        System.out.print("\nDigite o número da sua conta: ");
        numero = Integer.parseInt(input.nextLine());

        System.out.print("\nDigite o seu nome: ");
        nomeCliente = input.nextLine();

        System.out.print("\nDigite o seu saldo: ");
        saldo = Float.parseFloat(input.nextLine());

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque.");
    }
}
