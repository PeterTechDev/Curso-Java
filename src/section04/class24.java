package section04;

public class class24 {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;

//       Para fazer uma máscara de impressão
//        Mostrar apenas duas casas decimais
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

//        concatenar elementos
        System.out.println("RESULTADO: " + x + " metros");
//        ou
        System.out.printf("RESULTADO: = %.2f me tros%n", x);
    }
}
