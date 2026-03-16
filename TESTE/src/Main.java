import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preciso levar o guarda chuva? ");
        
        System.out.print("Está nublado? (s / n) ");
        var nublado = scanner.nextLine();
        System.out.print("Está chovendo? (s / n) ");
        var chovendo = scanner.nextLine();

        if (nublado.equalsIgnoreCase("s") || chovendo.equalsIgnoreCase("s")) {
            System.out.println("Leve o guarda chuva.");
        } else {
            System.out.println("Não precisa levar o guarda chuva.");
        }

        scanner.close();
    }
}
