//������� ���������, ��������� �� ����� �������� ��������������� ���������� ����������� ����� � ��� ���������� �����. ������� ������ ���������:
//� ����� 208 ���������� ����� 8. � ����� 774 ���������� ����� 7. � ����� 613 ���������� ����� 6

import java.util.Random;
public class NaibolshayaZifra{
    public static void main(String[] args){
        Random rnd=new Random();
                int x= rnd.nextInt(899) +100;
                int n=x%10;
                int m=(x/10)%10;
                int l=(x/100)%10;
                if(n>=m&n>l||n>m&n>=l){
                    System.out.println("� ����� "+x+" ���������� ����� " +n);
                }
                else {
                    if (m>n&m>=l) {
                        System.out.println("� ����� "+x+" ���������� ����� " +m);
                    }
                    else {
                        System.out.println("� ����� "+x+" ���������� ����� " +l);
            }
        }
    }
}