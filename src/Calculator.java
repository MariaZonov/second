import exceptions.DividingZeroException;

import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) throws DividingZeroException {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:\n");

        num1 = scanner.nextDouble();
        System.out.print("Введите второе число:\n");
        num2 = scanner.nextDouble();

        System.out.print("Укажите действие: (+, -, *, /):\n");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/': {
                if (num2 == 0) {
                    throw new DividingZeroException();
                } else {
                    output = num1 / num2;
                    break;
                }
            }
            default:
                System.out.printf("Вы ввели не корректное действие");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);
    }
}