
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int a;
        long b = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("������� ����������� ����� a");
        if (s.hasNextInt()) {
            a = s.nextInt();
            for (int i = a; i > 0; i--) {
                b *= i;
            }
            System.out.println("��������� ����� " + a + " ����� " + b);
        } else
            System.out.println("�������� ����");
    }
}
