package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Spider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = "com.epam.spring.homework1.pet", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Spider.class))
@Configuration
public class PetConfig {
    @Primary
    @Bean
    public Cheetah cheetah1() {
        return new Cheetah();
    }

    @Qualifier("cheetah2")
    @Bean
    public Cheetah cheetah2() {
        return new Cheetah();
    }
}
