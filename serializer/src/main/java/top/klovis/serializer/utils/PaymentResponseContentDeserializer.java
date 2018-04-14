package top.klovis.serializer.utils;

import top.klovis.serializer.bean.DTO.content.PaymentResponseContent;

/**
 * @program: spring-boot-tutorial
 * @description: PaymentResponseContentDeserializer
 * @author: klovis
 * @create: 2018-04-14 10:54
 **/
public class PaymentResponseContentDeserializer extends ResponseDeserializer<PaymentResponseContent> {
    @Override
    public Class<?> getClazz() {
        return PaymentResponseContent.class;
    }
}
