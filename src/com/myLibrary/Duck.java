package com.myLibrary;

import com.myLibrary.interfaces.FlyBehavior;
import com.myLibrary.interfaces.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public String PerformQuack()
    {
        return quackBehavior.Quack();
    }
    public String PerformFly()
    {
        return flyBehavior.Fly();
    }

    public String Swim() {
        return "Буль буль буль";
    }

    public void SetFlyBehavior(FlyBehavior flyby)
    {
        flyBehavior = flyby;
    }
    public void SetQuackBehavior(QuackBehavior quackby)
    {
        quackBehavior = quackby;
    }

    public abstract String Display();


}

