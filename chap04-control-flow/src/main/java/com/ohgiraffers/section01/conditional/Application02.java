package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// 프로그램내에서 모두가 사용할 수 있는 application02라는 클래스를 선언한다.
public class Application02 { // application02의 시작
    // 프로그램이 시작시 바로 사용할 수 있또록 static 영역에 main이라는 함수를 만들고 문자열 배열의 타입을 가진 args라는 변수를 선언한다.
    public static void main(String[] args) { // main의 시작

        // D_switch라는 자료형을 가진 d 변수를 만들고 D_switch 타입으로 값을 제공한다.
        // D_switch는 사용자 정의 자료형으로써 타입은 우리가 만든 D_switch를 확인해야한다.
        D_switch d = new D_switch();
        // d 변수가 가지고 있는 testSimple메소드를 실행한다.
        //d.testSimpleSwitchStatement();
        //
        // double result = d.switchCalculator();
         //System.out.println(result);

        // 0. D_switch를 만든다.
        // 1.  값을 반환 받는다.
        // 2. 화면에 출력한다.

        // 1. 학생의 성적을 입력받는다
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요 : ");
        // 2. 입력받은 성적을 매개변수로 전달한다.
        int first = sc.nextInt();
        d.test(first);


    } // main의 종료

}// applixation02의 종료
