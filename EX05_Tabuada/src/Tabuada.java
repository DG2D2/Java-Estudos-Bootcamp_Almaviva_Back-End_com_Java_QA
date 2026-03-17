// Ecsreva um código onde o usuário entre com um número e seja gerada a tabuada de 1 a 10 deste número.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para que seja gerada sua tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = i * numero;
            System.out.println(i + " X " + numero + " = " + tabuada);
        }

        scanner.close();
    }
}
