import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para contagem regressiva: ");
        int num = sc.nextInt();

        while (num >= 0) {
            System.out.println(num --);

        }

    }
}
