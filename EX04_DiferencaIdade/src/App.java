// Escreva um código que receba o nome e idade de duas pessoas e imprima a diferença de idade entre elas.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int diferencaIdade;
        
        System.out.print("Digite o primeiro nome: ");
        String nome1 = scanner.next();
        System.out.print("Muito bem, " + nome1 + ", agora digite sua idade: ");
        int idade1 = scanner.nextInt();

        System.out.print("\nDigite o segundo nome: ");
        String nome2 = scanner.next();
        System.out.print("Muito bem, " + nome2 + ", agora digite sua idade: ");
        int idade2 = scanner.nextInt();
        
        
        if (idade1 > idade2) {
            diferencaIdade = idade1 - idade2;
            System.out.print("\n" + nome1 + " é " + diferencaIdade + " anos mais velho(a) que " + nome2 + ".");
        } else if (idade2 > idade1) {
            diferencaIdade = idade2 - idade1;
            System.out.print("\n" + nome2 + " é " + diferencaIdade + " anos mais velho(a) que " + nome1 + ".");
        } else {
            System.out.print("Não há diferença de idade, " + nome1 + " e " + nome2 + " nasceram no mesmo ano.");
        }

        scanner.close();
    }
}
