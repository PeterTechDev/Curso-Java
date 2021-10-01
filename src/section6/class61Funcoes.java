package section6;

// Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.

import java.util.Scanner;

public class class61Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
    }
//    FUNÇÕES
public static int max(int x, int y, int z) {
    int aux;
    if (x > y && x > z) {
        aux = x;
    } else {
        aux = Math.max(y, z);
    }
    return aux;
}
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
