import java.util.Scanner;
// ������� ���������, ����������� � ���������� �� �����, �������� �� ����� ����� ���������� � ���������� n, ������ ���� ��������.


public class Chetnoe {
    public static void main(String[] args) {
        System.out.println("������� ����� n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            System.out.println((n % 2 == 0) ? "����� " + n +" ������" : "����� " + n +" ��������");
        }
    }