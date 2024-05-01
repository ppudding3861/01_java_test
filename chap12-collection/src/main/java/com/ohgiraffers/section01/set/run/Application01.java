package com.ohgiraffers.section01.set.run;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Objects;

public class Application01 {

    public static void main(String[] args) {


        /*
         * Set 인터페이스를 구현한 set컬렉션 클래스의 특징
         * 1. 요소의 저장 순서를 유지하지 않는다.
         * 2. 같은 요소의 중복 저장을 허용하지 않는다.(nulll값도 중복하지 않게 하나의 null만 저장한다.)
         *
         * HashSET
         * set 컬렛션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
         * jdk 1.2 부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
         * */
        HashSet<String> hset = new HashSet<>();
        hset.add("보통");
        hset.add("강사");
        hset.add("이상우");
        hset.add("이상우");

        System.out.println(hset);

        System.out.println(hset.contains("이상우"));
        System.out.println(hset.size());
        System.out.println(hset);

        Object[] arr =  hset.toArray();
        System.out.println(arr[1]);

        hset.clear();
        System.out.println(hset);

    }
}
