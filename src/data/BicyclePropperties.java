package data;

import interfaceexample.Bycycle;

public class BicyclePropperties implements Bycycle {

    private int seatHeight;
    private int gear;
    private int speed;


    public BicyclePropperties(int seatHeight, int startGear, int startSpeed) {
        this.seatHeight = seatHeight;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    @Override
    public void applyBreak(int decrement) {

        speed -= decrement;

    }

    @Override
    public void speedUp(int increment) {

        speed += increment;
    }
}
