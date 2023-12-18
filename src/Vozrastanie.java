// В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
// Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vozrastanie {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число a");
            int a = sc.nextInt();

            System.out.println("Введите число b");
            int b = sc.nextInt();

            System.out.println("Введите число c");
            int c = sc.nextInt();

            System.out.println("Числа в переменных a, b и c: " + a + " " + b + " " + c);
            System.out.println(" ");
            if (a < b & a < c) {
                if (b < c) System.out.println("Возрастающая последовательность " + a + " " + b + " " + c);
                else System.out.println("Возрастающая последовательность " + a + " " + c + " " + b);
            }
            if (b < a & b < c) {
                if (a < c) System.out.println("Возрастающая последовательность " + b + " " + a + " " + c);
                else System.out.println("Возрастающая последовательность " + b + " " + c + " " + a);
            }
            if (c < a & c < b) {
                if (a < b) System.out.println("Возрастающая последовательность " + c + " " + a + " " + b);
                else System.out.println("Возрастающая последовательность " + c + " " + b + " " + a);

            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат");
        }
    }
}


