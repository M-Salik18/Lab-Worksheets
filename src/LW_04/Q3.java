package LW_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a power value for 10 to the power ");
        int pow = input.nextInt();
        System.out.print("10^" + pow + " is ");
        if (pow == 6){
            System.out.println("1 Million");
        } else if (pow == 9) {
            System.out.println("1 Billion");
        } else if (pow ==12) {
            System.out.println("1 Trillion");
        } else if (pow == 15) {
            System.out.println("1 Quadrillion");
        } else if (pow == 18) {
            System.out.println("1 Quintillion");
        } else if (pow == 21) {
            System.out.println("1 Sextillion");
        } else if (pow == 30) {
            System.out.println("1 Nonillion");
        } else if (pow == 100) {
            System.out.println("1 Googol");
        }else
            System.out.println("Unknown");
    }
}
