import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        var opcao = scanner.nextInt();

        var mensagem = switch (opcao){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6, 7 -> {
                var dia = opcao == 6 ? "Sexta":"Sábado";
                yield String.format("Hoje é %s, fim de semana.", dia);
            }
            default -> "Opção inválida.";
        };

        System.out.print(mensagem);

        scanner.close();
    }
}
