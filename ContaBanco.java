import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Insira seu número de usuário");
                int numeroConta = scanner.nextInt();
            System.out.println("Insira seu nome");
                String nome = scanner.nextLine();
                String limparBuffer = scanner.nextLine();
            System.out.println("Insira o número de sua agência");
                String numeroAgencia = scanner.nextLine();
            System.out.println("Insira seu saldo");
                double saldo = scanner.nextDouble();
            System.out.println("Olá, " + nome + "obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + " conta " + numeroConta + " e seu saldo é " + saldo );
        scanner.close();
            
        
    }
}
