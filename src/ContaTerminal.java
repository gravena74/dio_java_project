import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência!");
        int number = scanner.nextInt();

        System.out.println("Por favor, digite seu nome!");
        String nameClient = scanner.next();

        System.out.println("Por favor, digite a agencia!");
        String agency = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        Double balance = scanner.nextDouble();
    
        System.out.println("Olá " + nameClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");
    }
}
