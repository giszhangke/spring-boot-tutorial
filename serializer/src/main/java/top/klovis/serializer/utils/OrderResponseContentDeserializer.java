package top.klovis.serializer.utils;

import top.klovis.serializer.bean.DTO.content.OrderResponseContent;

/**
 * @program: spring-boot-tutorial
 * @description: OrderResponseContentDeserializer
 * @author: klovis
 * @create: 2018-04-14 11:05
 **/
public class OrderResponseContentDeserializer extends ResponseDeserializer<OrderResponseContent> {
    @Override
    public Class<?> getClazz() {
        return OrderResponseContent.class;
    }
}
