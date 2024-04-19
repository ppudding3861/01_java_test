package com.ohgiraffers.section03.branching;

public class A_break {

    /*
    * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
    * */
    public void testSimpleBreakStatement(){

        int i = 2; // int에 정수 초기화
        test:
        while(true){ // 참일때 아래의 구문 계속 실행


            int x= 0; // x초기화

                while(x <=9 ){ //x가 9보다 작거나 같으면 실행 반대로 9보다 크면 멈춤

                    if(i>=10){ // i가 10 보다 크거나 같으면 멈춤
                    break test;

                    }

                    if(x>=5){
                        break; // x는 5보다 크거나 같은 때 종료
                    }
                    if (x == 0){
                        x++;
                        continue;
                    }
                    System.out.println(i + " * " + x + " = " + i*x);
                    x++;

                }

                i++;

        }
    }
}
