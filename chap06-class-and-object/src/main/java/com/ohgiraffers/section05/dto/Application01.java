package com.ohgiraffers.section05.dto;

import java.sql.SQLOutput;
import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        UserDTO user = new UserDTO("id","pwd","쏭",new Date());

        System.out.println(user);

    }
}
