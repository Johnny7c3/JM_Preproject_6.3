package ru.javamentor.preproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck6 {
    private Egg7 egg;

    @Autowired
    public Duck6(Egg7 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "в утке — яйцо, " + egg.toString();
    }
}
