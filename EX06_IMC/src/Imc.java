/* Escreva um código onde o usuário enrte com sua altura e peso, seja feito o cálculo do seu IMC(IMC = peso / (altura * altura)),
   e seja exibida a mensagem de acordo com o resultado:

    - Se for menor ou igual a 18,5 "Abaixo do peso.";
    - Se for entre 18,6 e 24,9 -> "Peso ideal.";
    - Se for entre 25,0 e 29,9 -> "Levemente acima do peso.";
    - Se for entre 30,0 e 34,9 -> "Obesidade Grau I.";
    - Se for entre 35,0 e 39,9 -> "Obesidade Grau II (Severa).";
    - Se for maior que 40,0 -> "Obesidade III (Mórbida).".
*/

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Digite seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);

      if (imc <= 18.5) {
        System.out.printf("Seu IMC é: %.2f -> Abaixo do peso ideal.", imc);       
      } else if (imc < 25.0) {
        System.out.printf("Seu IMC é: %.2f -> Peso ideal.", imc);
      } else if (imc < 30.0) {
        System.out.printf("Seu IMC é: %.2f -> Levemente acima do peso.", imc);
      } else if (imc < 35.0) {
        System.out.printf("Seu IMC é: %.2f -> Obesidade Grau I.", imc);
      } else if (imc < 40.0) {
        System.out.printf("Seu IMC é: %.2f -> Obesidade Grau II (Severa).", imc);
      } else {
        System.out.printf("Seu IMC é: %.2f -> Obesidade Garu III (Mórbida).", imc);
      }

        scanner.close();
    }
}
