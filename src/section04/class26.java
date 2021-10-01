package section04;

import java.util.Scanner;

public class class26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        System.out.println("Digite alguma coisa");
        x = sc.next();

        System.out.println("Você digitou: " + x);

//        com number inteiro
        int y;
        System.out.println("Digite um número");
        y = sc.nextInt();

        System.out.printf("Você digitou o número: %d %n", y);


//        pegar o char
        char z;
        System.out.println("Digite um caracter");

        z = sc.next().charAt(0);
        System.out.println("O caracter é: %s" + z);

        sc.close();

    }


}
