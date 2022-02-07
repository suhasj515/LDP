package com.spring.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] data={
            "good fortune for today",
            "not so good fortune for today",
            "Journey is reward"
    };

    Random random=new Random();
    @Override
    public String getFortune() {
        int index= random.nextInt(data.length);
        return data[index];
    }
}
