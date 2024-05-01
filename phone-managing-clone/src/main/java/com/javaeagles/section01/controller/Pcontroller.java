package com.javaeagles.section01.controller;

import com.javaeagles.section01.dto.PhoneDTO;
import com.javaeagles.section01.service.Pservice;

import java.util.ArrayList;

public class Pcontroller {

    private Pservice pservice = new Pservice();

    public String ptest(PhoneDTO phoneDTO){

        String test = pservice.ptest(phoneDTO);
        return test;
    }
    public String ptest1(){
        ArrayList testList = pservice.ptest1();
        String test = "사용자의 정보 목록" + testList.toString();
        return test;
    }
    public String ptest2(int no){
        String test = pservice.ptest2(no);
        return test;
    }

    public String ptest3(int num, int upDate, String inputData){

        if(num<=0 && upDate <=0 && inputData.equals("")){
            return "입력값을 넣어주세요";
        }
        return pservice.ptest3(num, upDate, inputData);

    }

}
