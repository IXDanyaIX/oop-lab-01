package org.laba;

public class Hero {
    public String name;
    private Locomotion loc;
    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, Locomotion loc){
        this.name = name;
        this.loc = loc;
    }

    public void setLocomotion(Locomotion loc){
        this.loc = loc;
    }

    public void move(){
        loc.move();
    }
}
