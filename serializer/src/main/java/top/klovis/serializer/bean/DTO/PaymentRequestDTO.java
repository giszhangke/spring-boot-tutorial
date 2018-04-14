package top.klovis.serializer.bean.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import top.klovis.serializer.bean.DTO.content.PaymentRequestContent;
import top.klovis.serializer.utils.PaymentRequestContentSerializer;

/**
 * @program: spring-boot-tutorial
 * @description: PaymentRequestDTO
 * @author: klovis
 * @create: 2018-04-14 10:39
 **/
@Data
public class PaymentRequestDTO extends BaseDTO {
    @JsonSerialize(using = PaymentRequestContentSerializer.class)
    private PaymentRequestContent content;
}
