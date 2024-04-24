package com.ohgiraffers.order.dto;

public class OrderDTO {

    private String menuName;

    private int price;

    private int quantity;

    private int totalPrice;



    public OrderDTO(String menuName, int quantity,int price) {

        this.menuName = menuName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = price * quantity;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {

    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice= totalPrice;
    }

    @Override
    public String toString() {
        return "주문내역{" +
                "메뉴이름 = '" + menuName + '\'' +
                ", 수량 = " + quantity +
                ", 가격 = " + price +
                ", 총가격 = " + totalPrice +
                '}';
    }
}
