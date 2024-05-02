package com.ohgiraffers.section01;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {

        /*
         * 1. 정수 변수 선언 ( int a= 낮 올라가는 ,b = 밤에 미끄러지는 ,v = 나무막대 높이)
         * 2. 변수 초기화 ( 1 <= b <= a <= v <= 1000000000)
         * 3. 반복문을 통해 낮에 올라가는 횟수 구하기
         * 4. 횟수는 날짜이며, 날짜를 출력한다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("낮에 올라가는 높이 : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("밤에 미끄러지는 길이 : ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("나무막대 높이 : ");
        int v = sc.nextInt();

        if(1 < b && b < a && a < v && v <= 1000000000) {

            int day = (v - b) / (a - b);

            if ((v - b) % (a - b) != 0) {
                day++;
            }
            System.out.println("도착하는 일수 : " + day);
        }
        
    }
    }

