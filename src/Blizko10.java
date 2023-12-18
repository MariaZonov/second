import java.util.InputMismatchException;
import java.util.Scanner;
// Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n. Например, среди чисел 8 и 11 ближайшим к десяти будет 10


public class Blizko10 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите число a");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            System.out.println("Введите число b");
            int b = sc.nextInt();

            int x = 10;
            int y = Math.abs(a - x);
            int z = Math.abs(b - x);
            if (z == y) {
                System.out.println("Числа " + a + " и " + b + " равноудалены от " + x);
            }
            if (y > z) {
                System.out.println("Число " + b + " ближе к " + x);
            }
            if (y < z) {
                System.out.println("Число " + a + " ближе к " + x);
            }
        } catch (InputMismatchException e) {
            System.out.println("Bad action! Try once more.");
        }
    }
}