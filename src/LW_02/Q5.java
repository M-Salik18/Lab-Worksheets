package LW_02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.toLowerCase();
        word = word.replaceAll("[^a-z0-9 ]", "");
        word = word.replace(" ", "");
        int left = 0;
        int right = word.length()-1;
        boolean isPalindrome = true;
        while (left<right){
            if (word.charAt(left)!=word.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}
