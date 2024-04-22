package com.ohgiraffers.section02.problem1;

public class Application01 {
    public static void main(String[] args) {
        // 다음과 같이 입력시 로직을 추가하였으나 몬스터가 증가하면 그만큼 코드가 늘어나는 문제가 발생함
        Monster drunkTiger = new Monster();
        drunkTiger.name = "드렁큰타이거";
//        drunkTiger.hp = -100;

        System.out.println(drunkTiger.name);
//        System.out.println(drunkTiger.hp);
        // --- 직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.

        Monster monster = new Monster();
        monster.name = "주황버섯";
        monster.setHp(-100);
//        System.out.println(monster.hp);
//        monster.hp = -100;
        System.out.println(monster.getHp());


    }

}
