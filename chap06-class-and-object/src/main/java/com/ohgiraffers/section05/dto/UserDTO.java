package com.ohgiraffers.section05.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrolldate;

    // 접근제어자 클래스명 (){}
    // 기본 생성자
    public UserDTO(){}

    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate){

        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrolldate = enrollDate;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrolldate() {
        return enrolldate;
    }

    public void setEnrolldate(Date enrolldate) {
        this.enrolldate = enrolldate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrolldate=" + enrolldate +
                '}';
    }
}
