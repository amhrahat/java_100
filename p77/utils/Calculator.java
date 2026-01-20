package p77.utils;
import p77.geometry.Circle;
import p77.geometry.Rectangle;


public class Calculator {
    public static void main(String[] args) {
        Circle cir1 = new Circle(4);
        Rectangle rec1 = new Rectangle(3,4);

        double areaOfCircle = Math.PI * cir1.getRadius() * cir1.getRadius();
        System.out.println(areaOfCircle);

        float areOfRectangle = rec1.getSideA() * rec1.getSideB();
        System.out.println(areOfRectangle);
    }
}
