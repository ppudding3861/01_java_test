package com.ohgiraffers.section01.conditional;

public class ex {
//    배, 사과, 오렌지를 키우고 있는데 각 과일의 하루 생산량은 각각 5, 6, 7개
//1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력
//2)시간당 과일의 생산 갯수를 출력
//
//    단, 과일의 갯수를 저장하는 변수는 int타입으로
//    하루에 생산되는 과일의 총 갯수를 저장하는 변수도 int타입으로
//    시간당 생산 갯수를 저장할 변수는 float타입으로 작성할 것.

    // 1. 각 과일의 하루 생산량을 초기화
    // int pear = 5, int apple = 6, int orange = 7

    // 2. 각 과일을 합쳐 총 합계
    // int total = pear + apple + orange
    // 3. 1시간당 과일의 평균 갯수 수식화
    // float avg = total / 24
    // 4. 출력

    public static void main(String[] args) {
        int pear = 5;
        int apple = 6;
        int orange = 7;

        int total = pear + apple + orange;
        System.out.println(total);
        float avg = (float)total / 24;
        System.out.println(avg);


    }


}
