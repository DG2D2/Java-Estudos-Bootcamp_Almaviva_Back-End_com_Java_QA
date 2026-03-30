import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        ProdutosAlimentacao pa = new ProdutosAlimentacao();
        ProdutosSaude ps = new ProdutosSaude();
        ProdutosVestuario pv = new ProdutosVestuario();
        ProdutosCultura pc = new ProdutosCultura();

        int opcao;

        
        while(true) {
            System.out.println("\n====== MENU ======");
            System.out.println("[1] - Produtos Alimentícios");
            System.out.println("[2] - Produtos de Saúde e Bem Estar");
            System.out.println("[3] - Produtos de Vestuário");
            System.out.println("[4] - Produtos de Cultura");
            System.out.println("[0] - Sair");
            
            System.out.print("Selecione uma opção => ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("==================\n");


            if (opcao == 1) {
                System.out.print("Infomre o produto desejdo: ");
                pa.informarProduto(scanner.nextLine());
                System.out.print("Infomre o valor do produto: R$");
                pa.calcularImposto(scanner.nextDouble());
                pa.emitirNota();

            } else if (opcao == 2) {
                System.out.print("Infomre o produto desejdo: ");
                ps.informarProduto(scanner.nextLine());
                System.out.print("Infomre o valor do produto: R$");
                ps.calcularImposto(scanner.nextDouble());
                ps.emitirNota();
                
            } else if (opcao == 3) {
                System.out.print("Infomre o produto desejdo: ");
                pv.informarProduto(scanner.nextLine());
                System.out.print("Infomre o valor do produto: R$");
                pv.calcularImposto(scanner.nextDouble());
                pv.emitirNota();

            } else if (opcao == 4) {
                System.out.print("Infomre o produto desejdo: ");
                pc.informarProduto(scanner.nextLine());
                System.out.print("Infomre o valor do produto: R$");
                pc.calcularImposto(scanner.nextDouble());
                pc.emitirNota();

            } else if (opcao == 0) {
                System.out.println("Sessão encerrada.");
                break;

            } else {
                System.out.println("Opção inválida.");
            }

        }

        scanner.close();

    }
}
