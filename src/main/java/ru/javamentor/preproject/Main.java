package ru.javamentor.preproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javamentor.preproject.config.AppConfig;
import ru.javamentor.preproject.model.KosheiTheDeathless;

public class Main {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        KosheiTheDeathless koshei = context.getBean(KosheiTheDeathless.class);
        
        System.out.println(koshei.getRulesByDeath());
    }
}
