package com.spring.core.chap02;

import org.springframework.stereotype.Component;

@Component(value = "kc")
public class KimuraChef implements Chef {
    @Override
    public void cook(){
        System.out.println("스시명장 키무라입니다.");
    }
}
