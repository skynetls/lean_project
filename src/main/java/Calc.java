import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое слагаемое: ");
        float i = scanner.nextFloat();

        System.out.print("Введите второе слагаемое: ");
        float n = scanner.nextFloat();

        System.out.printf("Сумма: " + "%.4f", (i + n));

        scanner.close();
    }
}
