package ru.javamentor.preproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chest4 {
    private Hare5 hare;

    @Autowired
    public Chest4(Hare5 hare) {
        this.hare = hare;
    }

    @Override
    public String toString() {
        return "в сундуке — заяц, " + hare.toString();
    }
}
