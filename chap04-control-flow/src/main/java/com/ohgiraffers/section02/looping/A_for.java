package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){
        /*
        * [for문 표현식]
        * for(초기식; 조건식; 증감식){
        *   // 조건식이 참인 경우 실행할 구문 == 반복할 구문
        * }
        * */
        for(int i = 1; i <= 10; ++i){

            for(int x = 1; x <= 10; x++){
                System.out.println("천원 단위 : " + x);
            }
            System.out.println("만원 단위 : " + i);
        }
    }
    // 구구단을 만들어 주세요!!
    /*
    * 1. 구구단 메서드를 만든다.
    * 2. for문으로 1 ~ 9 단의 계산식을 만든다.
    * 3. for 1~9 까지의 정수를 입력
    * 4. 위의 for문 안에 다시 다른 변순로 1~9까지의 정수를 입력
    * 5. 출력 구문 만듬
    * 3. 반환한다.
    * */

    /*
    *  2의 배수만 출력 한다.
    * 조건문을 만든다.
    * */

    /*
    * i를 기준으로 출력
    * */

    public void gugudan(){

        for(int i = 1; i <= 9; i++){


            System.out.println("<" + i + "단 입니다> ");

            for(int x = 1; x <= 9; x++){

                if(x % i  == 0 && i != 1){

                    System.out.println(i + " * " + x + " = " + i * x);


                }
            }

        }

    }

    public void gugudan1(){

        for(int i = 2; i <= 9; i++){

            System.out.println("<" + i + "단 입니다> ");

            for(int x = 0; x <= 9; x+=i){

                if(x!=0){

                    System.out.println(i + " * " + x + " = " + x * i);


                }
            }

        }

    }

    // 10명의 학생 정보를 입력 받아 화면에 출력해 주세요
    // 이름과 나이
    // 1. 이름과 나이를 입력
    // 2. 출력
    // 2. 10번 반복문을 사용

    public void studentinfo(){


        for(int i = 1; i <= 10; i++){

            Scanner sc = new Scanner(System.in);

            System.out.print(i+"번째 학생의 이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print(i+"번째 학생의 나이를 입력하세요 : ");
            int age = sc.nextInt();

            System.out.println("<"+i+"번째 학생> \n이름은 : " + name + "\n나이는 : " + age);
        }

    }



}
