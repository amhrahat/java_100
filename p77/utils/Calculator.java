package p77.utils;
import p77.geometry.Circle;
import p77.geometry.Rectangle;


public class Calculator {
    public static void main(String[] args) {
        Circle cir1 = new Circle(4);
        Rectangle rec1 = new Rectangle(3,4);

        float areaOfCircle = cir1.getRadius() * 3.1416f;
        System.out.println(areaOfCircle);

        float areOfRectangle = rec1.getSideA() * rec1.getSideB();
        System.out.println(areOfRectangle);
    }
}
