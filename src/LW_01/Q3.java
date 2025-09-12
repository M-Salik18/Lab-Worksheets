package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in centimeters: ");
        float cmEntered = input.nextFloat();
        int feet =(int) (cmEntered/12);
        float newcm = cmEntered % 12;
        float in = (float) (newcm/(2.54)) ;
        System.out.println(cmEntered+"cm is: "+feet+"ft "+in+"in");
    }
}
