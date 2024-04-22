package com.ohgiraffers.section03.Application01;

public class Application01 {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0].bookName = "가";
        books[1].bookName = "나";
        books[2].bookName = "다";

        books[0].acter = "저자1";
        books[1].acter = "저자2";
        books[2].acter = "저자3";

        books[0].num = 1;
        books[1].num = 2;
        books[2].num = 3;

        Human humans = new Human();
        humans.name = "강형석";
        humans.book = books[0];
        


    }

}
