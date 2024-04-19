package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Test test = new Test();
        test.tall();
    }
}
        /*
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        * */

        /*
        * 배열의 사용 이유
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        * 1. 연속된 메로리 공간을 관리할 수 없다.
        * 2. 반목문을 이용한 연속 처리가 불가능하다.
        * */
//
//        String bread = "식빵";
//        String bread1 = "식빵";
//        String bread2 = "식빵";
//        String bread3 = "식빵";
//        String bread4 = "식빵";
//        String bread5 = "식빵";
//        String bread6 = "식빵";
//        String bread7 = "식빵";
//        String bread8 = "식빵";
//        String bread9 = "식빵";
//
//        // 배열을 사용한다면
//        // 배열의 표현식
//        // 자료형[] 변수명 = new 자료형[길이];
//
//        String[] breads = new String[10];
//        breads[0] = "식빵";
//        breads[1] = "식빵";
//        breads[2] = "식빵";
//        breads[3] = "식빵";
//        breads[4] = "식빵";
//        breads[5] = "식빵";
//        breads[6] = "식빵";
//        breads[7] = "식빵";
//        breads[8] = "식빵";
//        breads[9] = "식빵";
//
////        for(int i = 0; i <= 10; i++){
////            System.out.println(breads[i]);
////        }
//        // 선언식
//        int[] iarr = new int[5];     // 0 ~ 4
//        char carr[] = new char[10];  // 0 ~ 9
//        iarr[2] = 10;
//        System.out.println(iarr[0]);
//
//        int result = 100;
//
//        int newArray[] = new int[result];
//
//        for(int i =0; i < newArray.length; i++){
//
//            newArray[i] = 10;
//
//        }
//
//        // 5명의 학생이 6개의 과목을 시험을 봤다
//        //
//
//    }



