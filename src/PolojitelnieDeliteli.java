// �������� �� ����� ��� ������������� �������� ������������ �����, ��������� ������������� � ����������.
import  java.util.*;

public class PolojitelnieDeliteli {
    public static void main(String[] args){
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("������� ����������� ����� a ");
        if(s.hasNextInt()) {
            a = s.nextInt();
            System.out.print("���������� ����� "+a+" ��������: ");
            for(int i=a;i>0;i--){
                int b=a%i;
                if(b==0) {
                    System.out.print(i+" ");
                }
            }
        }
        else System.out.println("������. ������� �� �����");

    }
}

