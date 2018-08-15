import java.util.Scanner;

/**
 *
 */
public class AlternativeCalcOrArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите 1 или 2: 1 - Калькулятор, 2 - Массив");
        int i = scanner.nextInt();
        if(i<2){
            System.out.println("Введите первое значение: ");
            double y1 = scanner.nextDouble();
            System.out.println("Введите второе значение: ");
            double y2 = scanner.nextDouble();
            System.out.println("Введите +, -, / или *: ");
            String n = scanner.next();
            switch (n) {
                case "+": System.out.printf("Равно: " + (y1 + y2));
                break;
                case "-": System.out.printf("Равно: " + (y1 - y2));
                break;
                case "/": System.out.printf("Равно: " + (y1 / y2));
                break;
                case "*": System.out.printf("Равно: " + (y1 * y2));
                break;
                default: System.out.printf("Вы ввели неверный знак!");
            }
        }
        else if(i<3 & i>1) {
            System.out.println("Массив");
        }
        else {
            System.out.println("Вы неверно ввели значение");
        }
        scanner.close();
    }
}
