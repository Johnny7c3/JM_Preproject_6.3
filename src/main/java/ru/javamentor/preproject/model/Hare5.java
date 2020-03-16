package ru.javamentor.preproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hare5 {
    private Duck6 duck;
    
    @Autowired
    public Hare5(Duck6 duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "в зайце — утка, " + duck.toString();
    }
}
