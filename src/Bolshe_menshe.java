
import java.util.Scanner;

public class Bolshe_menshe {

    public static void main(String[] args) throws NumberFormatException {
//�������� ���������, ������� ��������� �� ���� ��� ����� ����� (a � b) � ��������� � ���� ��������� ��������:
//- ���������� ��� ��� ����� � ���������� ��������� ��������� ����� ������ � ������� ������ �� ���������: "a > b", "a < b" ��� "a = b";
        Scanner scanner = null;

        try {
            double a, b;

            scanner = new Scanner(System.in);
            System.out.println("Insert the first number:");
            a = Double.parseDouble(scanner.nextLine());

            System.out.println("Insert the second number:");
            b = Double.parseDouble(scanner.nextLine());

            if (a > b) {
                System.out.println("� > b");;
            }
            if (a < b) {
                System.out.println("� < b");;
            }
            if (a == b) {
                System.out.println("� = b");;
            }
        } catch (NumberFormatException e) {
            System.out.println("Bad format");
        }
        scanner.close();

    }
}
