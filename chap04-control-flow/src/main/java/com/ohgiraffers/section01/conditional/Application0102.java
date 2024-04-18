package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application0102 {
    public static void main(String[] args) {

            //Application0102 app1 = new Application0102();
           // app1.calculate();

        Application0102 app1 = new Application0102();
         app1.call();

    }
    // 1. calculator 메서드를 만든다.
    public String calculate(){
        // 입력 받을 수 있는 기능을 추가한다.
        Scanner sc = new Scanner(System.in);
        // 2. 첫번째 수를 입력받는다.
        int first = sc.nextInt();
        // 3. 두번째 수를 입력받는다.
        int second = sc.nextInt();
        // 4. 연산기호를 입력받는다.
        char operator = sc.nextLine().charAt(0);
        // 5. 연산기호를 확인한다.

        double result;
        if (operator == '+') {
            result = first + second;
        }else if (operator == '-') {
            result = first - second;
        }else if (operator == '*') {
            result = first * second;
        }else if (operator == '/') {
            result = first / second;
        }else{
            return  "연산식 오류";
        }
        return String.valueOf(result);
// return "" + result 해도 반환값변경 가능
        // 6. 연산 진행한다.
        // 7. 반환한다.


    }

    //한번에 연산식 입력받기


    public String call(){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result = 0;
        if(target[1].equals("+")){
           
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            System.out.println(result);
            
        }else if (target[1].equals("-")){
           
            result = Integer.parseInt(target[0]) - Integer.parseInt(target[2]);
            System.out.println(result);

        }else if (target[1].equals("*")){

            result = Integer.parseInt(target[0]) * Integer.parseInt(target[2]);
            System.out.println(result);

        }else if (target[1].equals("/")){
            
            result = Integer.parseInt(target[0]) / Integer.parseInt(target[2]);
            System.out.println(result);

        }
        return "" + result;
    }


}
