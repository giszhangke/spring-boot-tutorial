package top.klovis.serializer.bean.DTO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import top.klovis.serializer.bean.DTO.content.OrderResponseContent;
import top.klovis.serializer.utils.OrderResponseContentDeserializer;

/**
 * @program: spring-boot-tutorial
 * @description: OrderResponseDTO
 * @author: klovis
 * @create: 2018-04-14 10:52
 **/
@Data
public class OrderResponseDTO extends BaseResponseDTO {
    @JsonDeserialize(using = OrderResponseContentDeserializer.class)
    private OrderResponseContent content;
}
