package day2;

import java.util.Scanner;

public class day2_task4 {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);

        double x=s.nextDouble();

        double y;

        if (x>=5) System.out.println(y=(x*x-10)/(x+7));
        else if (-3<x && x<5) System.out.println(y=(x+3)*(x*x-2));
        else System.out.println(420);



    }
}
