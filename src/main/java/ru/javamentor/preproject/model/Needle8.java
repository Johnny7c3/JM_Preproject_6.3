package ru.javamentor.preproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle8 {
    private Death9 death;

    @Autowired
    public Needle8(Death9 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return death.toString();
    }
}
