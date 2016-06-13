package com.company;


public class Cell {
    private int x;
    private int y;
    private int minimaxValue;

    @Override
    public String toString() {
        return "("+this.x+" , "+this.y +")";
    }

    public void setMinimaxValue(int minimaxValue) {
        this.minimaxValue = minimaxValue;
    }

    public int getMinimaxValue() {
        return minimaxValue;
    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;

    }
}
