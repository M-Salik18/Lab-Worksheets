package LW_01;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = input.next();
        int len = name.length();
        int indexOfMiddleChar = len/2 ;
        System.out.println(name.substring(indexOfMiddleChar,indexOfMiddleChar+1));
    }
}
