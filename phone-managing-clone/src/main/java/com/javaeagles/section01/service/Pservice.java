package com.javaeagles.section01.service;

import com.javaeagles.section01.dao.Prepository;
import com.javaeagles.section01.dto.PhoneDTO;

import java.util.ArrayList;

public class Pservice {
    private Prepository prepository = new Prepository();

    public String ptest(PhoneDTO phoneDTO){
        if(phoneDTO.getName().equals("")){
            return "이름 입력 실패";
        }
        String test = prepository.ptest(phoneDTO);
        return test;
    }

    public ArrayList ptest1(){
        ArrayList testList = prepository.ptest1();
        return testList;
    }
    public String ptest2(int no){
        String test = prepository.ptest2(no);
        return test;
    }

    public String ptest3(int num, int upDate, String inputData){

        return prepository.ptest3(num, upDate, inputData);

    }


}
