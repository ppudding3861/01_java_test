package com.ohgiraffers.section02.looping;

public class B_while {

    public void testSimpleWhileStatement(){
        /*
        * [while문 표현식]
        * 초기식;
        * while(조건식){
        *   조건식을 만족하는 경우 수행할 구문 (반복할 구문);
        *   증감식;
        * }
        *
        * while(조건식){
        *   조건식을 만족하는 경우 수행할 구문
        *   }
        *
        * */

        int i = 1;
        while(i <= 10){ // 반복해야 하는 대상의 길이를 알 수 없을 때 사용한다.
            System.out.println(i);
            i++;
        }

        for(; i<=10 ;){

        }

    }


    // while문을 이용하여 구구단 만들기


    public void gugudan2(){

        // 1. 초기식 작성
        // 2. while문의 조건식
        // 3. 중첩 while 조건식
        // 4. i * x 연산
        // 5. 출력
        // 6. 중첩 while 증감식
        // 7. while 증감식
        // 8. 중첩 while의 조건 변수 초기화

        int i = 1;
        while( i <= 9 ){ // while 시작
            System.out.println("<"+i + "단 입니다>");

            int x = 1;
            while(x <= 9 ){
                System.out.println(i + " * " + x + " = " + i * x);
                x++;
            }
            i++;

        }  // 종료


    }
}
