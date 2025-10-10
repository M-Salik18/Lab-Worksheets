package LW_04;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a value");
        int num = input.nextInt();
        while (num != rand) {
            if (num < rand) {
                System.out.println("Enter a higher value");
            } else {
                System.out.println("Enter a lower value");
            }
            num = input.nextInt();
        }
        System.out.println("You have guessed it correctly");
    }
}
