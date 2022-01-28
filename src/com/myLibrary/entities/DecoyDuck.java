package com.myLibrary.entities;

import com.myLibrary.Behavios.FlyNoWay;
import com.myLibrary.Behavios.MuteQuack;
import com.myLibrary.Behavios.Squeak;
import com.myLibrary.Duck;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public String Display() {
        return getClass() + " ___ " + flyBehavior.getClass() + " ___ " + quackBehavior.getClass();
    }
}