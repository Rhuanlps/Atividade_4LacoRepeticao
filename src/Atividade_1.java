import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para multiplicar: ");
        num = sc.nextInt();

        for (int i = 0; i <= 10; i++ ) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
