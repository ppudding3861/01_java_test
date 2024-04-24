package com.ohgiraffers.order.controller;

import com.ohgiraffers.Application;
import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController {

    private final OrderService orderService = new OrderService();


    public String order(OrderDTO orderDTO){
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        if(orderDTO.getMenuName().equals("")){
            return "메뉴를 정해주세요";
        }

        if(orderDTO.getQuantity() <= 0){
            return  "수량을 입력해주세요";
        }

        // service 로직으로 넘김
        String result = orderService.order(orderDTO);
        return result;
    }
    public String orderDelete(){
        return "삭제하기";
    }
    public String orderModify(){
        return "수정하기";
    }
    public String orderDetail(){
        return "주문상세조회";
    }

    public String orderRead(){

       orderService.orderRead();
       return orderService.orderRead();


    }


}
