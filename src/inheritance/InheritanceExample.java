package inheritance;

public class InheritanceExample {

    protected int gear;
    protected int speed;

    public InheritanceExample(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void upSpeed(int increment){
        speed += increment;
    }

    public void lowSpeed(int decrement){
        speed -= decrement;
    }
}
