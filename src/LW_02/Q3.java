package LW_02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        Integer noOfRows= input.nextInt();
        for(Integer row=1; row<=noOfRows; row++){
            for (Integer space = 1; space <= noOfRows-row; space++){
                System.out.print(" ");
            }
            for (Integer i=1; i<=(2*row -1 ); i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
