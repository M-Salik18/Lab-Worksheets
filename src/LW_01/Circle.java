package LW_01;

import java.util.Scanner;

public class Circle {
    int Radius;

    Circle(double rad){
        Radius = rad;
    }

    public double computeArea(){
        double area = 3.14 * Radius * Radius;
        return area;
    }

    public double computeCircumference(){
        double circum = 2 * 3.14 * Radius;
        return circum;
    }
     

}

