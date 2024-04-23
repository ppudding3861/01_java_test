package com.ohgiraffers.section04.abstrantion.problem3;

public class Application01 {
    public static void main(String[] args) {
        Car ram = new Car();
        ram.setName("람보르기니");
        Car po = new Car();
        po.setName("포르쉐");

        CarRacer gang = new CarRacer();
        gang.setCar(ram);
        gang.myCarInfo();

        gang.startUp();
        gang.go();
        gang.stop();
        gang.turnOff();

    }

}
