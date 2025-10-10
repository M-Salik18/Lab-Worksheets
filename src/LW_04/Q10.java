package LW_04;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                System.out.println(word+" is not a palindrome");
                System.exit(1);
            }
            left+=1;
            right-=1;

        }
        System.out.println(word+" is a palindrome");

    }
}
