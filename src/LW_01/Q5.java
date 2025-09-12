package LW_01;

public class Q5 {
    public static void main(String[] args) {
        Circle outerCircle = new Circle(14);
        Circle innerCircle = new Circle(7);
        
        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = innerCircleArea - outerCircleArea;
        
        double outerCircleCircum = outerCircle.computeCircum();
        double innerCircleCircum = innerCircle.computeCircum();
        double shadedCircum = innerCircleCircum - outerCircleCircum;

       
    }
}
