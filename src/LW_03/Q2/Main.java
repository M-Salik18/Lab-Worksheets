package LW_03.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        temp temperature1 = new temp(fahrenheit);
        temperature1.setCelsius();
        System.out.println(fahrenheit+ " fahrenheit is "+temperature1.toCelsius()+" in celsius." );
    }

}
