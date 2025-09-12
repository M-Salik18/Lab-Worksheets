package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Name: ");
        String firstname = input.next();

        System.out.println("Enter the Middle Name: ");
        String middleName = input.next();

        System.out.println("Enter the Last Name: ");
        String lastName = input.next();

        System.out.println(lastName+", "+firstname+" "+middleName.substring(0,1)+".");



    }
}
