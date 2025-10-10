package LW_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        Integer number = input.nextInt();
        while (number>0){
            Integer i=0;
            Integer num = number;
            while (num%10>0){
                i+=1;
                num=num/10;
            }
            System.out.println(number + " has " + i + " digits");
            System.out.println("Enter another number: ");
            number = input.nextInt();
        }
    }
}
