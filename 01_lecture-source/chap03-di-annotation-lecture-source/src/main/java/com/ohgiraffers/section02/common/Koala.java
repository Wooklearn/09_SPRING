package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Koala implements Animal {
    @Override
    public void eat() {
        System.out.println("코알라가 나뭇잎을 먹어요!!");
    }
}
