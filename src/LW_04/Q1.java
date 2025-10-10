package LW_04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first value");
        a = input.nextInt();
        System.out.println("Enter the second value");
        b = input.nextInt();
        System.out.println("Enter the third value");
        c = input.nextInt();
        if (a>b){
            if (b>c){
                System.out.println("The smallest value is "+ c);
            }else {
                System.out.println("The smallest value is " + b);
            }
        }else if (a>c){
            System.out.println("The smallest value is "+ c);
        }
        else{
            System.out.println("The smallest value is "+ a);
        }
    }
}
