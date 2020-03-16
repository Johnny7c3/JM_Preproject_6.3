package ru.javamentor.preproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.javamentor.preproject.model.Island2;
import ru.javamentor.preproject.model.Wood3;

@Configuration
@ComponentScan("ru.javamentor.preproject")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}
