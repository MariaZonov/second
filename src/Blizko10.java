import java.util.InputMismatchException;
import java.util.Scanner;
// ������� ���������, ��������� �� ����� ��������� � 10 �� ���� �����, ���������� � ���������� m � n. ��������, ����� ����� 8 � 11 ��������� � ������ ����� 10


public class Blizko10 {
    public static void main(String[] args) {
        try {
            System.out.println("������� ����� a");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            System.out.println("������� ����� b");
            int b = sc.nextInt();

            int x = 10;
            int y = Math.abs(a - x);
            int z = Math.abs(b - x);
            if (z == y) {
                System.out.println("����� " + a + " � " + b + " ������������ �� " + x);
            }
            if (y > z) {
                System.out.println("����� " + b + " ����� � " + x);
            }
            if (y < z) {
                System.out.println("����� " + a + " ����� � " + x);
            }
        } catch (InputMismatchException e) {
            System.out.println("Bad action! Try once more.");
        }
    }
}