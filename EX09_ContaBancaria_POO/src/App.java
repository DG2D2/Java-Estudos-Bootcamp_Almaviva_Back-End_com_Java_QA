import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        Conta c1 = new Conta();
        int opcao;

        do {
            System.out.println("======= MENU =======");
            System.out.println("[1] - Primeiro Deposito");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Sacar");
            System.out.println("[4] - Pagar Boleto");
            System.out.println("[5] - Utilizar Cheque Especial.");
            System.out.println("[6] - Consultar Saldo");
            System.out.println("[7] - Consultar Cheque Especial");
            System.out.println("[8] - Consultar Cobranças");
            System.out.println("[0] - Sair da Conta");

            System.out.print("Selecione uma opção => ");
            opcao = scanner.nextInt();
            System.out.println("====================\n");

            
            if (opcao == 1) {
                final String textoInformativo = """
                        \n=== INFORMATIVO ===
                        - O valor do Cheque Especial será definido de acordo com o valor depositado.
                        - Se o depósito for menor ou igual a R$500,00 então o Cheque Especial será de R$50,00.
                        - Se o depósito for maior que R$500,00 então o Cheque Especial será 50% do valor depositado.
                        - Caso o limite do cheque especial seja utilizado, uma taxa de 20% de seu valor será cobrada.

                        Informe o valor do depósito: R$""";
                System.out.print(textoInformativo);
                c1.primeiroDeposito(scanner.nextFloat());

            } else if (opcao == 2) {
                System.out.print("Informe o valor do depósito: R$");
                c1.depositar(scanner.nextFloat());

            } else if (opcao == 3) {    
                System.out.print("Informe o valor do saque: R$");
                c1.sacar(scanner.nextFloat());

            } else if (opcao == 4) {
                System.out.print("Informe o valor do boleto a ser pago: R$");
                c1.pagarBoleto(scanner.nextFloat());
                
            } else if (opcao == 5) {
                c1.utilizarChequeEspecial();

            } else if (opcao == 6) {
                System.out.println("Saldo atual: R$" + c1.getSaldo());

            } else if (opcao == 7) {
                c1.consultarChequeEspecial();

            } else if (opcao == 8) {
                System.out.println("Taxa de uso total do Cheque Especial: R$" + c1.cobrancaTaxa());
                
            } else if (opcao == 0) {
                System.out.println("Secão encerrada.");
                break;

            } else {
                System.out.println("@@@ Opção inválida! Selecione uma das opções do menu. @@@");

            }
        } while(opcao != 0);

        scanner.close();

    }
}
