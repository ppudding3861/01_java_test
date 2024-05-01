package com.javaeagles.section01;

import com.javaeagles.section01.controller.Pcontroller;
import com.javaeagles.section01.dto.PhoneDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pcontroller pcontroller = new Pcontroller();
        int phone1 = 1;
        String test = "";
        String inputData;

        while(phone1 == 1){
            System.out.println("====== 전화번호부(그림) ======");
            System.out.println("1. 전화번호 등록");
            System.out.println("2. 전화번호 수정");
            System.out.println("3. 전화번호 삭제");
            System.out.println("4. 전화번호 전체조회");
            System.out.println("5. 전화번호 상세조회");
            System.out.println("무엇을 도와드릴까요? : ");
            int input = sc.nextInt();
            sc.nextLine();
            switch(input){
                case 1 :
                    System.out.println("이름 : ");
                    String name = sc.nextLine();

                    System.out.println("전화번호 : ");
                    String phone = sc.nextLine();

                    System.out.println("그룹 : ");
                    String group = sc.nextLine();

                    System.out.println("메모 : ");
                    String memo = sc.nextLine();

                    System.out.println("이메일 : ");
                    String email = sc.nextLine();

                    test = pcontroller.ptest(new PhoneDTO(name, phone, group, memo, email));

                    break;
                case 2 :

                    System.out.println("수정할 번호를 입력해 주세요 : ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ex) 1.이름 2.번호 3.그룹 4.메모 5.이메일");
                    int upDate = sc.nextInt();
                    sc.nextLine();
                    System.out.println("수정할 데이터를 입력해주세요.");
                    inputData = sc.nextLine();
                    test = pcontroller.ptest3(num, upDate,inputData);
                    break;

                case 3 :
                    System.out.println("삭제할 번호를 입력해주세요 : ");
                    int no = Integer.parseInt(sc.nextLine());
                    test = no + "번";
                    test += pcontroller.ptest2(no);
                    break;

                case 4 :
                    System.out.println("사용자의 전체 조회입니다.");
                    test = pcontroller.ptest1();
                    break;

                case 5 :
                    break;

                default :
                    System.out.println("잘못 입력 됐습니다.");
                    break;
            }
            System.out.println(test);
            System.out.println("계속 하시겠습니까?");
            phone1 = sc.nextInt();
            sc.nextLine();
        }


    }

}
