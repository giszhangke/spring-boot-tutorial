package top.klovis.serializer.bean.DTO.content;

import lombok.Data;

/**
 * @program: spring-boot-tutorial
 * @description: PaymentResponseContent
 * @author: klovis
 * @create: 2018-04-14 10:22
 **/
@Data
public class PaymentResponseContent extends BaseDTOContent {
    private String id;
    private String orderId;
    private String amount;
    private String status;
}
