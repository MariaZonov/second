import java.util.*;
public class Prostoe{
    public static void main(String[] args){
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("������� ����������� �����");
        if(s.hasNextInt()){
            a=s.nextInt();
            for(int i=(int)Math.sqrt(a);i>=1;i--){
                if(a%i==0&i!=1){
                    System.out.println("��������� ����� - ���������");
                    break;
                }
                if(i==1) System.out.println("��������� ����� - �������");
            }
        }
        else System.out.println("�������� ����");

    }
}