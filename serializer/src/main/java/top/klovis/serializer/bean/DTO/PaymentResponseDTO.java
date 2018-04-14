package top.klovis.serializer.bean.DTO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import top.klovis.serializer.bean.DTO.content.BaseDTOContent;
import top.klovis.serializer.bean.DTO.content.PaymentResponseContent;
import top.klovis.serializer.utils.PaymentResponseContentDeserializer;

/**
 * @program: spring-boot-tutorial
 * @description: PaymentResponseDTO
 * @author: klovis
 * @create: 2018-04-14 10:53
 **/
@Data
public class PaymentResponseDTO extends BaseDTOContent {
    @JsonDeserialize(using = PaymentResponseContentDeserializer.class)
    private PaymentResponseContent content;
}
