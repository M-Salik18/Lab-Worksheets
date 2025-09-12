package LW_01;

import java.util.Scanner;

public class Circle {
    int Ro,Ri;
    public void setRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Outer circle's Radius is: ");
        Ro = input.nextInt();
        System.out.println("Inner circle's Radius is: ");
        Ri = input.nextInt();
    }
    public void ComputeArea(){
        double Ao = (float) (3.14 * Ro * Ro);
        double Ai = (float) (3.14 * Ri * Ri);
        double AShaded = Ao - Ai;
        System.out.println("Area of Outer LW_01.Circle: "+Ao + "m^2");
        System.out.println("Area of inner LW_01.Circle: "+Ai + "m^2");
        System.out.println("Area of shaded area: "+AShaded + "m^2");
    }
    public void ComputeCircumference(){
        double Co = (float) (3.14 * 2 * Ro);
        double Ci = (float) (3.14 * 2 * Ri);
        System.out.println("Circumference of Outer LW_01.Circle: "+Co + "m");
        System.out.println("Circumference of inner LW_01.Circle: "+Ci + "m");
     }

}

