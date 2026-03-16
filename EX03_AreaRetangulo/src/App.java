/* Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba o resultado na tela.
   Fórmula: area = base X altura
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        float base = scanner.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        float altura = scanner.nextFloat();

        float area = base * altura;

        System.out.print("A área do retângulo é: " + area + " cm².");

        scanner.close();
    }
}
