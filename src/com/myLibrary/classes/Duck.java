package com.myLibrary.classes;

public abstract class Duck {
    public String Quack() {
        return "Quack " + getClass();
    }

    public String Swim() {
        return "Swim " + getClass();
    }

    public abstract String Display();
}

