package com.ohgiraffers.section01.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {

    /*
     * A학생의 평균 점수를 구하는 프로그램을 만들어 주세요
     * 시험의 과목은 5개로 점수는 정수 단위 입니다.
     * 5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
     * 예) A학생의 수학 : 90점, 영어 : 80점, 국어 : 100점, 과학 : 79점, 사회 : 80점이며 평균은 x입니다.
     * */

    // A학생의 점수를 5개를 입력한다.
    // 각 점수를 배열로 저장한다.
    // 5개의 과목을 평균으로 구하는 식을 만든다.
    // 화면에 출력한다.



    public void avg() {
        // 평균 = 합계 / 과목 수
        // 과목 5개점수 입력 받기

    Scanner sc = new Scanner(System.in);
    int[] score = new int[5];
    int result = 0;
    for (int i = 0; i < score.length; i++) {
        score[i] = sc.nextInt();
        result += score[i];

    }
    double avg = result / score.length;

    String[] subject = {"수학", "영어", "국어", "과학", "사회"};
    for (int i = 0; i < score.length; i++) {
        System.out.println(subject[i]+ " : " + score[i] + " ");

    }
    System.out.println("평균점수 : " + avg);


    }

     // 5명의 학생의 이름과 키와 나이,성별을 입력 받아 각 학생의 정보를 출력한다.
    // 학생의 정보를 입력 한다.
    // 배열에 정보를 담는다.
    // 5번 반복한다.
    // 학생 1의 정보를 출력한다.
    // 5번 반복한다.

//메서드를 제작
    public void tall() {



        Scanner sc = new Scanner(System.in);
        String[] info = new String[4];
        int[] info2 = {1,2,3,4,5};


            for (int x = 0; x < info2.length; x++) {


                System.out.println(info2[x] + "번째 학생의 정보 입력");
                String[] infomation = {"이름", "나이", "성별", "키"};
                for (int i = 0; i < info.length; i++) {

                    System.out.println(info2[x] + "번학생" + infomation[i] + " : ");
                    info[i] = sc.nextLine();


                }
            }


            for (int x = 0; x < info2.length; x++) {

                System.out.println("<" + info2[x] + "번째 학생 정보>");
                String[] infomation = {"이름", "나이", "성별", "키"};
                for (int i = 0; i < info.length; i++) {
                    System.out.println(infomation[i] + " : " + info[i]);

                }

            }


        }



}
