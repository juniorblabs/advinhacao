import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {
        Random random = new Random();
        int inicio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentativa = 0;
        int numerotentativa = 0;
        boolean acerto = false;

        System.out.println("Bem vindo ao Adivinhe o numero");
        System.out.println("Estou pensando em um numero de 1 a 100, tente adivinhar qual o numero seu fraco huahuahua");

        while (!acerto) {
            System.out.println("Em qual numero estou pensando? ");
            tentativa = scanner.nextInt();
            numerotentativa++;

            if (tentativa == inicio) {
                System.out.println("Deu sorte seu cagado...");
                acerto = true;
            } else if (tentativa < inicio) {
                System.out.println("o numero é maior que " + tentativa + ". tente novamente seu merda ");
            } else {
                System.out.println("o numero é menor que " + tentativa + ". tente novamente seu merda ");

            }
        }
        scanner.close();
    }
}