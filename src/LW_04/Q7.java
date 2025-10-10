package LW_04;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a Value");
        num = input.nextInt();
        while (num>0){
            int count=0;
            int temp;
            temp = num;
            while (temp != 0) {
                count += 1;
                temp = temp/10;
            }
            System.out.println(num + " has "+ count + " digits");
            System.out.println("Enter another value for num");
            num = input.nextInt();
        }
    }
}
