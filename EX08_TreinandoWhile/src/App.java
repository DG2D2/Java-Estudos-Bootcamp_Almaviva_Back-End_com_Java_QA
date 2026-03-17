/* Escreva um código onde um usuário informe um número inicial, posteriormente irá informar outros N números,
   a execução do código deverá continuar até que o resto da divisão do número informado pelo número inicial 
   seja diferente de 0, números menores que o número inicial devem ser ignorados.
*/

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int divisor;

        System.out.print("Digite um número a ser dividido: ");
        int nBase = scanner.nextInt();
        
        if (nBase > 0) {
            do {
                System.out.print("Digite o número divisor: ");
                divisor = scanner.nextInt();
                
                if (divisor > 0) {
                    int resto = nBase % divisor;
                    
                    System.out.printf("O resto da divisão de %d por %d é: %d\n\n", nBase, divisor, resto);       
                } else {
                    System.out.print("@@@ Valor inválido. O divisor deve ser maior que 0. @@@");
                }
                
            } while (nBase % divisor == 0);
        } else {
            System.out.print("Valor inválido.");
        }

        System.out.print("Fim da execução.");

        scanner.close();
    }
}
