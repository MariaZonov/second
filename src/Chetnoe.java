import java.util.Scanner;
// —оздать программу, провер€ющую и сообщающую на экран, €вл€етс€ ли целое число записанное в переменную n, чЄтным либо нечЄтным.


public class Chetnoe {
    public static void main(String[] args) {
        System.out.println("¬ведите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            System.out.println((n % 2 == 0) ? "„исло " + n +" четное" : "„исло " + n +" нечетное");
        }
    }