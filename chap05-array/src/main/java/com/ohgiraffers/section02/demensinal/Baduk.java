package com.ohgiraffers.section02.demensinal;

import java.util.Scanner;

public class Baduk {

    public static void main(String[] main) {
        /*
         * 바둑판 만들기
         * 문자열형 배열 선언한다.
         * 배열의 길이는 19, 19 로 만든다.
         * 반복문으로  가로는 -, 세로는 |
         * 출력한다.
         * */

//        String baduk1[][] = new String[30][30];
//
//        for(int i=0; i<30; i++){
//            for(int j = 0; j < 30; j++){
//                if(i == 0 && j == 0) {
//                    System.out.print(baduk1[i][j] = "┌");
//                }
//                else if (i == 29 && j == 29){
//                    System.out.print(baduk1[i][j] = "┘");
//                }
//                else if(i==0 && j == 29){
//                    System.out.print(baduk1[i][j] = "┐"+ "\n");
//                }
//                else if(i == 29 && j == 0){
//                    System.out.print(baduk1[i][j] = "└");
//                }
//                else if(i == 0){
//                    System.out.print(baduk1[i][j] = "┬");
//                }
//                else if(i==29){
//                    System.out.print(baduk1[i][j] = "┴");
//                }
//                else if(j == 0){
//                    System.out.print(baduk1[i][j] = "├");
//                }
//                else if (j == 29) {
//
//                    System.out.print(baduk1[i][j] = "┤"+"\n");
//                }
//                else {
//                    System.out.print(baduk1[i][j] = "┼");
//                }
//
//
//            }
//
//
//
//        }

        Baduk baduk = new Baduk();
        baduk.baduck();


    }

    public void baduck() {
        String[][] board = new String[19][19];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        String play = "";
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[2];
        int turn = 0;
        while(!play.equals("exit")) {

            System.out.print("첫 번째 좌표를 입력해 주세요 : ");
            index[0] = scanner.nextInt();
            System.out.println("두 번째 좌표를 입력해 주세요 : ");
            index[1] = scanner.nextInt();

            if (board[index[0]][index[1]].equals("[ ]")) {

                if (turn % 2 == 0) {
                    board[index[0]][index[1]] = "[흑]";
                } else {
                    board[index[0]][index[1]] = "[백]";
                }
            }else{
                    System.out.println("같은 위치에 바둑돌을 놓을 수 없습니다.");
                    turn += 2;
                    continue;
                }
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
            turn++;
            System.out.print("계속 하시겠습니까?(1.계속, 2.그만) : ");
                int x = scanner.nextInt();;
                int y = scanner.nextInt();;


            if(x == 1){
                continue;
            }
            else if(y == 2){
                break;
            }
            else {
                break;
            }

            }

        }
    }
/*
* 사용자에게 계속 하시겠습니까? 1. 계속  2. exit 문 프린팅
* 사용자가 입력할는 문구 만듬
* 1을 선택하면 continue 로 위로 올린다.
* 2를 선택하면 break를 건다
* */