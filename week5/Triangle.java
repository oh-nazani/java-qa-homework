package week5;

/*.Write a Triangle class which has a sideA, sideB, sideC.
     write getters and setters for that,all sides must be in range 1 - 20
     define constructor
     also your class must have an isTriangleValid() private method.(sum of any two sides must exceed third side)
     also add a method which will check if your triangle is right or not.*/

public class Triangle {
    private int sideA, sideB, sideC;

    public void setSideA(int sideA) {
        if (sideA >= 1 && sideA <= 20) {
            this.sideA = sideA;
        }
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideB(int sideB) {
        if (sideB >= 1 && sideB <= 20) {
            this.sideB = sideB;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideC(int sideC) {
        if (sideC >= 1 && sideC <= 20) {
            this.sideC = sideC;
        }
    }
    public int setSideC(){
        return sideC;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
