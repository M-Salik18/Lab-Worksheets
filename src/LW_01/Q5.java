package LW_01;

public class Q5 {
    public static void main(String[] args) {
        Circle outerCircle = new Circle(14);
        Circle innerCircle = new Circle(7);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;
        System.out.println("Area of shaded part is "+ shadedArea);

        double outerCircleCircum = outerCircle.computeCircumference();
        double innerCircleCircum = innerCircle.computeCircumference();
        double shadedCircum = outerCircleCircum - innerCircleCircum;
        System.out.println("Circumference of shaded part is "+ shadedCircum);


    }
}