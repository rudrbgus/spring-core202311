package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hotel {

    // 의존관계 : 어떤 객체가 어떤 객체를 필요로 하는 것
    private Restaurant restaurant;
    private Chef chef;
    @Autowired
    public Hotel(@Qualifier("ar") Restaurant restaurant,@Qualifier("kc") Chef chef) {
        this.restaurant = restaurant;
        this.chef = chef;
    }

    // 레스토랑 예약 기능
    public void reserve(){
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s입니다.\n",
                restaurant.getClass().getSimpleName(),
                chef.getClass().getSimpleName());
        restaurant.order();
    }
}