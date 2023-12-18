//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. Примеры работы программы:
//В числе 208 наибольшая цифра 8. В числе 774 наибольшая цифра 7. В числе 613 наибольшая цифра 6

import java.util.Random;
public class NaibolshayaZifra{
    public static void main(String[] args){
        Random rnd=new Random();
                int x= rnd.nextInt(899) +100;
                int n=x%10;
                int m=(x/10)%10;
                int l=(x/100)%10;
                if(n>=m&n>l||n>m&n>=l){
                    System.out.println("В числе "+x+" наибольшая цифра " +n);
                }
                else {
                    if (m>n&m>=l) {
                        System.out.println("В числе "+x+" наибольшая цифра " +m);
                    }
                    else {
                        System.out.println("В числе "+x+" наибольшая цифра " +l);
            }
        }
    }
}