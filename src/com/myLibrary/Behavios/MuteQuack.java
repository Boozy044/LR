package com.myLibrary.Behavios;

import com.myLibrary.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String Quack() {
        return "";
    }
}
