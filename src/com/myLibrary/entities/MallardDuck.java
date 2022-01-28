package com.myLibrary.entities;

import com.myLibrary.Behavios.FlyWithWings;
import com.myLibrary.Behavios.Quack;
import com.myLibrary.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String Display() {
        return getClass() + " ___ " + flyBehavior.getClass() + " ___ " + quackBehavior.getClass();
    }
}

