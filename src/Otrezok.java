

//������� ���������, ������� ����� ��������� ������ �� �������� ��������� �� ������� [5;155] ����� ����� � �������� (25;100) � �������� ��������� �� �����.
//������� ������ ���������:
//����� 113 �� ���������� � ��������� (25,100).
// ����� 72 ���������� � ��������� (25,100).
//����� 25 �� ���������� � ��������� (25,100)
// ����� 155 �� ���������� � ��������� (25,100)
import java.util.Random;


    public class Otrezok {
        public static void main(String[] args) {

            Random rnd = new Random(System.currentTimeMillis());
            int min = 5;
            int max = 155;
            int number = min + rnd.nextInt(max - min + 1);

            if (number>=25 && number<=100) {
                System.out.println("����� " + number + " ���������� � ��������� (25,100).");
            }
            else {
                System.out.println("����� " + number + " �� ���������� � ��������� (25,100).");
            }
        }
    }
