package ru.javamentor.preproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg7 {
    
    @Autowired
    private Needle8 needle;

    @Override
    public String toString() {
        return "в яйце — игла, " + needle.toString();
    }
}
