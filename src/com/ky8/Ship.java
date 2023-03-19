package com.ky8;

/**
 * You are a leader of a small pirate crew. And you have a plan. With the help of OOP you wish to make a pretty efficient system to identify ships with heavy booty on board!
 *
 * Unfortunately for you, people weigh a lot these days, so how do you know if a ship is full of gold and not people?
 *
 * You begin with writing a generic Ship class / struct:
 *
 * public class Ship {
 *     private final double draft;
 *     private final int crew;
 *
 *     public Ship(double draft, int crew) {
 *         this.draft = draft;
 *         this.crew = crew;
 *     }
 * }
 * Every time your spies see a new ship enter the dock, they will create a new ship object based on their observations:
 *
 * draft - an estimate of the ship's weight based on how low it is in the water
 * crew - the count of crew on board
 * Ship titanic = new Ship(15, 10);
 *
 * You have access to the ship "draft" and "crew". "Draft" is the total ship weight and "crew" is the number of humans on the ship.
 *
 * Each crew member adds 1.5 units to the ship draft. If after removing the weight of the crew, the draft is still more than 20, then the ship is worth looting. Any ship weighing that much must have a lot of booty!
 */

abstract class Ships{
    boolean isWorthIt() {
        return false;
    }
}

public class Ship extends Ships {
    private double draft;
    private int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    @Override
    public boolean isWorthIt() {
        return (this.draft - (this.crew * 1.5)) > 20 ? true : false;
    }
}
