package day3;
import java.util.Scanner;

public class day3_task3 {
    public static void main (String args[]){

        Scanner s=new Scanner(System.in);

        for (int i = 1; i < 6; i++) {

            double a=s.nextInt();
            double b=s.nextDouble();

            if (b==0) {System.out.println("Деление на 0");continue;}
            System.out.println(i+"-"+a/b);


        }

    }
}
