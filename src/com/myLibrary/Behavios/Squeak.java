package com.myLibrary.Behavios;

import com.myLibrary.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public String Quack() {
        return "Пи пи пи";
    }
}
