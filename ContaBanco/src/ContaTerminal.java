import java.util.Scanner;
import java.util.Locale;;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in).useLocale(Locale.US);
       

       int numero;
       String agencia,nomeCliente,sobrenomeCliente;
       double saldo;

       //Pede o numero da conta para o cliente.
       System.out.println("Digite o numero da conta:  ");
       numero = ler.nextInt();

       //Pede o numero da agencia para o cliente.
       System.out.println("DIgite o numero da agencia:");
       agencia = ler.next();
    
       //Pede o nome do cliente para o cliente.
       System.out.println("Digite seu nome:");
       nomeCliente = ler.next();

       //Pede o sobrenome do cliente para o cliente.
       System.out.println("Digite seu sobrenome");
       sobrenomeCliente = ler.next();

       //Pede o saldo atual do cliente para o cliente.
       System.out.println("Digite o saldo:");
       saldo = ler.nextDouble();

       //Imprime os dados do cliente.
       System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero + " e seu saldo " + saldo +  " já está disponível para saque.");

       ler.close();
    }
}
