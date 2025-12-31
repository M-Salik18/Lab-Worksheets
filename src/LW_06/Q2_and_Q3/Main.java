package LW_06.Q2_and_Q3;

import java.util.Scanner;

//I have also added Q3 part at the end of the code

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
                p = new Cat();
            } else if (type == 'd' || type == 'D') {
                p = new Dog();
            } else {
                System.out.println("Invalid type. Try again.");
                continue;
            }

            p.setName(name);
            pets[count] = p;
            count++;
        }

        System.out.println("\n--- Pet List ---");

        for (int i = 0; i < count; i++) {
            String type;

            if (pets[i] instanceof Cat){
                type = "Cat";
            }
            else {
                type = "Dog";
            }
            System.out.println("Name: " + pets[i].getName() + " | Type: " + type);
        }

        //Q3
        System.out.println("\n--Cats--");
        for (int i=0; i<count; i++){
            if (pets[i] instanceof Cat){
                System.out.println(pets[i].getName());
            }
        }

        System.out.println("\n--Dogs--");
        for (int i=0; i<count; i++) {
            if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName());
            }
        }
    }
}
