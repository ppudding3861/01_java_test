package com.ohgiraffers.section04.overflow;

public class Application01 {

    public static void main(String[] args){

        // 자료형 별 값의 최대 범위를 벗어나는 경우 발생한 carrt를 버림처리하고 sing bit을 반전시켜 최소값으로 순환시킴

        byte num1= 127;
        System.out.println("byte num : " + num1);
        num1++;

        System.out.println("byte num : " + num1);


        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println("firstNum * scondNum = " + (multi));
        //2,147,483,647 ~ -2,147,483,648  int가 표현할 수 있는 값

        long longmulti = firstNum * secondNum;
        System.out.println("first num * secondNum = " + longmulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);

        /*
        * 10
        * 10 + 10
        * 20
        * */

    }
}
