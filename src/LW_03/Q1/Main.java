package LW_03.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        Temperature temperature1 = new Temperature(celsius);
        temperature1.setFahrenheit();
        System.out.println(celsius+ " celsius is "+temperature1.toFahrenheit()+" in fahrenheit." );
    }

}
