package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.spring.annotations")
@PropertySource("Sport.properties")
public class SportConfig {


    //define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define bean for swim coach AND inject dependency\
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
