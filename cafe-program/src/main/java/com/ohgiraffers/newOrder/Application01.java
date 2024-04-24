package com.ohgiraffers.newOrder;

import com.ohgiraffers.newOrder.controller.OrderController;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();
        boolean order = true;
        String result = "";

        while(order){
            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.println("어떤 메뉴를 동작하시겠나요? ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1 : // 주문등록
                    break;
                case 2 : // 주문삭제
                    break;
                case 3 : // 주문수정
                    break;
                case 4 : // 주문 상세조회
                    break;
                case 5 : // 주문 전체조회
                    break;
                default :
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }
            System.out.println("주문을 종료하시겠나요?");
            order = sc.nextBoolean();
        }
    }
}
