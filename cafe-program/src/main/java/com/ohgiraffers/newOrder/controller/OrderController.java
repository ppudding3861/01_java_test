package com.ohgiraffers.newOrder.controller;

import com.ohgiraffers.newOrder.dto.OrderDTO;
import com.ohgiraffers.newOrder.service.OrderService;

public class OrderController {

    private final OrderService orderService = new OrderService();

    public String order(OrderDTO orderDTO){
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.



    }

}
