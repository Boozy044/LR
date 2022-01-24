package com.myLibrary.classes;

public class DecoyDuck extends Duck {
    @Override
    public String Display() {
        return "Display " + getClass();
    }
}