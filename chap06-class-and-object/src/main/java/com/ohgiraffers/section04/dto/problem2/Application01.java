package com.ohgiraffers.section04.dto.problem2;

public class Application01 {

    public static void main(String[] args){
        MemberDTO song = new MemberDTO();
        song.setAge(20);
        song.setAddress("인사동");
        song.setGender('여');
        song.setPhone("010-2323-2323");
        song.setName("송재희");

        MemberDTO kim = new MemberDTO();
        kim.setName("김재석");
        kim.setAge(19);
        kim.setGender('남');
        kim.setAddress("고잔동");

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(song);
        memberRepository.addMember(kim);
        memberRepository.print();
    }
}
