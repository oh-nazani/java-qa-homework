package abstraction;

//Write a Car class which extends Vehicle class and implements abstract
//methods of parent class and sets speed and count properties.

public class Car extends Vehicle {
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public void setCountOfPeople(int countOfPeople) {
        super.setCountOfPeople(countOfPeople);
    }

    @Override
    void start() {
        System.out.println("Car engine is turned on.");
    }

    @Override
    void stop() {
        System.out.println("Car engine is turned off.");
    }
}
