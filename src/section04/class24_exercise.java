package section04;


public class class24_exercise {
    public static void main(String[] args) {
    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

//        System.out.println("Products:");
        System.out.printf("Products: %n %s, which price is $%.2f %n %s, which price is $%.2f", product1, price1,
                product2, price2);
        System.out.printf("%n %n %d years old, code %d and gender: %s", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f " +
                            "%n Rounded (three decimal places): %.3f" +
                "%n US decimal point: %.2f", measure, measure, measure);

    }
}
