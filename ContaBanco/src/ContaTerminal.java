import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {      
    
    String clientName;
    String agency;
    int accountNumber;
    Double balance;

    Scanner input = new Scanner(System.in);

    System.out.println("Por Favor, Digite Seu Nome: ");
        clientName = input.nextLine();
    
    System.out.println("Por Favor, Digite o Número de Sua Agência: ");
        agency = input.nextLine();

    System.out.println("Por Favor, Digite o Número de Sua Conta: ");
        accountNumber = input.nextInt();

    System.out.println("Por Favor, Digite o Valor do Depósito Inicial: ");
        balance = input.nextDouble();
    
    
    System.out.println("Olá " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque.");
    
    }
}