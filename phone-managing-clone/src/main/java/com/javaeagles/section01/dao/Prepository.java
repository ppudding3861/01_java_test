package com.javaeagles.section01.dao;

import com.javaeagles.section01.dto.PhoneDTO;

import java.util.ArrayList;

public class Prepository {

    private final ArrayList<PhoneDTO> tests = new ArrayList<>();

    public String ptest(PhoneDTO phoneDTO){
        int testname = tests.size();
        tests.add(phoneDTO);

        if(testname >= tests.size()){
            return "등록실패";
        }
        return "등록성공";
    }
    public ArrayList ptest1(){
        return tests;
    }

    public String ptest2(int no){
        int testremove = tests.size();
        tests.remove(no);
        if(tests.size() >= testremove){
            return "에 해당되는 이름의 정보가 삭제되지 않았습니다.";
        }
        return "에 해당되는 이름의 정보가 삭제되었습니다.";

    }
    public String ptest3(int num, int upoDate, String inputData){

        PhoneDTO test3 = tests.get(num-1);


        switch (upoDate){
            case 1 :
                test3.setName(inputData);
                break;

            case 2 :
                test3.setPhone(inputData);
                break;

            case 3 :
                test3.setGroup(inputData);
                break;

            case 4 :
                test3.setMemo(inputData);
                break;

            case 5 :
                test3.setEmail(inputData);
                break;

            default:
                return "Error";
        }
        return test3.toString();

    }


}
