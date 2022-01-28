package com.myLibrary.entities;

import com.myLibrary.Behavios.FlyWithWings;
import com.myLibrary.Behavios.Quack;
import com.myLibrary.Duck;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String Display() {
        return getClass() + " ___ " + flyBehavior.getClass() + " ___ " + quackBehavior.getClass();
    }
}

