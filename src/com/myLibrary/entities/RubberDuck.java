package com.myLibrary.entities;

import com.myLibrary.Behavios.FlyNoWay;
import com.myLibrary.Behavios.FlyWithWings;
import com.myLibrary.Behavios.Quack;
import com.myLibrary.Behavios.Squeak;
import com.myLibrary.Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public String Display() {
        return getClass() + " ___ " + flyBehavior.getClass() + " ___ " + quackBehavior.getClass();
    }
}
