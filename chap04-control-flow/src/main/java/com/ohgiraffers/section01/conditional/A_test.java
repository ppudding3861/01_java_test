package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_test {
    /*
     * 계산기 만들기
     * 두 수와 연산기호를 입력받아
     * 수식에 맞는 연산을 수행하는 프로그램을 만들어주세요
     * */
    /*
     * Calculator 매서드 제작
     * 접근제한 반환타입 매서드명(){}
     * 사용자 입력 코드
     * int num1, int num2, String symbol
     * if(symbol == + ) {
     *   더하는 연산식으로 출력
     * }
     * 위의 식으로 다음 else if
     * */

    public void Calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("수식을 입력하세요 : ");
        char symbol = sc.nextLine().charAt(0);
        System.out.print("2번째 숫자를 입력하세요 :");
        int num2 = sc.nextInt();


        if (symbol == '+') {

            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        } else if (symbol == '-') {

            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        } else if (symbol == '*') {

            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        } else if (symbol == '/') {

            System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));

        }else {
            System.out.println("다시 입력하세요");
        }

    }
}

