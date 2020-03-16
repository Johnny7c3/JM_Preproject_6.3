package ru.javamentor.preproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KosheiTheDeathless {
    private Ocean1 ocean;

    @Autowired
    public KosheiTheDeathless(Ocean1 ocean) {
        this.ocean = ocean;
    }

    public String getRulesByDeath() {
        return ocean.toString();
    }
}
