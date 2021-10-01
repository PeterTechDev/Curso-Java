package section08IntroPOO.CalcTriangle;

import java.util.Scanner;

public class Triangle {
        public double a;
        public double b;
        public double c;

//        função
        public double area() {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
}
