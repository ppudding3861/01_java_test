package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application0101 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name =  sc.nextLine();
//        System.out.println(name);

    Application0101 app1 = new Application0101();
    String info = app1.inputInfo();
    System.out.println(info);

    }
    /*
    *
    * 1.intputInfo 함수를 만든다.
    *   접근제어자 반환타입 메서드명(){}
    * 2. 사용자에게 값을 입력 받는다.
    *   Scanner sc = new Scanner();
    * 3. 키 나이 성별 이름을 입력 받아 문자열로 합친다.
    *   double 키;
    *   int 나이;
    *   char 성별;
    *   String 이름;
    * 4. 문자열로 반환한다.
    *   return
    * */

    public String inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 키는 몇인가요? ");
        double height = sc.nextDouble();
        System.out.print("당신의 나이는 몇살인가요? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("당신의 성별은 ? ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("당신의 이름은 ? ");
        String name = sc.nextLine();

        return "당신의 이름은 " + "'"+ name +"'"+ "입니다.\n" + "당신의 나이는 " + "'"+ age + "'" + "입니다.\n" + "당신의 키는 " + "'" + height +"'" + "입니다.\n" + "당신의 성별은 " + "'" + gender +"'" + "입니다.";
    }

}
