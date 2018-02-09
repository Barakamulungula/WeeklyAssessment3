package com.company.Question_1;

public class Animal {

    private int numLegs;
    private boolean hasTail;

    public Animal(int numLegs, boolean hasTail) {
        this.numLegs = numLegs;
        this.hasTail = hasTail;
    }

    public Animal() {
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
