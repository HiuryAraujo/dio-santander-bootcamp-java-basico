import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner lerEntrada = new Scanner(System.in);
       
       int numeroConta = 0;
       String agenciaConta = "";
       String nomeClienteConta = "";
       float saldoConta = 0;

       System.out.print("Por favor, digite seu NOME COMPLETO e depois tecle ENTER! \n" + "Nome Completo: ");
       nomeClienteConta = lerEntrada.nextLine();
       System.out.print("Por favor, digite o número da AGÊNCIA e depois tecle ENTER! \n" + "Agência: ");
       agenciaConta = lerEntrada.nextLine();
       System.out.print("Por favor, digite o NÚMERO DA CONTA e depois tecle ENTER! \n" + "Conta: ");
       numeroConta = lerEntrada.nextInt();
       System.out.print("Por favor, digite o SALDO depois tecle ENTER! \n" + "Saldo: ");
       saldoConta = lerEntrada.nextFloat();
    
       lerEntrada.close();

       System.out.println("Olá, " + nomeClienteConta + ", obrigado por criar uma conta em nosso banco, sua agência é "
       + agenciaConta + ", conta " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque.");
    }
}
