package abstraction;

//Write Airplane class which extends Vehicle class and implements
//abstract methods of parent class and sets speed and count properties.

public class Airplane extends Vehicle implements Flyable {
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
        System.out.println("Airplane engine is turned on.");
    }

    @Override
    void stop() {
        System.out.println("Airplane engine is turned off.");
    }

    //Airplane class must also implement Flyable interface
    //and must implement one method from that interface.
    //Implementation of that method  must  take the flight destination countries and distance
    //between them and count how many hours the flight will take.

    @Override
    public int flight(String from, String to, int kilometers) {
        int flightDuration = kilometers / getSpeed();
        System.out.print("Flight duration = ");
        return flightDuration;
    }
}
