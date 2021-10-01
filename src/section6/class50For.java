package section6;

import java.util.Scanner;

public class class50For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de entradas a serem somadas");
        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("resultado: " + soma);

        sc.close();

    }
}
