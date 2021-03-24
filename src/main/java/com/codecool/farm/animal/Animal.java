package com.codecool.farm.animal;

public abstract class Animal {
    private int size;

    protected Animal() {
    }

    public int getSize() {
        return size;
    }

    public void increaseSize(int size) {
        this.size += size;
    }

    public abstract void feed();
}
