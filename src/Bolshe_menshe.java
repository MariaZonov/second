
import java.util.Scanner;

public class Bolshe_menshe {

    public static void main(String[] args) throws NumberFormatException {
//Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
        Scanner scanner = null;

        try {
            double a, b;

            scanner = new Scanner(System.in);
            System.out.println("Insert the first number:");
            a = Double.parseDouble(scanner.nextLine());

            System.out.println("Insert the second number:");
            b = Double.parseDouble(scanner.nextLine());

            if (a > b) {
                System.out.println("а > b");;
            }
            if (a < b) {
                System.out.println("а < b");;
            }
            if (a == b) {
                System.out.println("а = b");;
            }
        } catch (NumberFormatException e) {
            System.out.println("Bad format");
        }
        scanner.close();

    }
}
