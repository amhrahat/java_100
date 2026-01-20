package p77.geometry;

public class Rectangle {
    private float sideA;
    private float sideB;

    public float getSideA(){
        return this.sideA;
    }

    public float getSideB(){
        return this.sideB;
    }

    public void setSideA(float sideA){
        this.sideA = sideA;
    }

    public void setSideB(float sideB){
        this.sideB = sideB;
    }

    public Rectangle(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB; 
        
    }
}
