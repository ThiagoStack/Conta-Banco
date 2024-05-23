import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
// Criando um sistema de conta banco
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o número da Conta !: ");
		int numeroConta = sc.nextInt();

		System.out.println("Nome da Agencia: ");
		String agencia = sc.next();

		sc.nextLine();
		System.out.println("Seu Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.println("Digite um valor de depósito: ");
		double saldo = sc.nextDouble();

		System.out.printf("Olá, [%s] ,obrigado por criar uma conta em nosso banco, sua agência é "
				+ "[%s]  conta [%d] e seu saldo R$[%.2f]  já está disponível para saque.",nomeCliente,agencia,numeroConta,saldo);

		sc.close();

	}
}
