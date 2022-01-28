package com.myLibrary.Behavios;

import com.myLibrary.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public String Quack() {
        return "Кря кря кря";
    }
}
