package com.ohgiraffers.section07.singleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Eager 생성됨");
    }

    public static EagerSingleton getInstance() {
        return singleton;
    }

}
