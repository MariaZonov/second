import java.util.Arrays;


//Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа.
public class ChetnieChisla {

    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) a++;
        }
        int[] Mas = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
    }
}