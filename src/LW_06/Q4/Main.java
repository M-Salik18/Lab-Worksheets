package LW_06.Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[20];
        int count = 0;

        while (true) {
            System.out.print("Enter pet name (or type STOP to finish): ");
            String name = input.next();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter type (c for Cat, d for Dog): ");
            char type = input.next().charAt(0);

            Pet p;

            if (type == 'c' || type == 'C') {
                Cat c = new Cat();
                c.setName(name);

                System.out.print("Enter coat color of the cat: ");
                String color = input.next();
                c.setCoatColour(color);

                p = c;

            } else if (type == 'd' || type == 'D') {
                Dog d = new Dog();
                d.setName(name);

                System.out.print("Enter weight of the dog: ");
                double weight = input.nextDouble();
                d.setWeight(weight);

                p = d;

            } else {
                System.out.println("Invalid type. Try again.");
                continue;
            }

            pets[count] = p;
            count++;
        }

        // ---- Output Section ----

        System.out.println("\n--Cats--");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                Cat c = (Cat) pets[i];
                System.out.println("Name: " + c.getName() + " | Coat Color: " + c.getCoatColour());
            }
        }

        System.out.println("\n--Dogs--");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                Dog d = (Dog) pets[i];
                System.out.println("Name: " + d.getName() + " | Weight: " + d.getWeight());
            }
        }
    }
}



