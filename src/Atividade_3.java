import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {

        int num;
        int fatorial;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
            fatorial = 1;
            int i = 1;

        do{
            fatorial *= i;
            i++;
        }while(i <= num);

        System.out.println("O fatorial de " + num + " é " + fatorial);

    }
}
