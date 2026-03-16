/* Escreva um código que receba o nome e ano de nascimento de alguém e imprima na tela
a seguinte mensagem: "Olá, [nome]! Você tem [idade] anos."
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int anoAtual = 2026;

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Agora digite o ano em que você nasceu: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Olá, " + nome + "! Você termina este ano com " + idade + " anos de idade.");

        scanner.close();
    }
}
