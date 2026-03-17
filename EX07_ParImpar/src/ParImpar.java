/* Escreva um código onde o usuário entre com o primeiro número, um segundo número maior que o primeiro e escolha
   entre as opções par ou impar, com isso o código deve retornar todos os números pares ou ímpares (de acordo com a 
   seleção inicial) no intervalo de números informados, incluindo os números informados em ordem decrescente.
*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o seundo número: ");
        int n2 = scanner.nextInt();
        
        if (n1 < n2) {
            System.out.print("Muito bem, agora escolha uma das opções -> (par / impar): ");
            String opcao = scanner.next();

            if (opcao.equalsIgnoreCase("par")) {
                while (n1 < n2) {
                    if (n1 % 2 == 0) {
                        int pares = n1;
                        System.out.println(pares);
                    }
                    n1++;
                }
            } else if (opcao.equalsIgnoreCase("impar")) {
                while (n1 < n2) {
                    if (n1 % 2 != 0) {
                        int impares = n1;
                        System.out.println(impares);
                    }
                    n1++;
                }            
            }
        } else {
            System.out.print("@@@ Valor inválido. O segundo número tem que ser maior que o primeiro. @@@");
        }
        
        scanner.close();
    }
}
