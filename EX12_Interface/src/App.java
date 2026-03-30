import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in, "UTF-8");
        
        SMS sms1 = new SMS();
        Email email1 = new Email();
        WhatsApp wa1 = new WhatsApp();
        RedesSociais rs1 = new RedesSociais();
        
        int opcao;

        while(true) {
            System.out.println("====== MENU ======");
            System.out.println("[1] - SMS");
            System.out.println("[2] - E-mail");
            System.out.println("[3] - WhatsApp");
            System.out.println("[4] - Redes Sociais");
            System.out.println("[0] - Sair");

            System.out.print("Selecione uma opção => ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("==================\n");
            
            if (opcao == 1) {
                System.out.print("Digite a mensagem a ser enviada: ");
                sms1.enviarMensagem(scanner.nextLine());

            } else if (opcao == 2) {
                System.out.print("Digite a mensagem a ser enviada: ");
                email1.enviarMensagem(scanner.nextLine());

            } else if (opcao == 3) {
                System.out.print("Digite a mensagem a ser enviada: ");
                wa1.enviarMensagem(scanner.nextLine());

            } else if (opcao == 4) {
                System.out.print("Digite a mensagem a ser enviada: ");
                rs1.enviarMensagem(scanner.nextLine());

            } else if (opcao == 0) {
                System.out.println("Sessão encerrada.");
                break;

            } else {
                System.out.println("Opç~cao inválida.");
            }
        
        }

        scanner.close();
        
    }
}
