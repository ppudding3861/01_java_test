package com.ohgiraffers.section01.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Application02 {

    public static void main(String[] args) {

        /*
        * Properties란?
        * HashMap을 구현하여 사용방법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * */

        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3306/falcon");
        prop.setProperty("user", "falcon");
        prop.setProperty("password","1234");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileOutputStream("driver.txt"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.dat"));
            prop2.list(System.out);

            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("password"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
