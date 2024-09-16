import java.util.Random;
import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {

        Random random = new Random();
        int numero;
        int num = random.nextInt(100);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Tente acertar o número de 1 a 100: ");
            numero = sc.nextInt();
        } while (num != numero);
        System.out.println("O numero é " + num);

    }
}
