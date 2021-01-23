package day2;



import java.util.Scanner;

public class Task3 {
    public static void main(String args[]){

        Scanner s=new Scanner (System.in);

        System.out.println("enter a and b");
        int a=s.nextInt();
        int b=s.nextInt();

        double c;
        double d;

        if (a>b) System.out.println("error");
        else
            while (a<b){
                a++;
                c=a%5;
                d=a%10;
                if(c==0 && !(d==0)) System.out.print(" "+a);
            }
    }
}



