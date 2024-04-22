package com.ohgiraffers.section02.problem1;

public class Monster {

    String name;

    private int hp;


    // monster의 hp가 o보다 큰 값만 입력될 수 있또록 하여 버그를 막고자함

    public void setHp(int hp){//sethp 시작

        if(hp > 0) {
            this.hp = hp;
        }else{
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }



    }//sethp 종료
    public int getHp(){
        return this.hp;
    }


}
