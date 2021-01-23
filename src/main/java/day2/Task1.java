package day2;
import java.util.Scanner;

public class Task1 {
    public static void main (String args[]) {

        Scanner s=new Scanner (System.in);

        System.out.println("введите этаж");
        int x=s.nextInt();

        if (1<=x && x<=4) System.out.println("Малоэтажный дом от 1 до 4-"+x);

        else if (5<=x && x<=8) System.out.println("Среднеэтажный дом от 5 до 8-"+x);

        else if(x>9) System.out.println("Многоэтажный дом >9-"+x);
        else System.out.println("Ошибка ввода");
    }
}
