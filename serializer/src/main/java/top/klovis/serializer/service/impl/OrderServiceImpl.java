package top.klovis.serializer.service.impl;

import top.klovis.serializer.bean.DTO.OrderRequestDTO;
import top.klovis.serializer.bean.DTO.OrderResponseDTO;
import top.klovis.serializer.service.OrderService;

/**
 * @program: spring-boot-tutorial
 * @description: OrderServiceImpl
 * @author: klovis
 * @create: 2018-04-14 11:56
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderResponseDTO order(OrderRequestDTO request) {
        request.setCode("200");
        return null;
    }
}
