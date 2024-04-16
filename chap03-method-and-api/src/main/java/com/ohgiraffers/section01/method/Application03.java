package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {

        int x = 7000000;
        int y = 800000;
        String str = "강형석";
        int age = 39;
        char ch = '남';
        String str2 = "010-5002-3861";


        Application03 app3 = new Application03();


        int result = app3.plus(x,y);
        System.out.println(result);

        int result01 = app3.subtract(x,y);
        System.out.println(result01);

        long result02 = app3.multiply(x,y);
        System.out.println(result02);

        double result03 = app3.divide(x,y);
        System.out.println(result03);

        String info = app3.myInfo(str,str2,age,ch);
        System.out.println(info);

        System.out.println(app3.myInfo(str,str2,age,ch));

    }

    // 두 수를 더하기 함수
    // 접근제어자, 반환타입, 함수명(매개변수){}
    public int plus(int x, int y){
        int result = x + y;
        return result;
    }
    public int subtract(int x, int y){
        int result01 = x - y;
        return result01;
    }
    public long multiply(int x, int y){
        long result02 = (long)x * y;
        return result02;
    }
    public double divide(int x, int y){
        double result04 = (double)x / y;
        return result04;
    }
    /*
    * myInfo함수를 만들고
    * 이름 : 문자열
    * 나이 : 정수
    * 성별 : 문자
    * 전화번호 : '-'을 포함한 전화번호
    *
    * 위 4개의 자료형을 매개변수로 받아 하나의 문자열로 더하고 main에서 출력해주세요
    * */
    //1. myInfo 함수 만들기
    //2. 매개변수 String name, int age, char gender, String phone
    //3. 매개변수 더하기 String result = name + age + gender + phone
    //4. return result


public String myInfo(String str, String str2,int age, char ch){
    String result05 = "이름 : " + str + ", 나이 : "+ age + ", 성별 : " + ch + ", 전화번호 : " + str2;
    return result05;

    }

}
