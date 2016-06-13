package com.company;

/**
 * Created by HEART on 06-06-2016.
 */
public enum Player {
    COMPUTER("X"), USER("O"), NONE("-");
    private Player(String text){
        this.text= text;
    }
    private final String text;

    @Override
    public String toString() {
        return this.text;
    }
}
