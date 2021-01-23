package day2;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ведите диапазон из 2х чисел а и б");
        int a = s.nextInt();
        int b = s.nextInt();
        double c;
        double d;

        if (a >= b) System.out.println("не корректный ввод");
        else {
            for (; a < b; a++) {

                c = a % 5;
                d = a % 10;
                if (c == 0 && !(d == 0)) {
                    System.out.println(a);
                }
            }
        }
    }
}