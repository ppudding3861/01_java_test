package main.java.com.ohgiraffers.section04.scanner;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        Application01 app1 = new Application01();


        Scanner sc = new Scanner(System.in);
        // sc 변수명 == 메모리주소 == 값

        System.out.print("당신의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("당신의 키를 입력해 주세요 : ");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.println("당신의 성별을 입력해 주세요 : ");
        String gender = sc.nextLine();

        System.out.print("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();

        System.out.println(app1.inputInfo(name, height, gender, age));


    }
/*
* inputInfo 메서드를 만들고
* 사용자의 이름 키 성별 나이를 입력받아 main에서 출력해주세요
* */
    public String inputInfo(String name, double height, String gender, int age){
        return "당신의 이름은 " + name + "입니다. \n" + "당신의 키는 " + height + "입니다.\n" + "당신의 성별은 " + gender +"입니다.\n" +"당신의 나이는 " + age + "입니다.";




    }
}
