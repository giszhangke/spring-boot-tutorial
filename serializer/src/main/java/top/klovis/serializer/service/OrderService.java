package top.klovis.serializer.service;

import top.klovis.serializer.bean.DTO.OrderRequestDTO;
import top.klovis.serializer.bean.DTO.OrderResponseDTO;

/**
 * @program: spring-boot-tutorial
 * @description: OrderService
 * @author: klovis
 * @create: 2018-04-14 11:55
 **/
public interface OrderService {
    OrderResponseDTO order(OrderRequestDTO request);
}
