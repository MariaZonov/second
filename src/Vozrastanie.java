// � ��� ���������� a, b � c ���� �������� ������������� ��� ����� ������� �������� ����� ����� �����.
// ������� ���������, ������� ���������� ����� � ���������� ����� �������, ����� ��� ������ �� ����� ������������������ a, b � c ��������� ������ ������������.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vozrastanie {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("������� ����� a");
            int a = sc.nextInt();

            System.out.println("������� ����� b");
            int b = sc.nextInt();

            System.out.println("������� ����� c");
            int c = sc.nextInt();

            System.out.println("����� � ���������� a, b � c: " + a + " " + b + " " + c);
            System.out.println(" ");
            if (a < b & a < c) {
                if (b < c) System.out.println("������������ ������������������ " + a + " " + b + " " + c);
                else System.out.println("������������ ������������������ " + a + " " + c + " " + b);
            }
            if (b < a & b < c) {
                if (a < c) System.out.println("������������ ������������������ " + b + " " + a + " " + c);
                else System.out.println("������������ ������������������ " + b + " " + c + " " + a);
            }
            if (c < a & c < b) {
                if (a < b) System.out.println("������������ ������������������ " + c + " " + a + " " + b);
                else System.out.println("������������ ������������������ " + c + " " + b + " " + a);

            }
        } catch (InputMismatchException e) {
            System.out.println("�������� ����");
        } catch (NumberFormatException e) {
            System.out.println("�������� ������");
        }
    }
}


