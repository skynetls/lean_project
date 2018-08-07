import java.util.Scanner;
/**
 * @author LSyzranova
 * @see #main(String[])
 */

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Объявляем переменную i
        System.out.print("Введите первое слагаемое: ");
        float i = scanner.nextFloat();

        //Объявляем переменную n
        System.out.print("Введите второе слагаемое: ");
        float n = scanner.nextFloat();

        /* Находим сумму переменных i и n
        Результат ограничиваем четырьмя знаками после запятой */
        System.out.printf("Сумма: " + "%.4f", (i + n));

        scanner.close();
    }
}