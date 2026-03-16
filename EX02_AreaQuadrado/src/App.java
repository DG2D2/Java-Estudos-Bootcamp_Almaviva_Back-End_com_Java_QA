/* Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba o resultado na tela.
   Fórmula: area = lado X lado.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado do quadrado: ");
        float lado = scanner.nextFloat();

        float area = lado * lado;

        System.out.print("A área do quadrado é: " + area + " cm².");

        scanner.close();
    }
}
