package LW_01;

public class Circle {
    int Radius;

    Circle(int rad){
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