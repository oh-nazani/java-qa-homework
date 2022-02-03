package abstraction;

//Write an Abstract class Vehicle which have
//1. Speed property
//2.count property (which indicates how many people vehicle can carry)
//3. abstract method void start()
//4. abstract method void stop()

public abstract class Vehicle {
    private int speed;
    private int countOfPeople;

    abstract void start();
    abstract void stop();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public void setCountOfPeople(int countOfPeople) {
        if (countOfPeople > 0) {
            this.countOfPeople = countOfPeople;
        }
    }
}
