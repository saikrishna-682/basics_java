package functionality;

import inheritance.InheritanceExample;

public class InheritanceExampleChild extends InheritanceExample {

    public int seatHeight;
    public InheritanceExampleChild(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;

    }


}
