package com.java.learning;

public class EnhancedPlayer {
    private String fullName;
    private int health;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health >0 && health <=100){
            this.health = health;
        }
        this.weapon = weapon;
    }
    private void loseHealth(int damage){
        health = health-damage;
        if(health <= 0){
            System.out.println("Player Knocked Out");
        }

    }
    public int getHealth(){
        loseHealth(60);
        return health;
    }
}
