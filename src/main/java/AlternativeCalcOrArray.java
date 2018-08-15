import java.util.Scanner;

/**
 * @author LSyzranova
 * @see #main(String[])
 */
public class AlternativeCalcOrArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите 1 или 2: 1 - Калькулятор, 2 - Массив");
        int i = scanner.nextInt();
        if(i>0 && i<2){
            System.out.print("Введите первое значение: ");
            double y1 = scanner.nextDouble();
            System.out.print("Введите второе значение: ");
            double y2 = scanner.nextDouble();
            System.out.print("Введите + , - , / или * : ");
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
        else if(i<3 && i>1) {
            System.out.print("Введите, какое количество слов необходимо сравнить: ");
            int w = scanner.nextInt();
            String[] name = new String[w];
            System.out.println("Введите слова, чтобы найти количество символов в самом длинном из них");
            for(int x = 0; x<name.length; x++){
             name[x]=scanner.next();
            }

            int max=name[0].length();
            for(int m=0;m<name.length;m++){
                if (name[m].length() > max){
                    max = name[m].length();
                    System.out.println("Значение: " + name[m] + ", количество символов: " + max);
                }
            }
           /* for(int m=0;m<name[m].length();m++) {
                if (name[m].length() == max) {
                    System.out.println("Значение: " + name[m] + ", количество символов: " + max);
                }
                }*/
        }
        else {
            System.out.println("Вы неверно ввели значение");
        }
        scanner.close();
    }
}
