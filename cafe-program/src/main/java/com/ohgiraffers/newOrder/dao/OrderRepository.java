package com.ohgiraffers.newOrder.dao;

import com.ohgiraffers.fakeDB.OrderDB;
import com.ohgiraffers.newOrder.dto.OrderDTO;

public class OrderRepository {
    private final OrderDB orderDB = OrderDB.getInstance();

    public String order(OrderDTO orderDTO){
        //0
        int oldNum = orderDB.getOrders().size();

        orderDB.setItem(orderDTO);

        if(oldNum >= orderDB.getOrders().size()){
            return "등록실패";
        }
        return "등록성공";
    }




}
