package com.myLibrary.Behavios;

import com.myLibrary.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String Fly() {
        return "Хлоп хлоп хлоп";
    }
}
