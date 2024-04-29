package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    private int nonStaticdField;

    private static int staticFiled;

    public Product() {
    }

    public void nonStatidMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 호출함 ");

    }
    public static void statidMethod(){
        System.out.println("Product 클래스의 staticMethod 호출함");

    }

    public abstract void absMethod();

}
