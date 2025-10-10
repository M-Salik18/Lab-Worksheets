package LW_02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        for (int i=0; i<5;i++){
            System.out.println("Enter the "+(i+1)+"th value for the array");
            num[i]= input.nextInt();
        }

        int temp1 = num[0];
        for (int i = 1; i < 5; i++) {
            if (num[i] > temp1) {
                temp1 = num[i];
            }
        }

        int temp2 = 0;
        for (int k=0;k<5;k++){
            if (num[k]<temp1 && num[k]>temp2){
                temp2 = num[k];
            }
        }
        System.out.println("the second largest value is: "+temp2);
    }
}

