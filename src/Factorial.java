
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int a;
        long b = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите натуральное число a");
        if (s.hasNextInt()) {
            a = s.nextInt();
            for (int i = a; i > 0; i--) {
                b *= i;
            }
            System.out.println("Факториал числа " + a + " равен " + b);
        } else
            System.out.println("Неверный ввод");
    }
}
