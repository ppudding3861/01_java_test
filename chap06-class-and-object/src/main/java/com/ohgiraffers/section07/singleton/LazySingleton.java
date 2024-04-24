package com.ohgiraffers.section07.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton(){
        System.out.println("lazy 생성됨");
    }

    public static LazySingleton getInstance(){
//        System.out.println("lazy getinstance 호출됨");
        if(lazy == null){
//            System.out.println("lazy 생셩됨");
            lazy = new LazySingleton();
        }
//        System.out.println("lazy 반환됨");
        return lazy;
    }

}
