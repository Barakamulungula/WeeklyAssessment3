package com.company.Question_1;

public class Dog extends Animal{
    private String breed;
    private boolean likesWalks;

    public Dog() {
    }

    public Dog(int numLegs, boolean hasTail, String breed, boolean likesWalks) {
        super(numLegs, hasTail);
        this.breed = breed;
        this.likesWalks = likesWalks;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }
}
