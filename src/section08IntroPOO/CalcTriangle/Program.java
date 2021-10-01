package section08IntroPOO.CalcTriangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area x = %.2f", areaX);
        System.out.printf("%n Area Y = %.2f", areaY);
/*
        System.out.println("Area x = " + areaX);
        System.out.println("Area y = " + areaY);
*/
    }
}
