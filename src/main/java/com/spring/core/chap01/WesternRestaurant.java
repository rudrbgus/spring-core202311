package com.spring.core.chap01;

import lombok.NoArgsConstructor;


public class WesternRestaurant implements Restaurant{
    // 의존 객체
    private final Chef chef;
    private FrenchCourse course = new FrenchCourse();

    public WesternRestaurant(Chef chef){
        this.chef = chef;
    }

    // 요리를 주문하는 기능
    public void order(){
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
