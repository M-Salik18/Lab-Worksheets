package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimetres: ");
        double inputCm = scanner.nextDouble();

        double CM_PER_INCH = 2.54;
        int INCHES_PER_FOOT = 12;
        double CM_PER_FOOT = INCHES_PER_FOOT * CM_PER_INCH;

        int feet = (int)(inputCm / CM_PER_FOOT);

        double remainingAfterFeetCm = inputCm - feet * CM_PER_FOOT;

        int inches = (int)(remainingAfterFeetCm / CM_PER_INCH);

        double remainingCm = remainingAfterFeetCm - inches * CM_PER_INCH;


        System.out.println(inputCm + " cm is equivalent to:");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
        System.out.printf("and %.2f centimetres%n", remainingCm);

    }
}
