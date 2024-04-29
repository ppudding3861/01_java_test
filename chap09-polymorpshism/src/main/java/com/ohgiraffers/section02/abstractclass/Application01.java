package com.ohgiraffers.section02.abstractclass;

public class Application01 {

    public static void main(String[] args){

        /*
        * 추상클래스와 추상 메소드
        * 추상메소드를 0개 이상 포함하는 클래스를 추상 클래스라고 한다.
        * 추상클래스는 인스턴스를 생성할 수 없다.
        * 추상클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를 이용해서 인스턴스를 생성해야한다.
        * 이 때 추상클래스는 상위 타입으로 사용될 수 있으며, 다형성을 이용할 수 있따.
        *
        * 추상클래스에 작성한 추상 메소드는 반드시 후손이 오버라이딩 해서 작성해야하며,
        * 후손 클래스들의 메소드들의 공통 인터페이스로의 역할을 수행할 수 있따.
        * 추상클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메소드는
        * 다형성이 적용되어 동적바인딩에 의해 다양한 응답을 할 수 있게 된다.
        *
        * 추상클래스를 상속받아 수현할 때는 extends 키워드를 사용하며
        * 자바에서는 extends로 클래스를 상속받을 시 하나의 부모 클래스로만 가질 수 있다.(단일 상속)
        *
        * 추상메소드라ㅣㄴ
        * 메소드의 선언부만 있고 구현부가 없는 메소드를 추상메소드라고 한다.
        * 추상메서도의 경우 반드시 abstract키워드를 메소드 헤드에 작성해야한다.
        * public abstract class Product(){
        * public abstract void method();
        * }
        * */
//        Product product = new Product(); 추상클래스는 인스턴스 생성 불가
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.printSmartPhone();
        smartPhone.absMethod();

        Product product2 = new Product() {
            @Override
            public void absMethod() {

            }
        };
        product2.nonStatidMethod();
        product2.absMethod();


        Product product = new SmartPhone();
        product.absMethod();
        product.nonStatidMethod();
    }
}
