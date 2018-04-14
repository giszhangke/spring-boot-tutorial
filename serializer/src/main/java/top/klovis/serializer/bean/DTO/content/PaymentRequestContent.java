package top.klovis.serializer.bean.DTO.content;

import lombok.Data;

/**
 * @program: spring-boot-tutorial
 * @description: PaymentRequestContent
 * @author: klovis
 * @create: 2018-04-14 10:21
 **/
@Data
public class PaymentRequestContent extends BaseDTOContent {
    private String id;
    private String orderId;
    private String amount;
}
